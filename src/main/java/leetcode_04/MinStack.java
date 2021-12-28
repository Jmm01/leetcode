package leetcode_04;

import java.util.Stack;

class MinStack {
    private Stack stack;
    private int min;

    /** initialize your data structure here. */
    public MinStack() {
         this.stack = new Stack();
    }

    public void push(int x) {
        if(stack.isEmpty())
            min = x;
        else
            min = Math.min(x,min);
        stack.push(x);
    }

    public void pop() {
        if(stack.peek().equals(min)){
            min = (int)stack.elementAt(0);
            for(int i=0; i<stack.size()-1; i++)
                min = Math.min((int)stack.elementAt(i),min);
        }
        stack.removeElementAt(stack.size() - 1);
    }

    public int top() {
        return (int) stack.peek();
    }

    public int getMin() {
        return min;
    }
}
