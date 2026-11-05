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
    public void reorderList(ListNode head) {
        if(head == null && head.next == null) return;
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next; // slow poiting to the middle node we need to reverse the node after 
        slow.next = null; // we cut the linkage of the slow

        ListNode prev = null;
        ListNode curr = second;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        ListNode temp = head;
        ListNode revTemp = prev;

        while(revTemp != null){
            ListNode nextTemp = temp.next;
            ListNode nextRevTemp = revTemp.next;

            temp.next = revTemp;
            revTemp.next = nextTemp;

            temp = nextTemp;
            revTemp = nextRevTemp;
        }

    }
}