package leetcode_06;

import java.util.HashMap;

public class lc205 {
    public boolean isIsomorphic(String s, String t) {
        HashMap map = new HashMap();
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i)))
                map.put(s.charAt(i),t.charAt(i));
            else {
                if(map.containsKey(s.charAt(i))){
                    if(!map.get(s.charAt(i)).equals(t.charAt(i)))
                        return false;
                }else if(map.containsValue(t.charAt(i)))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lc205 l = new lc205();
        System.out.println(l.isIsomorphic("paper","title"));
        System.out.println('a' - 'A');
    }
}
