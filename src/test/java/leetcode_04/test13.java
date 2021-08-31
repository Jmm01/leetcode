package leetcode_04;

public class test13 {
    public static void main(String[] args) {
//        MinStack s = new MinStack();
//        s.push(-2);
//        s.push(0);
//        s.push(-3);
//        System.out.println(s.getMin());
//        s.pop();
//        System.out.println(s.top());
//        System.out.println(s.getMin());
//
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // 返回 1
        System.out.println(queue.pop()); // 返回 1
        queue.empty(); // 返回 false

    }
}
