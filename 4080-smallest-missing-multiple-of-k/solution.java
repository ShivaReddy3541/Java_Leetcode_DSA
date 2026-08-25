class Solution {
    public int missingMultiple(int[] nums, int k) {
    HashSet<Integer> hs=new HashSet<>();
    for(int num:nums){
hs.add(num);
    }
    int ans=k;
    
    while(hs.contains(ans)){
        ans+=k;
    }
return ans;
    
    }
}
