class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int[] sh = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sh[s.charAt(i) - 'a']++;
        }
        char[] an = new char[target.length()];
        int matched=0;
        for (int i = 0; i < target.length(); i++) {
            int present= target.charAt(i) - 'a';
            if (sh[present] > 0) {
                an[i] = target.charAt(i);
                sh[present]--;
                matched++;
            } 
            else {
                for (int j = present + 1; j < 26; j++) {
                    if (sh[j] > 0) {
                        an[i] = (char) ('a' + j);
                        sh[j]--;
                        int in = i + 1;
                        for (int k = 0; k < 26; k++) {
                            while (sh[k] > 0) {
                                an[in] = (char) ('a' + k);
                                in++;
                                sh[k]--;
                            }
                        }
                        return new String(an);
                    }
                }
                break;
            }
        }
        for (int i = matched - 1; i >= 0; i--) {
            int present = an[i] - 'a';
            sh[present]++;
            for (int j = present + 1; j < 26; j++) {
                if (sh[j] > 0) {
                    an[i] = (char) ('a' + j);
                    sh[j]--;
                    int in = i + 1;
                    for (int k = 0; k < 26; k++) {
                        while (sh[k] > 0) {
                            an[in] = (char) ('a' + k);
                            in++;
                            sh[k]--;
                        }
                    }
                    return new String(an);
                }
            }
        }

        return "";
    }
}
