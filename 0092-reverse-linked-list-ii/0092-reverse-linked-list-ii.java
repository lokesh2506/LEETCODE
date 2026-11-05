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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;

        ListNode temp = head;
        ListNode before = null;

        int index = 1; //starting from the first position

        //loop till temp reaches the left
        while(index < left){
            before = temp;
            temp = temp.next;
            index++;
        }

        // Reverse part
        ListNode tail = temp; // tail of the reverse Node // 2 
        ListNode prev = null; // afte loop 4
        ListNode curr = temp; // after while loop 5

        while(index <= right){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            index++;
        }


        // Reconnect the cycle
        tail.next = curr; /// 2 -> 5

        if(before == null){
            head = prev;
        }else{
            before.next = prev;
        }

        return head;
    }
}