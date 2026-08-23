class Solution {
    public boolean isPalindromic(String s) {
        String binarysum="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = (int) c; 
           String binary = Integer.toBinaryString(ascii);
            while (binary.length() < 8) {
                binary = "0" + binary;
            }
            binarysum+=binary;
        }
             int left = 0;
        int right = binarysum.length() - 1;

        while (left < right) {
            if (binarysum.charAt(left) != binarysum.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
    }

