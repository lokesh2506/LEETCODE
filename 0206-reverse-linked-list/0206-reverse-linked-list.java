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
    public ListNode reverseList(ListNode head) {
        // u need 3 thing prev curr next

        ListNode prev = null;  
        ListNode curr = head;  // 1

        while(curr != null){
            ListNode next = curr.next;  // 2
            // 1 -> 2
            curr.next = prev; 
            // null <- 1
            prev = curr; // 1
            curr = next; // 2
        }

        return prev;
    }
}