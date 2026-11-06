
import java.util.Random;

class Solution {

    ListNode head;
    int size = 0;
    Random random = new Random();

    public Solution(ListNode head) {

        this.head = head;

        ListNode temp = head;

        // Calculate linked list size
        while(temp != null) {
            size++;
            temp = temp.next;
        }
    }

    public int getRandom() {

        // Generate random index
        int randomIndex = random.nextInt(size);

        ListNode temp = head;

        // Traverse to random index
        for(int i = 0; i < randomIndex; i++) {
            temp = temp.next;
        }

        return temp.val;
    }
}
