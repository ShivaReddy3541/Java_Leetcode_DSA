class Solution {

    int[][] ap;
    int[] prefixsum;

    // Finds the maximum score Alice can get
    // from index left to index right
    int stoneGame(int left, int right) {

        // Only one stone is left.
        // Alice cannot divide it anymore.
        if (left >= right) {
            return 0;
        }

        // If we already calculated this range,
        // simply return the stored answer.
        if (ap[left][right] != -1) {
            return ap[left][right];
        }

        int bestScore = 0;

        // Try every possible place to divide
        for (int k = left; k < right; k++) {

            // Sum of left part: left ... k
            int leftSum = prefixsum[k + 1] - prefixsum[left];

            // Sum of right part: k+1 ... right
            int rightSum = prefixsum[right + 1] - prefixsum[k + 1];

            // Left side is smaller.
            // Bob throws away the right side.
            // Alice keeps left side and gets its sum.
            if (leftSum < rightSum) {

                int score = leftSum + stoneGame(left, k);

                bestScore = Math.max(bestScore, score);
            }

            // Right side is smaller.
            // Bob throws away the left side.
            // Alice keeps right side and gets its sum.
            else if (rightSum < leftSum) {

                int score = rightSum + stoneGame(k + 1, right);

                bestScore = Math.max(bestScore, score);
            }

            // Both sides have equal sum.
            // Alice can choose either side.
            else {

                int leftScore =
                        leftSum + stoneGame(left, k);

                int rightScore =
                        rightSum + stoneGame(k + 1, right);

                int score = Math.max(leftScore, rightScore);

                bestScore = Math.max(bestScore, score);
            }
        }

        // Save the answer for this range
        ap[left][right] = bestScore;

        return bestScore;
    }


    public int stoneGameV(int[] stoneValue) {

        int n = stoneValue.length;

        // prefix[i] = sum of first i elements
        //
        // Example:
        // stoneValue = [6,2,3,4]
        //
        // prefix = [0,6,8,11,15]
        prefixsum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixsum[i + 1] =
                    prefixsum[i] + stoneValue[i];
        }

        // dp[left][right] stores the maximum score
        // Alice can get from stoneValue[left...right]
        ap = new int[n][n];

        // Initially -1 means:
        // "We haven't calculated this range yet."
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ap[i][j] = -1;
            }
        }
        return stoneGame(0, n - 1);
    }
}
