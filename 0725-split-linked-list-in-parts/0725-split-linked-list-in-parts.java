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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;

        // 1 : count the length
        int length = 0;

        while(temp != null){
            length++;
            temp = temp.next;
        }

        // 2 : size for split
        int size = length / k;
        int extra = length % k;

        ListNode [] ans = new ListNode[k];
        temp = head;


        // 3 : split the node and store in the array
        for(int i=0;i<k;i++){
            ans[i] = temp;

            int parts = size;
            if(extra > 0){
                parts++;
                extra--;
            }


            // j starts with 1 bcoz we alread added arr[i] = temp
            for(int j=1;j<parts;j++){
                if(temp != null){
                    temp = temp.next;
                }
            }

            // disconect the temp for next iteration
            if(temp != null){
                ListNode newTemp = temp.next;
                temp.next = null;
                // break the previously added cycle arr[i]
                temp = newTemp;
            }
        }

        return ans;
    }
}