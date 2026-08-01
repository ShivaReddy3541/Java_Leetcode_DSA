class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expected=n*(n+1)/2;
        int actualsum=0;
        for(int dgits:nums){
             actualsum+=dgits;
        }
        return expected-actualsum;
    }
}
