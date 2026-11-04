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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        // step 1 : find the length
        ListNode temp = head;

        int size = 1;
        while(temp.next != null){ // temp.next bcoz we need to connect it as cycle 
            temp = temp.next;     // if temp == null i  cant connect temp = head temp is null
            size++;
        }

        // step 2  calculate the rotation
        k = k % size; // avoid unnecessary rotation
        if(k==0){
            return head;
        }

        // step 3 make the list as cycle connect head and tail for rotation
        temp.next = head;

        // step 4 : Assign a new tail
        ListNode tail = head;
        for(int i=1 ;i< size - k;i++){
            tail = tail.next;
        }

        // step 5 Assign a new head  and make a last node null after tail
        ListNode newHead = tail.next; 

        tail.next = null; // cycle will break

        return newHead;

    }
}