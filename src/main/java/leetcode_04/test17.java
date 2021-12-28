package leetcode_04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test17 {
    //43.字符串相乘
    public String multiply(String num1, String num2) {
        if(num1.equals("0")|| num2.equals("0"))
            return "0";
        String[] strings = new String[num2.length()];
        for(int i=0; i<num2.length(); i++){
            StringBuilder builder = new StringBuilder();
            int carry = 0;
            int curNum2 = num2.charAt(i)-'0';
            //计算当前的数相乘后需要添几个0
            String zeros = "";
            int n = num2.length()-1-i;
            for(int k=0; k<n; k++)
                zeros += "0";
            //将curNum2分别与num1的每一位相乘，结果用字符串储存，防止溢出
            for(int j=num1.length()-1; j>=0; j--){
                int curNum1 = num1.charAt(j)-'0';
                int temps= curNum1*curNum2 + carry;
                if(temps > 9){
                    carry = temps/10;
                    temps = temps%10;
                }else {
                    carry = 0;
                }
                builder.append(temps);
            }
            if(carry>0)
                builder.append(carry);
            strings[i] = builder.reverse().append(zeros).toString();
        }

        String num = "";
        for(int i=0; i<strings.length; i++)
            num = addStrings(num,strings[i]);
        return num;
    }
    //将两个字符串相加
    private String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        int i = num1.length()-1, j = num2.length()-1;
        while(i>=0 || j>=0 ){
            int cur = 0;
            if(i>=0 && j>=0)
                cur = (num1.charAt(i)-'0') + (num2.charAt(j)-'0') + carry;
            if(i<0 && j>=0)
                cur = (num2.charAt(j)-'0') + carry;
            if(j<0 && i>=0)
                cur = (num1.charAt(i)-'0') + carry;
            if(cur > 9){
                carry = 1;
                cur = cur % 10;
            }else {
                carry = 0;
            }
            builder.append(cur);
            i=i>0?i-1:-1;
            j=j>0?j-1:-1;
        }
        if(carry != 0)
            builder.append(carry);
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        test17 t = new test17();
        System.out.println(t.multiply("498828660196","840477629533"));
//        System.out.println(t.multiply("123","456"));
    }
}
