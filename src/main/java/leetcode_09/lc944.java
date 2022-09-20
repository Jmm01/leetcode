package leetcode_09;

import java.util.ArrayList;
import java.util.Arrays;

public class lc944 {
    public int minDeletionSize(String[] strs) {
        int len = strs[0].length();
        int size = strs.length;
        ArrayList<char[]> lists = new ArrayList<char[]>();
        //将字符串按列整理到list中
        for(int i=0; i<len; i++){
            char[] chars = new char[size];
            for(int j=0; j<size; j++){
                chars[j] = strs[j].charAt(i);
            }
            lists.add(chars);
        }
        //判断每个list中的字符是否按照字典序排列
        int res = 0;
        for(int i=0; i<lists.size(); i++){
            char[] clone = lists.get(i).clone();
            Arrays.sort(clone);
            if(!Arrays.equals(clone,lists.get(i)))
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        lc944 lc = new lc944();
        int i = lc.minDeletionSize(new String[]{"cba", "daf", "ghi"});
        System.out.println(i);
    }
}
