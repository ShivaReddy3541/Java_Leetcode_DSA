import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        // 1. Quick check for a single item
        if (nums.length == 1) {
            return nums[0]; // Returns the first integer element
        }
        
        // 2. Count the frequencies of each number
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i], 1);
            }
        }
       
        // 3. Find the one that appears only once
        for (int j = 0; j < nums.length; j++) {
            if (mp.get(nums[j]) == 1) {
                return nums[j];
            }
        }
        return -1;
    }
}

