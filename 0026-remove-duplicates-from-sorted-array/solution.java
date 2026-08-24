class Solution {
    public int removeDuplicates(int[] nums) {
        int x=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[j-1]){
nums[x]=nums[j];
   x++; 
            }
        
        }
        return x;
    }
}
