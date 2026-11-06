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

    ListNode head;
    int size = 0;
    public Solution(ListNode head) {
        this.head = head;

        // real will not lose it is reference head from parameter

        while(head != null){
            head = head.next;
            this.size++;
        }

    }
    
    public int getRandom() {
        int randomNum = (int)(Math.random() * this.size);

        ListNode temp = this.head;

        for(int i = 0;i<randomNum;i++){
            temp = temp.next;
        }

        return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */