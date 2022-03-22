package leetcode_07;

import java.util.ArrayList;
import java.util.List;

public class lc1447 {
    private boolean isSimplified(int a, int b){
        if(a >= b)
            return false;
        if((a == 1 && b > 1) || (b-a)==1)
            return true;
        for(int i=2; i<=a; i++){
            if(a%i == 0 && b%i == 0)
                return false;
        }
        return true;
    }

    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        //分母
        for(int i=2; i<=n; i++){
            //分子
            for(int j=1; j<i; j++){
                if(isSimplified(j,i)){
                    StringBuilder strb = new StringBuilder();
                    strb.append(j).append("/").append(i);
                    res.add(strb.toString());
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc1447 lc = new lc1447();
//        System.out.println(lc.simplifiedFractions(3));
        System.out.println(lc.simplifiedFractions(4));
//        System.out.println(lc.simplifiedFractions(4));
    }
}
