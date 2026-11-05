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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        ListNode even = head;
        ListNode odd = head.next;

        while(even != null && odd != null){
            ListNode newPair = odd.next; // avoid the even and odd cycle

            temp.next = odd;// 2->3->4
            odd.next = even; // 2 -> 1->2-> 3->4
            even.next = newPair; // 1->3->4

            // move the temp 
            temp = even; // null -> 2 -> 1-temp  -> 3->4

            //move the pointers
            even = newPair; //even = even.next;

            if(even != null){
                odd = even.next;
            }

        }

        return dummy.next;
    }
}