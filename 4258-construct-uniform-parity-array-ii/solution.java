class Solution {

    public boolean uniformArray(int[] nums1) {

        int minodd = Integer.MAX_VALUE;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] % 2 != 0) {
                minodd = Math.min(minodd, nums1[i]);
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            if (minodd == Integer.MAX_VALUE) {
    return true;
}
            else if (nums1[i] < minodd && nums1[i] % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}
