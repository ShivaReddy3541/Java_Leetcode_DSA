class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int reversedone=0;
        int correct=x;
        while(x!=0){
            int lastdgit=x%10;
reversedone=reversedone * 10 + lastdgit;
x=x/10;
        }
        return reversedone==correct;

    }
}
