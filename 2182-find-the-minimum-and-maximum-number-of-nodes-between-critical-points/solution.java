/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode last=head;
        ListNode present=head.next;
        int positions=1;
        int minimum=Integer.MAX_VALUE;;
        int maximum=-1;
        int current=-1;
        int lastone=-1;
        while(present.next!=null){
if ((present.val > last.val && present.val > present.next.val) ||
    (present.val < last.val && present.val < present.next.val)) {
     if (current == -1) {
                    current = positions;
}else{
    minimum=Math.min(minimum,positions-lastone);
}
lastone=positions;}
            last = present;
            present = present.next;
            positions++;
        }

        if (current == lastone) {
            return new int[]{-1, -1};
        }

maximum=lastone-current;
            return new int[]{minimum, maximum};
        }
    
}
