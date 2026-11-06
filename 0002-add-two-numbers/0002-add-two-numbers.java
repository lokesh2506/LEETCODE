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

        int carry = 0;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(list1 != null || list2 != null || carry !=0 ){
            int val1 = (list1 != null) ? list1.val : 0;
            int val2 = (list2 != null) ? list2.val : 0;

            int sum = val1 + val2 + carry;

            carry = sum / 10;
            sum = sum % 10;

            ListNode sumNode = new ListNode(sum);

            temp.next = sumNode;
            temp = sumNode;

            if(list1 != null){
                list1 = list1.next;
            }

            if(list2 != null){
                list2 = list2.next;
            }
        }

        return dummy.next;

    }
}


// public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
//     if(list1 == null ){
//         return list2;
//     }

//     if(list2 == null ){
//         return list1;
//     }


//     int carry = 0;
//     ListNode dummy = new ListNode(0);
//     ListNode temp = dummy;

//     while(list1 != null && list2 != null){
//         int sum = list1.val + list2.val + carry;

//         carry = sum / 10;
//         sum = sum % 10;

//         ListNode sumNode = new ListNode(sum);

//         temp.next = sumNode;
//         temp = sumNode;

//         list1 = list1.next;
//         list2 = list2.next;
//     }

//     while(list1 == null && list2 != null){
//         if(carry == 0){
//             temp.next = list2;
//             break;
//         }

//         int sum = carry + list2.val;

//         carry = sum / 10;
//         sum = sum % 10;

//         ListNode sumNode = new ListNode(sum);

//         temp.next = sumNode;
//         temp = sumNode;

//         list2 = list2.next;
//     }

//     while(list2 == null && list1 != null){
//         if(carry == 0){
//             temp.next = list1;
//             break;
//         }

//         int sum = carry + list1.val;

//         carry = sum / 10;
//         sum = sum % 10;

//         ListNode sumNode = new ListNode(sum);

//         temp.next = sumNode;
//         temp = sumNode;

//         list1 = list1.next;
//     }

//     if(carry > 0){
//         ListNode carryNode = new ListNode(carry);

//         temp.next = carryNode;
//         temp = carryNode;
//     }

//     return dummy.next;

// }