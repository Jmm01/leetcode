package leetcode_06;

import java.util.*;

public class lc451 {
    //空间复杂度O(n)
    //时间复杂度O(n)
    public String frequencySort(String s) {
        if(s == null)
            return null;
        HashMap<Character,Integer> map = new HashMap();
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        StringBuilder sb = new StringBuilder();
        while(sb.length() < s.length()){
            int maxValue = 0;
            char maxKey = ' ';
            for(Map.Entry<Character,Integer> entry:map.entrySet()){
                if(entry.getValue() > maxValue){
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            for(int i=0; i<maxValue; i++)
                sb.append(maxKey);
            map.remove(maxKey);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        lc451 l = new lc451();
        System.out.println(l.frequencySort("2a554442f544asfasssffffasss"));
        System.out.println(l.frequencySort("2"));
        System.out.println(l.frequencySort(" "));
        System.out.println(l.frequencySort(null));
    }
}
