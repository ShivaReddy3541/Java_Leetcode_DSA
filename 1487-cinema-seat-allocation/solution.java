class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer ,HashSet<Integer>> hm=new HashMap<>();
        for(int[] places:reservedSeats){
           int row= places[0];
           int col= places[1];

           if(!hm.containsKey(row)){
            hm.put(row,new HashSet<>());
           }
            hm.get(row).add(col);
        }

        int result = 0;

        // Rows having reservations
        for (int rowss : hm.keySet()) {

            HashSet<Integer> seats = hm.get(rowss);

            boolean left = !seats.contains(2)
                         && !seats.contains(3)
                         && !seats.contains(4)
                         && !seats.contains(5);

            boolean middle = !seats.contains(4)
                           && !seats.contains(5)
                           && !seats.contains(6)
                           && !seats.contains(7);

            boolean right = !seats.contains(6)
                          && !seats.contains(7)
                          && !seats.contains(8)
                          && !seats.contains(9);

            if (left && right) {
                result += 2;
            }
            else if (left || middle || right) {
                result += 1;
            }
            else {
                result += 0;
            }
        }

        // Rows without any reservations
        int Rowss = n - hm.size();

        result += Rowss * 2;

        return result;
    }
}
