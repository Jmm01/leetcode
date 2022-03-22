package leetcode_07;

public class lc392 {
    public boolean isSubsequence(String s, String t) {
        int i=0, j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else
                j++;

        }
        return i == s.length();
    }

    public static void main(String[] args) {
        lc392 lc = new lc392();
        System.out.println(lc.isSubsequence("abc", "ahbgdc"));
        System.out.println(lc.isSubsequence("axc", "ahbgdc"));

    }
}
