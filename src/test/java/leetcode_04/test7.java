package leetcode_04;

import java.util.Arrays;

public class test7 {
    //面试题01.02.判定是否互为字符重排
    //要考虑：是否区分大小写
    //字符串是否为空
    //字符串长度是否相等
    //再排序比较
    //或者异或运算判断有没有落单的字符串
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
//        char[] ch1 = new char[s1.length()];
//        for(int i=0; i<s1.length(); i++)
//            ch1[i] = s1.charAt(i);
//        char[] ch2 = new char[s2.length()];
//        for(int i=0; i<s2.length(); i++)
//            ch2[i] = s2.charAt(i);
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//        for(int i=0; i<ch1.length; i++){
//            if(ch1[i] != ch2[i])
//                return false;
//        }
//        return true;
        int res = 0;
        for (int i=0; i<s1.length(); i++){
            res = res^s1.charAt(i)^s2.charAt(i);
        }
        return res==0;
    }

    public static void main(String[] args) {
        test7 t = new test7();
        System.out.println(t.CheckPermutation("abc","bca"));
    }
}
