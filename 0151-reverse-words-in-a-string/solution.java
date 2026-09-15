class Solution {
    public String reverseWords(String s) {
        int x=s.length();
        String[] as=s.trim().split("\\s+");
        StringBuilder a=new StringBuilder();
        for(int i=as.length-1;i>=0;i--){
            a.append(as[i]);
        if(i!=0){
            a.append(" ");
        }}
        return a.toString();
    }
}
