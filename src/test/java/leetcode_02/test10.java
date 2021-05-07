package leetcode_02;

import java.util.TreeSet;

public class test10 {
    public String reverseVowels(String s) {
        if(s.length()>1){
            char[] c = new char[s.length()];
            for (int i=0; i<s.length(); i++)
                c[i] = s.charAt(i);
            char[] chars = new char[]{'a','e','i','o','u','A','E','I','O','U'};
            TreeSet tree = new TreeSet();
            for(char ch:chars)
                tree.add(ch);
            int i=0;
            int j=c.length-1;
            for(; i<j; i++){
                if(tree.contains(c[i])) {
                    char temp1 = c[i];
                    for (; j > i; j--) {
                        if(tree.contains(c[j])){
                            c[i] = c[j];
                            c[j] = temp1;
                            j--;
                            break;
                        }
                    }
                }
            }
            String res = new String();
            for(int k=0; k<c.length; k++)
                res = res+c[k];
            return res;
        }
        return s;
    }


    public static void main(String[] args) {
        test10 t = new test10();
        String str = "aocde";
        System.out.println(t.reverseVowels(str));
    }
}