class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==1){
            HashMap<Integer , Integer> hm=new HashMap<>();
            for(int num:nums){
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
int max=-1;
for(int i=0;i<n;i++){
    int shiv=hm.get(nums[i]);
    if(shiv==1){
        max=Math.max(max,nums[i]);

    }
}
            return max;
        }

        if(k==n){
           int max=-1;
                for(int i=0;i<n;i++){
                    max=Math.max(max,nums[i]);
                }
                return max;
        }

        int st=nums[0];
        int ed=nums[n-1];
        if(st==ed){
            return -1;
        }
        
        for(int i=1;i<n-1;i++){
   if(st==nums[i]){
    st=-1;
   }
   if(ed==nums[i]){
    ed=-1;
   }
        }
return Math.max(st,ed);
        }
    
}
