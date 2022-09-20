package leetcode_08;

public class lc172 {
    public int trailingZeroes(int n) {
        int res = 0;
        while ( n >= 5){
            res += n/5;
            n = n/5;
        }
        return res;
    }

    public static void main(String[] args) {
        lc172 lc = new lc172();
        System.out.println(lc.trailingZeroes(13));
        System.out.println(lc.trailingZeroes(5));

    }

}
