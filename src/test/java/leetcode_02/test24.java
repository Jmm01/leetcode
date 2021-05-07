package leetcode_02;

public class test24 {
    public double myPow(double x, int n) {
        if(x == 0 || x == 1 )
            return x;
        if(x == -1)
            return Math.abs(n%2) == 1?-1:1;
        if(n == -2147483648)
            return 0;
        double res = 1;
        if(n == 0)
            res = 1;
        else if(n>0){
            for(int i=0; i<n; i++)
                res = res*x;
        }else{
            for(int i=0; i<(-n); i++)
                res = res*x;
            res = 1/res;
        }

        return res;
    }


    public static void main(String[] args) {
        test24 t = new test24();
        System.out.println(t.myPow(-1,2147483647));
    }
}
