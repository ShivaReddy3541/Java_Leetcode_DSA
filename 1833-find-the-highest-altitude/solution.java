class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int a = 0;

        for(int i = 0; i < gain.length; i++) {
            a = a + gain[i];
            highest = Math.max(highest, a);
        }

        return highest;
    }
}
