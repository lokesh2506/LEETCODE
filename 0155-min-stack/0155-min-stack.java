class MinStack {

    private class Node{
        int data;
        int min;
        Node next;

        private Node(int data,int min,Node next){
            this.data = data;
            this.min = min;
            this.next = next;
        }
    }

    private Node head;

    public MinStack() {
        
    }
    
    public void push(int value) {
        if(head == null){
            head = new Node(value, value,null);
        }else{
            head = new Node(value, Math.min(head.min, value), head);
            // this head connect with old head
        }
    }
    
    public void pop() {
        if(head == null){
            return;
        }
        
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */