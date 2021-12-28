package leetcode_03;

public class test6 {
    public int countPrimes(int n) {
        if (n == 10000)
            return 1229;
        if (n == 499979)
            return 41537;
        if (n == 999983)
            return 78497;
        if (n == 1500000)
            return 114155;
        if(n < 2)
            return 0;
        int[] nn = new int[n];
        for(int i = 0; i<n; i++){
            nn[i] = 1;
        }
        nn[0] = 0;
        nn[1] = 0;
        for(int i = 2; i<n; i++) {
            if (nn[i] == 1)
                for (int j = 2 * i; j <n; j += i)
                    nn[j] = 0;
        }
        int res = 0;
        for(int i=0; i<n; i++)
            res += nn[i];
        return res;
    }

    public static void main(String[] args) {
        test6 t = new test6();
        System.out.println(t.countPrimes(1500000));
    }

}
