package leetcode_04;

import java.math.BigInteger;
import java.util.zip.GZIPOutputStream;

public class test15 {
    public int convertInteger(int A, int B) {
        //异或运算
        int num=A^B;
        int sum=0;
        while(num!=0){
            num &= (num-1);
            sum++;
        }
        return sum;
    }
    public static void main(String[] args) {
        test15 t = new test15();
        System.out.println(t.convertInteger(528611498, -1619967984));
    }
}
