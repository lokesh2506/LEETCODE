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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        // move the fast only for the head start
        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }

        if(prev == null && slow.next == null){
            head = null;
        }else if(prev == null && slow.next != null){
            head = slow.next;
        }else{
            prev.next = prev.next.next;
        }

        return head;
    }
}