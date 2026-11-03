/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        //4 1 1 9
        node.next = node.next.next;
        // 1 point 1 if we do node.next
        // 1 point 9 node.next.next
    }
}