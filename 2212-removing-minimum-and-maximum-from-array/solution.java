class Solution {
    public int minimumDeletions(int[] nums) {
        int x=nums.length;
        int minindex=0;
        int maxindex=0;
        for(int i=1;i<x;i++){
if(nums[i]<nums[minindex]){
    minindex=i;
}
if(nums[i]>nums[maxindex]){
    maxindex=i;
}
        }
        int starting=Math.min(minindex,maxindex);
        int ending=Math.max(minindex,maxindex);

int fromfront = ending + 1;
int fromback = x - starting;
int frommiddle = (starting + 1) + (x - ending);
int resulthalf=Math.min(fromfront,fromback);
        int answer=Math.min(resulthalf,frommiddle);
        return answer;
    }
}
