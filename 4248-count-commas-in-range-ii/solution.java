class Solution {
    public long countCommas(long n) {
    long totalcomas=0;
    long base=1000;
    while(n>=base){
        totalcomas+=(n-base+1);
        base*=1000;
    }return totalcomas;
            }
}
