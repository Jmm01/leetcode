package leetcode_01;

public class test {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        if(strs.length == 0){
            return s;
        }else{
            int len = strs.length;
            int minlen = strs[0].length();
            for (int k = 0; k < len; k++) {
                if (strs[k].length() < minlen) {
                    minlen = strs[k].length();
                }
            }
            char res[][] = new char[strs.length][minlen];
            for (int i = 0; i < len; i++) {
                String str = strs[i];
                int l = str.length();
                char ch[] = str.toCharArray();
                for (int j = 0; j < minlen; j++) {
                    res[i][j] = ch[j];
                }
            }
            boolean bo = true;
            char flag = ' ';
            label:
            for (int i = 0; i < minlen; i++) {
                for (int j = 0; j < res.length; j++) {
                    flag = res[0][i];
                    char c = res[j][i];
                    if (c != flag) {
                        bo = false;
                        break label;
                    }
                }
                if (bo) {
                    s = s + flag;
                }

            }
            return s;
        }
    }

    public static void main(String[] args){
        test t = new test();
        String[] arr = new String[1];
        String str = t.longestCommonPrefix(arr);
        System.out.println(str);
    }
}
