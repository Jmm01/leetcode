package leetcode_02;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class test8 {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        char[] chars = s.toCharArray();
        for(char ch:chars){
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        for(int i=0; i<chars.length; i++){
            if(map.get(chars[i])==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        test8 t =new test8();
        System.out.println(t.firstUniqChar("dddccdbba"));
    }
}
