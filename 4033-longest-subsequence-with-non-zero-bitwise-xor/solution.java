class Solution {
    public int longestSubsequence(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1]==0){
            return 0;
        }
        int count=1;
        int output=nums[0];
        for(int i=1;i<nums.length;i++){
            output=output^nums[i];
            count++;
        }
        if(output==0){
       return nums.length-1; // beauty of xor it is that sum of all elements xor is == 0 then automatically by removing one element from it 100% for sure gives the answer which is non zero
        }
return count;
    }
}
