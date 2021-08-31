package leetcode_04;

import java.util.Stack;

class MyQueue {

    private Stack myQueue;
    private int size;


    /** Initialize your data structure here. */
    public MyQueue() {
        myQueue = new Stack();
        size = 0;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        myQueue.push(x);
        size++;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Stack temp = new Stack();
        for (int i=0; i<size-1; i++)
            temp.push(myQueue.pop());
        int res = (int) myQueue.pop();
        for (int i=0; i<size-1; i++)
            myQueue.push(temp.pop());
        size--;
        return res;
    }

    /** Get the front element. */
    public int peek() {
        return (int) myQueue.elementAt(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return size == 0;
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
