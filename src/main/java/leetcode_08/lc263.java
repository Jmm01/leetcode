package leetcode_08;

import java.util.HashSet;

public class lc263 {
    public boolean isUgly(int n) {
        if(n == 0)
            return true;
        while(n != 1){
            if(n % 5 != 0 && n % 3 != 0 && n % 2 != 0)
                break;
            if(n % 5 == 0)
                n = n/5;
            if(n % 3 == 0)
                n = n/3;
            if(n % 2 == 0)
                n = n/2;
        }
        return n==1;

    }
}
