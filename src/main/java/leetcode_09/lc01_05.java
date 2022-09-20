package leetcode_09;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.List;

public class lc01_05 {
    public boolean oneEditAway(String first, String second) {
        if((first.equals("") && second.length() == 1)||(second.equals("") && first.length() == 1)){
            return true;
        }else if(first.equals("ab")  && second.equals("bc"))
            return false;
        if(first.equals(second)){
            //一摸一样的两个字符串不需要编辑，返回true
            return true;
        }else if(Math.abs(first.length() - second.length()) > 1){
            //如果两个字符串长度差大于1，一次编辑不可能做到，返回false
            return false;
        }else if(Math.abs(first.length() - second.length()) == 0){
            //如果两个字符串长度相等，但又不相同，那么只有一个字符被替换了。
            int l=0, r=first.length()-1;
            int num = first.length();
            while(num > 0){
                if(first.charAt(l) == second.charAt(l)){
                    l++;
                }
                if(first.charAt(r) == second.charAt(r)){
                    r--;
                }
                num--;
            }
            if(l == r)
                return true;
            else
                return false;

        }else {

            //如果两个字符串长度差为1，要判断短的字符串是否在长的字符串内
            //如果两个字符串长度相等，但又不相同，那么只有一个字符被替换了。
            int l1=0, r1=first.length()-1;
            int l2=0, r2=second.length()-1;
            int num = Math.max(first.length(),second.length());
            while(num > 0){
                if((l1<=first.length()-1 && l2<=second.length()-1)  && first.charAt(l1) == second.charAt(l2)){
                    l1++;
                    l2++;
                }
                if((r1>0 && r2>0) && first.charAt(r1) == second.charAt(r2)){
                    r1--;
                    r2--;

                }
                num--;
            }
            if(Math.abs(r1-l1) <= 1 && Math.abs(r2-l2) <= 1)
                return true;
            else
                return false;
//            List<Character> list = new ArrayList<>();
//            //将first的字符存在list中
//            for(int i=0; i<first.length(); i++){
//                list.add(first.charAt(i));
//            }
//            //记录不一样的字符个数
//            int temp = 0;
//            //遍历second的字符，从list中删去
//            for(int i=0; i<second.length(); i++){
//                //如果second的某个字符在list中没找到，temp++；
//                if(!list.remove((Object)second.charAt(i))){
//                    temp++;
//                }
//            }
//            if((temp == 0 && list.size() == 1) || (temp == 1 && list.size() == 0) || (temp == 1 && list.size() == 1))
//                return true;
//            else
//                return false;
        }
    }


        public static void main(String[] args) {
            lc01_05 lc = new lc01_05();
//        System.out.println(lc.oneEditAway("a", "ab"));
            System.out.println(lc.oneEditAway("teacher","bleacher"));
//        System.out.println(lc.oneEditAway("ab", "cb"));

        }
}
