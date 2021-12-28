package leetcode_05;

public class lc509 {
    public int fib(int n){
        if(n < 2)
           return n;
        int a = 0,b = 1,res = 0;
        for(int i=2; i<= n; i++){
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }

    public static void main(String[] args) {
        lc509 l = new lc509();
        System.out.println(l.fib(4));
    }
}
