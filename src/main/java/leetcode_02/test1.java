package leetcode_02;

public class test1 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String a = Integer.toBinaryString(n);
        int res = 0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='1'){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test1 t = new test1();
        int res = t.hammingWeight(2);
        System.out.println(res);
    }
}
