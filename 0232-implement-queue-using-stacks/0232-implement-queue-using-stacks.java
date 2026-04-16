class MyQueue {
    Stack <Integer> st=new Stack<>();
    Stack <Integer> rt=new Stack<>();
    // public MyQueue() {
        
    // }
    
    public void push(int x) {
        st.add(x);
    }
    
    public int pop() {
        if(rt.isEmpty()){
            while(!st.isEmpty())
            rt.push(st.pop());
        }
        return rt.pop();
    }
    
    public int peek() {
        if(rt.isEmpty()){
            while(!st.isEmpty())
            rt.push(st.pop());
        }
        return rt.peek();
    }
    
    public boolean empty() {
        return st.isEmpty() && rt.isEmpty();
        //return rt.isEmpty();
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