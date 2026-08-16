class Solution {
    public boolean stoneGameIX(int[] stones) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int stone:stones){
            int remainder=stone%3;
            if (remainder == 0) {
                count0++;
            }
            else if (remainder == 1) {
                count1++;
            }
            else {
                count2++;
            }
        }
/*this game general has a conditon easy we can use if 
count0 is even 
and count1 and count2 both are above 0 then alice when or if any one of them failes bobs win

count0 is odd
here count1-count2 is greter then2 then alice wins if not bobs win
only this things are enough to solve the problem remember it*/
        if(count0%2==0){
            return count1>0 && count2>0;
        }
        return Math.abs(count1-count2)>2;
    }
}
