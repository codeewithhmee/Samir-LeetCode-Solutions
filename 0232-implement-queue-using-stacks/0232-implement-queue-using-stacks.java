class MyQueue {
    private Stack<Integer> s1;   
    private Stack<Integer> s2;  
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
     s1.push(x);
    }
    
    public int pop() {
          int s=s1.size();
        for(int i=0;i<s-1;i++){
            s2.push(s1.pop());
        }
        
        int a=s1.pop();
        while(s2.size()>0){
            s1.push(s2.pop());
        }
        return a;
    }
    
    public int peek() {
        int s=s1.size();
        for(int i=0;i<s-1;i++){
            s2.push(s1.pop());
        }
        
        int a=s1.peek();
        while(s2.size()>0){
            s1.push(s2.pop());
        }
        return a;
        
    }
    
    public boolean empty() {
        return s1.size()==0;
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