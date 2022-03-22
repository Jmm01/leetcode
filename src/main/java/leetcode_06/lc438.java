package leetcode_06;

import java.util.ArrayList;
import java.util.List;

public class lc438 {
    //长度变化的滑动窗口
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length() < p.length())
            return list;
        int l = 0, r = -1;
        int[] pp = new int[32];
        for(int i=0; i<p.length(); i++)
            pp[p.charAt(i)-'a'] ++;
        while(l <= s.length()-p.length()) {
            if (r + 1 < s.length() && pp[s.charAt(r + 1) - 'a'] != 0 && r - l < p.length()) {
                pp[s.charAt(++r) - 'a'] --;
                if (r - l + 1 == p.length())
                    list.add(l);
            } else
                pp[s.charAt(l++) - 'a'] ++;
        }
        return list;
    }

    public static void main(String[] args) {
        lc438 l = new lc438();
        System.out.println(l.findAnagrams("cbaebabacd","abc"));
        System.out.println(l.findAnagrams("baa","aa"));
    }
}
