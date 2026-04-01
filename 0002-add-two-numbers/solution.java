
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp= new ListNode(0);
        ListNode main=temp;
        int carryis=0;
        while(l1!=null || l2!=null || carryis!=0){
            int sum=carryis;
            if(l1!=null){
                
              sum+=l1.val;
              l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carryis=sum/10;
            main.next=new ListNode(sum%10);
            main=main.next;
        }
        return temp.next;
    }
}
