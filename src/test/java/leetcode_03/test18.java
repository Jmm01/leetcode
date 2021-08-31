package leetcode_03;

public class test18 {
    public int divide(int dividend, int divisor) {
        //定义保存结果的整数
        int res = 0;
        //除数特殊时
        if(divisor == 1)
            return dividend;
        if(divisor == -2147483648)
            return dividend == -2147483648 ? 1:0;
        if(divisor == -1){
            //极端时会溢出的情况
            if(dividend == -2147483648)
                return 2147483647;
            else
                return -dividend;
        }
//        //被除数是-2^31时，特殊处理一下
//        if(dividend == -2147483648 && divisor>0){
//            dividend = dividend + divisor;
//            res++;
//        }else if(dividend == -2147483648 && divisor< 0){
//            dividend = dividend - divisor;
//            res++;
//        }
        //定义两个变量保存除数和被除数的正负号，ture为正，false为负
        boolean c1 = dividend > 0 ? true:false;
        boolean c2 = divisor > 0 ? true:false;
        //将除数和被除数都转化为负数来计算，防止溢出
        int a = dividend<0 ? dividend:-dividend;
        int b = divisor<0 ? divisor:-divisor ;
        while(a <= b){
            res ++;
            a = a-b;
        }
        //对两个数的符号异或运算，符号相同时为0，不同时为1
        res = c1^c2 ? -res:res;
        return res;
    }

    public static void main(String[] args) {
        test18 t = new test18();
        System.out.println(t.divide(-1010369383 ,-2147483648));
    }
}
