package leetcode_05;

import java.util.LinkedList;

public class lcOffer62 {
    public int lastRemaining(int n, int m) {
        int temp = m-1;
        m = (m-1)%n;
        LinkedList<Integer> linkedList = new LinkedList();
        for(int i=0; i<n; i++)
            linkedList.add(i);
        while(linkedList.size() != 1){
            linkedList.remove(m);
            m = (m+temp)%linkedList.size();
        }
        return linkedList.pop();
    }

    public static void main(String[] args) {
        lcOffer62 l = new lcOffer62();
        System.out.println(l.lastRemaining(5,3));
    }
}
