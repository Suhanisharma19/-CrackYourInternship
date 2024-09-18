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
    public int getDecimalValue(ListNode head) {
      ListNode current=head;
        int n=0;
        while(current!=null){
            n++;
            current=current.next;
        }
        int sum=0;
        current=head;
        while(current!=null){
            sum=sum+current.val*(int)Math.pow(2,--n);
            current=current.next;
        }
        return sum;
    }
}