class MinStack{
    Stack<Long>minst;
    long min;
    public MinStack(){
        minst=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    public void push(int value){
        if(minst.isEmpty()){
            minst.push((long)value);
            min=value;
            return;
        }
        if(min>value){
            minst.push(2L*value-min);
            min=value;
        }else{
            minst.push((long)value);
        }
    }
    public void pop(){
        if(minst.isEmpty()){
            return;
        }
        long top=minst.peek();
        if(top<min){
            min=2*min-top;
        }
        minst.pop();
    }
    public int top(){
        if(minst.isEmpty()){
            return -1;
        }
        long top=minst.peek();
        if(top<min){
            return (int)min;
        }
        return (int)top;
    }
    public int getMin(){
        if(minst.isEmpty()){
            return -1;
        }
        return (int)min;
    }
}



 /* Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */