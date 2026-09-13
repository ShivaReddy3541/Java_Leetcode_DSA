class Solution {
    public String reverseVowels(String s) {
        StringBuilder vowels=new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='I'||c=='E'||c=='A'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
vowels.append(c);
            }
        }
for(int i=vowels.length()-1; i>=0; i--){
    reverse.append(vowels.charAt(i));
}
  for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='I'||c=='E'||c=='A'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
answer.append(reverse.charAt(j));
j++;
            }else{
            answer.append(s.charAt(i));
            }
  }
            return answer.toString();
    }
}
