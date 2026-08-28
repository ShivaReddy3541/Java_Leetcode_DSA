class Solution {
    public String lexPalindromicPermutation(String s, String target) {

        int n = s.length();
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        char middle = 0;
        int odd = 0;

        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                odd++;
                middle = (char) ('a' + i);
            }
        }

        if (odd > 1) {
            return "";
        }

        int half = n / 2;

        int[] halfCount = new int[26];

        for (int i = 0; i < 26; i++) {
            halfCount[i] = count[i] / 2;
        }

        // First try making the left half equal to target's left half
        int[] temp = halfCount.clone();
        boolean possible = true;

        for (int i = 0; i < half; i++) {

            int x = target.charAt(i) - 'a';

            if (temp[x] == 0) {
                possible = false;
                break;
            }

            temp[x]--;
        }

        if (possible) {

            StringBuilder left = new StringBuilder();

            for (int i = 0; i < half; i++) {
                left.append(target.charAt(i));
            }

            StringBuilder ans = new StringBuilder();

            ans.append(left);

            if (middle != 0) {
                ans.append(middle);
            }

            for (int i = left.length() - 1; i >= 0; i--) {
                ans.append(left.charAt(i));
            }

            if (ans.toString().compareTo(target) > 0) {
                return ans.toString();
            }
        }
        for (int change = half - 1; change >= 0; change--) {

            temp = halfCount.clone();
            possible = true;

            for (int i = 0; i < change; i++) {

                int x = target.charAt(i) - 'a';

                if (temp[x] == 0) {
                    possible = false;
                    break;
                }

                temp[x]--;
            }

            if (!possible) {
                continue;
            }

            int targetChar = target.charAt(change) - 'a';

            for (int c = targetChar + 1; c < 26; c++) {

                if (temp[c] == 0) {
                    continue;
                }

                temp[c]--;

                StringBuilder left = new StringBuilder();

                for (int i = 0; i < change; i++) {
                    left.append(target.charAt(i));
                }

                left.append((char) ('a' + c));

                for (int x = 0; x < 26; x++) {
                    while (temp[x] > 0) {
                        left.append((char) ('a' + x));
                        temp[x]--;
                    }
                }

                StringBuilder ans = new StringBuilder();

                ans.append(left);

                if (middle != 0) {
                    ans.append(middle);
                }

                for (int i = left.length() - 1; i >= 0; i--) {
                    ans.append(left.charAt(i));
                }

                if (ans.toString().compareTo(target) > 0) {
                    return ans.toString();
                }
            }
        }

        return "";
    }
}
