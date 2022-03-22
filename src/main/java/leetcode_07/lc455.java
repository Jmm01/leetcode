package leetcode_07;

import java.util.Arrays;
import java.util.Comparator;

public class lc455 {
    //分发饼干，贪心算法
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i=g.length-1, j=s.length-1, res=0;
        while (i >= 0 && j >= 0){
            if(s[j] >= g[i]){
                res++;
                i--;
                j--;
            }else {
                i--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc455 lc = new lc455();
        System.out.println(lc.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        System.out.println(lc.findContentChildren(new int[]{1, 2}, new int[]{}));

    }
}
