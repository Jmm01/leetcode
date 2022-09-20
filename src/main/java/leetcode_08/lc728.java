package leetcode_08;

import java.util.ArrayList;
import java.util.List;

public class lc728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(isSDN(i))
                res.add(i);
        }
        return res;
    }

    private boolean isSDN(int num){
        int temp = num;
        boolean res = true;
        while(temp > 0){
            int i = temp%10;
            temp = temp/10;
            if(i == 0 || num % i != 0){
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc728 lc = new lc728();
        System.out.println(lc.selfDividingNumbers(1,22));
        System.out.println(lc.selfDividingNumbers(47,85));

    }
}
