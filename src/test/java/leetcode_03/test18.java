package leetcode_03;

public class test18 {
    public int divide(int dividend, int divisor) {
        //���屣����������
        int res = 0;
        //��������ʱ
        if(divisor == 1)
            return dividend;
        if(divisor == -2147483648)
            return dividend == -2147483648 ? 1:0;
        if(divisor == -1){
            //����ʱ����������
            if(dividend == -2147483648)
                return 2147483647;
            else
                return -dividend;
        }
//        //��������-2^31ʱ�����⴦��һ��
//        if(dividend == -2147483648 && divisor>0){
//            dividend = dividend + divisor;
//            res++;
//        }else if(dividend == -2147483648 && divisor< 0){
//            dividend = dividend - divisor;
//            res++;
//        }
        //��������������������ͱ������������ţ�tureΪ����falseΪ��
        boolean c1 = dividend > 0 ? true:false;
        boolean c2 = divisor > 0 ? true:false;
        //�������ͱ�������ת��Ϊ���������㣬��ֹ���
        int a = dividend<0 ? dividend:-dividend;
        int b = divisor<0 ? divisor:-divisor ;
        while(a <= b){
            res ++;
            a = a-b;
        }
        //���������ķ���������㣬������ͬʱΪ0����ͬʱΪ1
        res = c1^c2 ? -res:res;
        return res;
    }

    public static void main(String[] args) {
        test18 t = new test18();
        System.out.println(t.divide(-1010369383 ,-2147483648));
    }
}
