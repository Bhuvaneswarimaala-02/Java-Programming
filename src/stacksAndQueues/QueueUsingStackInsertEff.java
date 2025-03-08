package stacksAndQueues;

import java.util.Stack;

public class QueueUsingStackInsertEff {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackInsertEff(){
        first=new Stack<>();
        second=new Stack();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        } // pushing in rev order into stack2
        int removed=second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        } // pushing from stack2 back into stack1
        return removed;
    }

    public int peek() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        } // pushing in rev order into stack2
        int peeked=second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        } // pushing from stack2 back into stack1
        return peeked;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

}
