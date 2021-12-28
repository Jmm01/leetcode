package leetcode_02;

import java.util.TreeMap;

public class test18 {
    public int arrangeCoins(int n) {
        int temp = 0;
        if(n>2147450880)
            return 65535;
        for(int i=0; i<999999999; i++){
            temp += i;
            if(temp == n)
                return i;
            if(temp>n)
                return i-1;
        }
        return 0;
    }


    public static void main(String[] args) {
        test18 t  = new test18();
        System.out.println(t.arrangeCoins(5));
    }
}
