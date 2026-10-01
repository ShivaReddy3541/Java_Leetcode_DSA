class Solution {
    public int[] maxDepthAfterSplit(String seq) {
       int n=seq.length();
       int depth=0;
       int[] ans=new int[n]; 
       for(int i=0;i<n;i++){
        char c = seq.charAt(i);
            
            if (c == '(') {
        depth++;
        ans[i] = depth % 2;
       }else{
        ans[i] = depth % 2;
        depth--;
       }
    }return ans;}
}
