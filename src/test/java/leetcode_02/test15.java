package leetcode_02;

import java.util.ArrayList;
import java.util.List;

public class test15 {
    public String addStrings(String num1, String num2) {
        int[] nums1 = new int[num1.length()];
        int[] nums2 = new int[num2.length()];
        for (int i = 0; i<num1.length(); i++)
            nums1[num1.length()-1-i] = num1.charAt(i) - 48;
        for (int i = 0; i<num2.length(); i++)
            nums2[num2.length()-1-i] = num2.charAt(i) - 48;
        List<Integer> sum = new ArrayList<Integer>();
        int flag = 0;
        int len=num1.length()>num2.length()?num1.length():num2.length();
        for(int i=0; i<len; i++){
            int n1 = i<nums1.length?nums1[i]:0;
            int n2 = i<nums2.length?nums2[i]:0;
            sum.add((n1+n2+flag)%10);
            flag = (n1+n2+flag)>9?1:0;
        }
        if(flag == 1)
            sum.add(1);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = sum.size()-1; i>-1; i--)
            stringBuilder.append(sum.get(i));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        test15 t = new test15();
        System.out.println(t.addStrings("1234","56789"));

    }

}
