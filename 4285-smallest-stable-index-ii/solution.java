class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] rightmin=new int[n];
        rightmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightmin[i]=Math.min(nums[i],rightmin[i+1]);
        }
        int maximin=nums[0];
        for(int i=0;i<n;i++){
maximin=Math.max(maximin,nums[i]);
        if(maximin-rightmin[i]<=k){
            return i;
        }
        }
        return -1;
    }
}
