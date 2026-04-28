// Last updated: 4/28/2026, 8:03:00 PM
class MyQueue {
    Stack<Integer> queue;
    Stack<Integer> queuee;
    public MyQueue() {
        queue=new Stack<>();
        queuee=new Stack<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        peek();
        return queuee.pop();
    }
    
    public int peek() {
       if (queuee.empty()){
            while (!queue.empty()){
                queuee.push(queue.pop());
            }
       }
        return queuee.peek();
    }
    
    public boolean empty() {
        return queue.empty() && queuee.empty();
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