class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> sh=new HashMap<Character,Integer>();
        sh.put('M',1000);
         sh.put('D',500);
          sh.put('C',100);
           sh.put('L',50);
            sh.put('X',10);
             sh.put('V',5);
              sh.put('I',1);
        int r=0;
                int len=s.length();
for(int i=0;i<len;i++){
    int present=sh.get(s.charAt(i));
    if(i+1<len && present<sh.get(s.charAt(i+1))){
        r=r-present;
    }else{
        r=r+present;
    }
}
        return r;
    }
}
