class Solution {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (nums[middle] > target) {
                last = middle - 1;
            }
            else if (nums[middle] == target) {
                return middle;
            }
            else {
                first = middle + 1;
            }
        }
        return first;
    }
}
