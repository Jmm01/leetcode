package leetcode_01;

public class test7 {
    public int mySqrt(int x) {
        int res = 0;
        if(x == 0 || x==1){
            return res=x;
        }else{
            for(int i=0; i<x; i++){
                int j = i+1;
                int a = i*i;
                int b = j*j;
                if((a<=x && b>x) || a>b){
                    res = i;
                    return i;
                }
            }
        }
    return res;
    }
    public static void main(String[] args) {
        test7 t = new test7();
        System.out.println(t.mySqrt(2147395600));
    }
}
