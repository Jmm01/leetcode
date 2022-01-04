package leetcode_06;

import java.util.HashMap;

public class lc290 {
    //查找表
    //时间复杂度：O(n)
    //空间的复杂度：O(n)
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        if(pattern.length() != s1.length)
            return false;
        HashMap map = new HashMap();
        for(int i=0; i<pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(s1[i])){
                map.put(pattern.charAt(i),s1[i]);
            } else {
                if(map.containsKey(pattern.charAt(i))){
                    if(!(map.get(pattern.charAt(i))).equals(s1[i]))
                        return false;
                }else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lc290 l = new lc290();
        System.out.println(l.wordPattern("abba","dog dog dog dog"));
        System.out.println(l.wordPattern("abba","dog cog cog fog"));
    }
}
