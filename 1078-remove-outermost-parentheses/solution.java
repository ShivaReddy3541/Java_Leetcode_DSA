class Solution {
    public String removeOuterParentheses(String s) {

        String ans = "";
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                if (depth > 0) {
                    ans += "(";
                }

                depth++;
            } 
            else {

                depth--;

                if (depth > 0) {
                    ans += ")";
                }
            }
        }

        return ans;
    }
}
