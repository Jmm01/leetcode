package leetcode_09;

import java.util.ArrayList;
import java.util.List;

public class lc357 {
    /**
     * 规律：
     * 1
     * 9+上一个结果
     * 9*9+上一个结果
     * 9*9*8+上一个结果
     * 9*9*8*7+上一个结果
     */
    static final int[] results = new int[9];
    static void init(){
        int[] temp = new int[8];
        //用来存放前半部分的值
        temp[0] = 9;
        for(int i=1; i<temp.length; i++){
            temp[i] = temp[i-1] * (10-i);
        }
        //用来计算结果集
        results[0] = 1;
        for(int i=1; i<9; i++){
            results[i] = temp[i-1] + results[i-1];
        }
    }
    public int countNumbersWithUniqueDigits(int n) {
        if(results[0] == 0)
            init();
        return results[n];
    }

    public static void main(String[] args) {
        lc357 lc = new lc357();
        System.out.println(lc.countNumbersWithUniqueDigits(0));
        System.out.println(lc.countNumbersWithUniqueDigits(1));
        System.out.println(lc.countNumbersWithUniqueDigits(2));
        System.out.println(lc.countNumbersWithUniqueDigits(3));
        System.out.println(lc.countNumbersWithUniqueDigits(4));
    }
}
