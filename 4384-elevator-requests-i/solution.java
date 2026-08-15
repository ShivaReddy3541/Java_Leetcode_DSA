class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int initial=0;
        int add=0;
        for(int i=0;i<requests.length;i++){
            add+=Math.abs(initial-requests[i]);
            initial=requests[i];
        }
        return add;
    }
}
