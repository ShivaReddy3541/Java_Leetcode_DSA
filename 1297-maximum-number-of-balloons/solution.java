class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hs = new HashMap<>();

for(int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);

    hs.put(c, hs.getOrDefault(c, 0) + 1);
}
 int b = hs.getOrDefault('b', 0);
        int a = hs.getOrDefault('a', 0);
        int l = hs.getOrDefault('l', 0);
        int o = hs.getOrDefault('o', 0);
        int n = hs.getOrDefault('n', 0);
        int answer=b;
        answer=Math.min(answer,a);
          answer=Math.min(answer,l/2);
            answer=Math.min(answer,o/2);
              answer=Math.min(answer,n);
              return answer;
    }
}
