class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=new String[s.length()];
        arr=s.trim().split("\s");
        int count=0;
        String word=arr[arr.length-1];
        for(int i=0;i<word.length();i++){
            count++;
        }
        return count;
    }
}
