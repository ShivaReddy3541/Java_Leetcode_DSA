class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0]; 
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        String[] arr=new String[candies.length];
        for(int i=0;i<candies.length;i++){
            if(extraCandies+candies[i]>=max){
arr[i]="true";
            }else{arr[i]="false";
        }}
       List<Boolean> result = new ArrayList<>();
for (int i = 0; i < arr.length; i++) {
    result.add(Boolean.parseBoolean(arr[i])); 
}
return result;
    }
}
