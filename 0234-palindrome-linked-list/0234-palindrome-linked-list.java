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
    public boolean isPalindrome(ListNode head) {
        if(head == null ) return false;

        if(head.next == null) return true; // [1] it is palindrome

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // slow is in the middle now 
        ListNode curr = slow;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        // compare the left and right halves are equal
        ListNode left = head;
        ListNode right = prev;  // it is the reversed linked list

        while(right!= null){ // travers till end of the right becoz it is the shortest
            if(left.val != right.val){
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }
}