class Solution {
    public boolean sumGame(String num) {
        int leftsidesum=0;
        int rightsidesum=0;
        int leftsidequestion=0;
        int rightsidequestion=0;
int n=num.length();
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                leftsidequestion++;
            }
            else{
                leftsidesum+=num.charAt(i)-'0';
            }}
            for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                rightsidequestion++;
            }
            else{
                rightsidesum+=num.charAt(i)-'0';
            }
        }
        if((leftsidequestion+rightsidequestion)%2!=0){
            return true;
        }
        return ((2*leftsidesum+9*leftsidequestion)!=(2*rightsidesum+9*rightsidequestion));
    }
}
