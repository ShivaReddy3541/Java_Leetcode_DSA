class Solution {
    public int maxValidSplits(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int remove = -1; remove < n; remove++) {
            int count = 0;
            int leftGcd = 0;
            int[] suffix = new int[n + 1];
            suffix[n] = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (i == remove)
                    suffix[i] = suffix[i + 1];
                else
                    suffix[i] = gcd(nums[i], suffix[i + 1]);
            }

            for (int i = 0; i < n - 1; i++) {
                if (i == remove)
                    continue;

                leftGcd = gcd(leftGcd, nums[i]);

                int rightStart = i + 1;

                if (rightStart == remove)
                    rightStart++;

                if (rightStart >= n)
                    continue;

                if (leftGcd == suffix[rightStart])
                    count++;
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
