package leetcode_05;

import java.util.HashSet;

public class lc344 {

    public void reverseString(char[] s) {
        int l=0, r=s.length-1;
        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        lc344 l = new lc344();
        l.reverseString(new char[]{'h','e','l','l','o'});
    }


}
