package leetcode_02;

import java.util.TreeSet;

public class test11 {
    public boolean isPowerOfThree(int n) {
        return n>0 && 1162261467%n==0;
    }

    public static void main(String[] args) {
        test11 t = new test11();
        System.out.println(t.isPowerOfThree(9));
    }


}
