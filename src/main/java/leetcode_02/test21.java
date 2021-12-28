package leetcode_02;

import java.util.TreeMap;
import java.util.TreeSet;

public class test21 {
    public int lengthOfLongestSubstring(String s) {
        s = s.trim();
        if(s.length() < 2)
            return s.length();
        Character[] ch = new Character[s.length()];
        for(int i=0; i<s.length(); i++){
            ch[i] = s.charAt(i);
        }
        int res = 0;
        TreeMap<Integer, TreeSet> map = new TreeMap();
        for(int i=0; i<ch.length; i++){
            int key = i;
            TreeSet set = new TreeSet();
            set.add(ch[i]);
            for(int j=i+1; j<ch.length; j++){
                if(!set.contains(ch[j])){
                    set.add(ch[j]);
                }else if(set.contains(ch[j])){
                    map.put(key,set);
                    break;
                }
            }
            map.put(key,set);
        }
        for(int i=0; i<map.size(); i++){
            TreeSet set = map.get(i);
            res = Math.max(set.size(),res);
        }
        return res;
    }

    public static void main(String[] args) {
        test21 t = new test21();
        System.out.println(t.lengthOfLongestSubstring("bb"));
    }
}
