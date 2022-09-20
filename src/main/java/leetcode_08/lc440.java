package leetcode_08;

import java.util.Arrays;

public class lc440 {

    public int findKthNumber(int n, int k) {
        int cur = 1;
        int prefix = 1;
        while(cur < k){
            int temp = count(n,prefix);
            if(temp + cur > k){
                prefix *= 10;
                cur++;
            }else{
                prefix++;
                cur += temp;
            }
        }
        return prefix;
    }

    private int count(int n, int prefix){
        long cur = prefix;
        long next = cur+1;
        int count = 0;
        while (cur <= n){
            count += Math.min(n+1,next)-cur;
            cur *= 10;
            next *=10;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
