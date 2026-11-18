class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        // 1 2 3 4 5    -> 1 2 3 4 
        // remove all the element in the queue except tha last 

        while(q1.size() > 1){
            q2.offer(q1.poll());
            // remove from the q1 and add in the q2
        }

        int top = q1.poll();

        // Add all the element back to the q2 -> q1
        Queue<Integer> temp = q1; // now q1 is empty;
        q1 = q2;
        q2 = temp; // making a q2 Empty

        return top;
    }
    
    public int top() {
        while(q1.size() > 1){
            q2.offer(q1.poll());
        }

        int top = q1.peek();

        // add the top back to the q2
        q2.offer(q1.poll());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;

    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */