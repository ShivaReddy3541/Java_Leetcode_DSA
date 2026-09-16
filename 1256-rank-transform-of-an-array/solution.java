class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for(int i = 0; i < sorted.length; i++) {

            if(!map.containsKey(sorted[i])) {
                map.put(sorted[i], rank);
                rank++;
            }
        }

        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            answer[i] = map.get(arr[i]);
        }

        return answer;
    }
}
