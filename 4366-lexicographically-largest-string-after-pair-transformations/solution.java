class Solution {
    public String[] largestString(int[] nums) {

        String[] ans = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];
            StringBuilder s = new StringBuilder();

            while (n > 0) {

                int value = 1;
                int level = 0;

                while (value * 2 <= n && level < 25) {
                    value *= 2;
                    level++;
                }

                s.append((char)('a' + level));
                n -= value;
            }

            ans[i] = s.toString();
        }

        return ans;
    }
}
