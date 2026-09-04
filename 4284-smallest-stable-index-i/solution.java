class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] mini=new int[nums.length];
mini[nums.length-1]=nums[nums.length-1];
for(int i=nums.length-2;i>=0;i--){
    mini[i]=Math.min(nums[i],mini[i+1]);
}
int maxi=nums[0];
for(int i=0;i<nums.length;i++){
    maxi=Math.max(maxi,nums[i]);
    if(maxi-mini[i]<=k){
        return i;
    }
}
return -1;}
}
