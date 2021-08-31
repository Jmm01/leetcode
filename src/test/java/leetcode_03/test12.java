package leetcode_03;

import java.util.ArrayList;
import java.util.List;

public class test12 {
    public List<String> letterCombinations(String digits) {

        //��Ž����list
        List<String> list = new ArrayList<String>();
        //���digits.length = 0;
        if (digits.length() == 0)
            return list;
        //���digits.length = 1;
        else if (digits.length() == 1) {
            String[] str = findStr(digits.charAt(0));
            for (String s : str)
                list.add(s);
        }
        //���digits.length = 2;
        //˫��ѭ�������������
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
        ////���digits.length = 3;
        //���ر���
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
        //���digits.length = 4;
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

    //����һ��˽�к�������ѯ�ַ���Ӧ������
    private String[] findStr (Character c){
        //�����ά���飬�����ֶ�Ӧ���ַ���������
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
