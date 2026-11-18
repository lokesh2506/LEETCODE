class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        // move the s1 element to s2
        // becoz queue push in the last  10 -> 20 -> 30 ==> 30 -> 20 -> 10 easy to pop and peek

        while(!s1.isEmpty()){
            s2.push(s1.pop()); 
        }

        s1.push(x);

        // push te s2 back to the stack1
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {

        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */