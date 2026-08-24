class Solution {
    public int stoneGameVIII(int[] stones) {
    int c=stones.length;
    if(c==2){
        return stones[0]+stones[1];
        }
    
        for(int i=1;i<c;i++){
            stones[i]=stones[i]+stones[i-1];
        }
  int ans=  stones[c-1];
  for(int i=c-2;i>=1;i--){
    ans=Math.max(ans,stones[i]-ans);
  }
  return ans;
}
}
