class Solution {
    public int findPeakElement(int[] nums) {
        int highest=nums[0];
        int id=0;
       for(int i=1;i<nums.length;i++){
   if(nums[i]>highest){
    highest=nums[i];
       id=i;
   }
       }
       
       return id;
    }
}
