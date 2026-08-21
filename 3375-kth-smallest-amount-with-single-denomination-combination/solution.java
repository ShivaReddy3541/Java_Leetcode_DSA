class Solution {
    public long findKthSmallest(int[] coins, int k) {
        long l = 1;
        long h = (long) coins[0] * k;
        for (int i = 0; i < coins.length; i++) {
            h = Math.min(h, (long) coins[i] * k);
        }
        while (l < h) {
            long mid = (l + h) / 2;
           long count = 0;
int n = coins.length;
for (int mask = 1; mask < (1 << n); mask++) {
    long common = 1;
    int selected = 0;
    boolean possible = true;
    for (int i = 0; i < n; i++) {
        if ((mask & (1 << i)) != 0) {
            selected++;
            common = lcmmm(common, coins[i]);

            if (common > mid) {
                possible = false;
                break;
            }
        }
    }

    if (!possible) {
        continue;
    }
    long current = mid / common;
    if (selected % 2 == 1) {
        count += current;
    } else {
        count -= current;
    }
}   
            if (count < k) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }
    public long gcddd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public long lcmmm(long a, long b) {
 return (a / gcddd(a, b)) * b;
    }
}
