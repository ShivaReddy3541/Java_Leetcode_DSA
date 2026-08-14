import java.util.*;
class Solution {
    public int maximumLengthSubstring(String s) {
     HashMap<Character , Integer> mp=new HashMap<>();
     int lft=0;
       int maxlength=0;
     for(int rght=0;rght<s.length();rght++){
      char c=s.charAt(rght);
      mp.put(c,mp.getOrDefault(c,0)+1);
     
     while (mp.get(c) > 2) {
    char lftcr = s.charAt(lft);
    mp.put(lftcr, mp.get(lftcr) - 1);
    lft++;
     }
int legnth=rght-lft+1;
   
     maxlength=Math.max(maxlength,legnth);
     }
     return maxlength;

    }
}
