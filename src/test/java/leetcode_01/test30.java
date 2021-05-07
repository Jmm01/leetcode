package leetcode_01;

import java.util.ArrayList;

public class test30 {
    public char findTheDifference(String s, String t) {
        String st = s+t;
        char[] cList = st.toCharArray();
        int res = 0;
        for(int i=0; i<cList.length; i++){
            int cc = cList[i]-'a';
            res = res^cc;
        }
        char newRes = (char) (res + 'a');
        return newRes;
    }

    public static void main(String[] args) {
        test30 t30 = new test30();
        String s = "ae";
        String t = "aea";
        System.out.println(t30.findTheDifference(s,t));
    }

}
