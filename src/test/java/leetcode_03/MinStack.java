package leetcode_03;

import java.util.Stack;

class MinStack {
    Stack<int[]> stack;
    //最小栈，向栈里添加数组[新元素，目前最小值]
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<int[]>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            //栈为空时，最小值就取传入的第一个元素
            stack.push(new int[]{val,val});
        }else {
            //取新传入的数据与栈顶的最小数据之间的最小值
            int temp = Math.min(val,stack.peek()[1]);
            stack.push(new int[]{val,temp});
        }

    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return  stack.peek()[0];

    }

    public int getMin() {
        return  stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

