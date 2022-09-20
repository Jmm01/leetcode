package leetcode_09;

import java.util.Arrays;
import java.util.stream.Stream;

public class lc1652 {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] codeNum = new int[len * 3];
        for(int i=0; i<codeNum.length; i++){
            codeNum[i] = code[i%len];
        }
      return temp(code,codeNum,k);
    }

    private int[] temp(int[] code, int[] codeNum, int k){
        int n=code.length;
        if(k == 0)
            return new int[code.length];
        else if(k > 0){
            for(int i=0; i<code.length; i++){
                code[i] = sum(codeNum,n+i+1,n+i+k);
            }
        }else {
            for(int i=0; i<code.length; i++){
                code[i] = sum(codeNum,n+i+k,n+i-1);
            }
        }
        return code;
    }
    private int sum(int[] codeNum, int begin, int end){
        int sum = 0;
        for(int i=begin; i<=end; i++){
            sum += codeNum[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        lc1652 lc = new lc1652();
//        System.out.println(Arrays.toString(lc.decrypt(new int[]{1, 2, 3, 4}, 0)));
        //遍历数组打印元素Arrays.toString()和jdk8的Arrays.stream
        Arrays.stream(lc.decrypt(new int[]{2, 4, 9, 3}, -2)).forEach(System.out::println);
        System.out.println(Arrays.toString(lc.decrypt(new int[]{2, 4, 9, 3}, -2)));

    }
}
