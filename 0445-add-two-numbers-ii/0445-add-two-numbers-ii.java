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
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        // Push all the elements in the stack
        while(list1 != null){
            st1.push(list1.val);
            list1 = list1.next;
        }

        while(list2 != null){
            st2.push(list2.val);
            list2 = list2.next;
        }

        ListNode head = null;
        int carry = 0;

        while(!st1.isEmpty() || !st2.isEmpty() || carry != 0){
            int val1 = (!st1.isEmpty()) ? st1.pop() : 0;
            int val2 = (!st2.isEmpty()) ? st2.pop() : 0;

            int sum = val1 + val2 + carry;

            carry = sum / 10;
            sum = sum % 10;

            ListNode sumNode = new ListNode(sum);
            sumNode.next = head;
            head = sumNode;
        } 

        return head;
    }
    
}

// public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
//     ListNode prev1 = null;
//     ListNode curr1 = list1;

//     while(curr1 != null){
//         ListNode next = curr1.next;
//         curr1.next = prev1;
//         prev1 = curr1;
//         curr1 = next;
//     } 

//     ListNode prev2 = null;
//     ListNode curr2 = list2;

//     while(curr2 != null){
//         ListNode next = curr2.next;
//         curr2.next = prev2;
//         prev2 = curr2;
//         curr2 = next;
//     }

//     ListNode dummy = new ListNode(0);
//     ListNode temp = dummy;

//     int carry = 0;
//     while(prev1 != null || prev2 != null || carry != 0){
//         int val1 = (prev1 != null) ? prev1.val : 0;
//         int val2 = (prev2 != null) ? prev2.val : 0;

//         int sum = val1 + carry + val2;

//         carry = sum /10;
//         sum = sum % 10;

//         ListNode sumNode = new ListNode(sum); 

//         temp.next = sumNode;
//         temp = sumNode;

//         if(prev2 != null){
//             prev2 = prev2.next;
//         }

//         if(prev1 != null){
//             prev1 = prev1.next;
//         }
//     }

//     ListNode prev = null;
//     ListNode curr = dummy.next;

//     while (curr != null) {
//         ListNode next = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = next;
//     }

//     return prev;
// }