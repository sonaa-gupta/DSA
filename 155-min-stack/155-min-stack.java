class MinStack {
    Stack<Pair<Integer, Integer>> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.empty()){
            stack.push(new Pair(val, val));
        }else {
            stack.push(new Pair(val, Math.min(val, stack.peek().getValue())));
        }
    }
    // O(1)
    
    public void pop() {
        stack.pop();
    }
    // O(1)
    
    public int top() {
        return stack.peek().getKey();
    }
   
    
    public int getMin() {
        return stack.peek().getValue();
    }
  
}
    
    
    

/** int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */