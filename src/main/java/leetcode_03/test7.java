package leetcode_03;
//ʵ��һ�� myAtoi(string s) ������ʹ���ܽ��ַ���ת����һ�� 32 λ�з�������
public class test7 {
    public int myAtoi(String s) {
        int res = 0;
        if(s.length() == 0)
            return res = 0;
//      �����ַ������������õ�ǰ���ո�
        s = delC(s," ");
        if(s == " ")
            return res =0;
//      �����һ���ַ������軹δ���ַ�ĩβ��Ϊ�����Ǹ��ţ���ȡ���ַ�������У���
//      ȷ�����ս���Ǹ������������� ������߶������ڣ���ٶ����Ϊ����
        String flag = s.substring(0, 1);
        String str = new String();
        boolean temp = flag.equals("+") || flag.equals("-");
        str = temp?strToNum(s.substring(1, s.length())):strToNum(s);
//      flag�б����Ϊ���Ż��ߵ�һ���ַ���
//      str�б������ַ����ĵ�һ���޷�����Ч���֡�
        if(str.length() == 0)
            return res = 0;
//     �ж�str�Ƿ���Ч,ɾ�����λ��0
       str = delC(str, "0");
//     ���str�ĳ��ȳ���2^31�ĳ��ȡ����str�ĳ��ȵ���2^31�ĳ��ȣ��������λ����2��
        if (str.length() > 10 || (str.length() == 10 && (str.charAt(0) - '0') > 2))
            return res = !flag.equals("-")?2147483647:-2147483648;
//      ���str�ĳ��ȵ���2^31�ĳ��ȣ��������λ����2��
        else if (str.length() == 10 && (str.charAt(0) - '0') == 2) {
//            �жϵڶ�λ�������147483648�Ĵ�С��
            int num = 0;
            str = str.substring(1, str.length());
//          ��strתΪ����
            for (int i = 0; i < str.length(); i++)
                num = num * 10 + (str.charAt(i) - '0');
//            �����ٽ�ֵ���
            if (num >= 147483648) {
                return res = !flag.equals("-")?2147483647:-2147483648;
            } else if (num < 147483648)
                return res = !flag.equals("-")?2000000000 + num:-(2000000000 + num);
        } else {//strתΪ����������������
            int num = 0;
//          ��strתΪ����
            for (int i = 0; i < str.length(); i++)
                num = num * 10 + (str.charAt(i) - '0');
            return res = !flag.equals("-")?num:-num;
        }
        return res;
    }

//  �ж��ַ���s�Ƿ�Ϊ���֣�����Ǿ�ƴ����str���棬�������־ͽ���ѭ����
    private String strToNum(String s){
        String str = new String();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                str += s.charAt(i);
            else
                break;
        }
        return str;
    }
//      �����ַ���������ָ��ǰ׺�ַ�
    private String delC(String s, String del){
        while(s.substring(0,1).equals(del) && s.length()>1)
            s = s.substring(1, s.length());
        return s;
    }


    public static void main(String[] args) {
        test7 t = new test7();
        System.out.println(t.myAtoi("-2147483649"));
    }


}
