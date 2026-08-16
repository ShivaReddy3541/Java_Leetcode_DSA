class Solution {
    public int maximumGap(String skill, String station) {

        int a = skill.length();
        int b = station.length();
          int x = 0;
        int[] l = new int[a];
        int[] r = new int[a];
      
        for (int i = 0; i < a; i++) {

            while (station.charAt(x) != skill.charAt(i)) {
                x++;
            }

            l[i] = x;
            x++;
        }

        x = b - 1;

        for (int i = a - 1; i >= 0; i--) {

            while (station.charAt(x) != skill.charAt(i)) {
                x--;
            }

            r[i] = x;
            x--;
        }
        int ans = 0;

        for (int i = 1; i < a; i++) {
            ans = Math.max(ans, r[i] - l[i - 1]);
        }
        return ans;
    }
}
