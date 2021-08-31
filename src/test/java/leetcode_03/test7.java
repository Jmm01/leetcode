package leetcode_03;
//实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数
public class test7 {
    public int myAtoi(String s) {
        int res = 0;
        if(s.length() == 0)
            return res = 0;
//      读入字符串并丢弃无用的前导空格
        s = delC(s," ");
        if(s == " ")
            return res =0;
//      检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。
//      确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
        String flag = s.substring(0, 1);
        String str = new String();
        boolean temp = flag.equals("+") || flag.equals("-");
        str = temp?strToNum(s.substring(1, s.length())):strToNum(s);
//      flag中保存的为符号或者第一个字符。
//      str中保存着字符串的第一段无符号有效数字。
        if(str.length() == 0)
            return res = 0;
//     判断str是否有效,删除最高位的0
       str = delC(str, "0");
//     如果str的长度超过2^31的长度。如果str的长度等于2^31的长度，并且最高位大于2。
        if (str.length() > 10 || (str.length() == 10 && (str.charAt(0) - '0') > 2))
            return res = !flag.equals("-")?2147483647:-2147483648;
//      如果str的长度等于2^31的长度，并且最高位等于2。
        else if (str.length() == 10 && (str.charAt(0) - '0') == 2) {
//            判断第二位到最后与147483648的大小。
            int num = 0;
            str = str.substring(1, str.length());
//          将str转为数字
            for (int i = 0; i < str.length(); i++)
                num = num * 10 + (str.charAt(i) - '0');
//            处理临界值情况
            if (num >= 147483648) {
                return res = !flag.equals("-")?2147483647:-2147483648;
            } else if (num < 147483648)
                return res = !flag.equals("-")?2000000000 + num:-(2000000000 + num);
        } else {//str转为整数不会溢出的情况
            int num = 0;
//          将str转为数字
            for (int i = 0; i < str.length(); i++)
                num = num * 10 + (str.charAt(i) - '0');
            return res = !flag.equals("-")?num:-num;
        }
        return res;
    }

//  判断字符串s是否为数字，如果是就拼接在str后面，不是数字就结束循环。
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
//      读入字符串并丢弃指定前缀字符
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
