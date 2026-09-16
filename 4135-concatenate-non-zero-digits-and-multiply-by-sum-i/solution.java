class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
       String xs= Integer.toString(n);
        String x="";
        for(int i = 0; i < xs.length(); i++) {
    char c = xs.charAt(i);
    if(c != '0') {
        x += c;
        sum += c - '0';
    }
}if(x.length() == 0) {
    return 0;
}
long number = Long.parseLong(x);
return number*sum;
    }
}
