package leetcode_06;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class lc1688 {
    public int numberOfMatches(int n) {
        int res = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                res += n / 2;
                n = n / 2;
            } else {
                res += (n - 1) / 2;
                n = (n + 1) / 2;
            }
        }
        return res;
    }
        public static void main(String[] args) {
//        lc1688 l = new lc1688();
//        System.out.println(l.numberOfMatches(1));
//        System.out.println(l.numberOfMatches(2));

            //优先队列
            PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
            queue.add(3);
            queue.add(50);
            queue.add(10);
            queue.add(8);
            while (!queue.isEmpty()) {
                int temp = queue.peek();
                System.out.println(temp);
                queue.remove(temp);
            }

            //自定义比较函数的优先队列
//        PriorityQueue<Integer, Vector<Integer>,function<boolean(int,int)>> queue(myCmp) = new PriorityQueue<Integer>();

    }

}
