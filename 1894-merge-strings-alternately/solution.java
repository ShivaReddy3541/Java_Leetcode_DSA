class Solution {
    public String mergeAlternately(String word1, String word2) {
    int n = Math.max(word1.length(), word2.length());
String result="";
for(int i=0;i<n;i++){
if(word1.length()-1>=i){
char c=word1.charAt(i);
result+=c;
}
if(word2.length()-1>=i){
   char ch=word2.charAt(i);
result+=ch; 
}
}
                
        return result;
    }
}
