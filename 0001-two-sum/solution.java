class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map= new HashMap<>();
        for(int a=0;a<nums.length;a++){
int morevalue=target-nums[a];
if(map.containsKey(morevalue)){
    return new int[]{map.get(morevalue),a};
    }map.put(nums[a],a);
}return new int[]{};
        }
    
}
