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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curr = head;

        int index = 0;
        while(list1 != null){
            if(index== a){
                // connect the current to the 
                curr.next = list2;

                while(curr.next != null){
                    curr = curr.next; 
                    // it will itertate through the last element of the list2
                }

                // move the list1 to connect to curr
                while(index <= b){
                    list1 = list1.next;
                    index++;
                }

                curr.next = list1;
                break;

            }else{
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
                index++;
            }
        }
        return head.next;
    }
}