// Last updated: 3/15/2026, 6:04:15 PM
1class MyQueue {
2    Stack<Integer> queue;
3    Stack<Integer> queuee;
4    public MyQueue() {
5        queue=new Stack<>();
6        queuee=new Stack<>();
7    }
8    
9    public void push(int x) {
10        queue.push(x);
11    }
12    
13    public int pop() {
14        peek();
15        return queuee.pop();
16    }
17    
18    public int peek() {
19       if (queuee.empty()){
20            while (!queue.empty()){
21                queuee.push(queue.pop());
22            }
23       }
24        return queuee.peek();
25    }
26    
27    public boolean empty() {
28        return queue.empty() && queuee.empty();
29    }
30}
31
32/**
33 * Your MyQueue object will be instantiated and called as such:
34 * MyQueue obj = new MyQueue();
35 * obj.push(x);
36 * int param_2 = obj.pop();
37 * int param_3 = obj.peek();
38 * boolean param_4 = obj.empty();
39 */