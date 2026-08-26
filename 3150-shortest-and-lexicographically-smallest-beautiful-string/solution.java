class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String result="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                int onescount=0;
                for(int a=i;a<=j;a++){
                    if(s.charAt(a)=='1'){
                        onescount++;
                    }
                    }
                    if(onescount==k){
                        String substrings=s.substring(i,j+1);
                    if(result.equals("") || result.length()>substrings.length()){
                        result=substrings;
                    }else if(result.length()==substrings.length() && substrings.compareTo(result)<0){
                        result=substrings;
                    }
                    
                }
            }
        }
        return result;
    }
}
