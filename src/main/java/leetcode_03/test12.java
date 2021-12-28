package leetcode_03;

import java.util.ArrayList;
import java.util.List;

public class test12 {
    public List<String> letterCombinations(String digits) {

        //存放结果的list
        List<String> list = new ArrayList<String>();
        //如果digits.length = 0;
        if (digits.length() == 0)
            return list;
        //如果digits.length = 1;
        else if (digits.length() == 1) {
            String[] str = findStr(digits.charAt(0));
            for (String s : str)
                list.add(s);
        }
        //如果digits.length = 2;
        //双重循环遍历所有组合
        else if (digits.length() == 2) {
            String[] str1 = findStr(digits.charAt(0));
            String[] str2 = findStr(digits.charAt(1));
            for (String s1:str1) {
                for (String s2:str2) {
                    String res = new String();
                    res += s1;
                    res += s2;
                    list.add(res);
                }
            }
        }
        ////如果digits.length = 3;
        //三重遍历
        else if (digits.length() == 3) {
            String[] str1 = findStr(digits.charAt(0));
            String[] str2 = findStr(digits.charAt(1));
            String[] str3 = findStr(digits.charAt(2));
            for (String s1:str1) {
                for (String s2:str2) {
                    for(String s3:str3){
                        String res = new String();
                        res += s1;
                        res += s2;
                        res += s3;
                        list.add(res);
                    }
                }
            }
        }
        //如果digits.length = 4;
        else if (digits.length() == 4) {
            String[] str1 = findStr(digits.charAt(0));
            String[] str2 = findStr(digits.charAt(1));
            String[] str3 = findStr(digits.charAt(2));
            String[] str4 = findStr(digits.charAt(3));
            for (String s1:str1) {
                for (String s2:str2) {
                    for(String s3:str3){
                        for(String s4:str4){
                            String res = new String();
                            res += s1;
                            res += s2;
                            res += s3;
                            res += s4;
                            list.add(res);
                        }
                    }
                }
            }
        }
        return list;
    }

    //定义一个私有函数，查询字符对应的数组
    private String[] findStr (Character c){
        //定义二维数组，将数字对应的字符保存起来
        String[][] strs = new String[][]{new String[]{"a", "b", "c"},
                new String[]{"d", "e", "f"},
                new String[]{"g", "h", "i"},
                new String[]{"j", "k", "l"},
                new String[]{"m", "n", "o"},
                new String[]{"p", "q", "r", "s"},
                new String[]{"t", "u", "v"},
                new String[]{"w", "x", "y", "z"}};
        return strs[c - '2'];
    }

    public static void main(String[] args) {
        test12 t = new test12();
        System.out.println(t.letterCombinations("23"));
    }
}
