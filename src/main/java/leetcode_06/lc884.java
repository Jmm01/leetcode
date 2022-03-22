package leetcode_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class lc884 {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String,Integer> map = new HashMap();

        String[] ss1 = s1.split(" ");
        String[] ss2 = s2.split(" ");
        for(int i=0; i<ss1.length; i++){
            map.put(ss1[i],map.getOrDefault(ss1[i],0)+1);
        }
        for(int i=0; i<ss2.length; i++){
            map.put(ss2[i],map.getOrDefault(ss2[i],0)+1);
        }
//        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, Integer> next = iterator.next();
//            if(next.getValue() > 1)
//                map.remove(next.getKey());
//        }
        ArrayList<String> list = new ArrayList();
        for(String key:map.keySet()){
            if(map.get(key) == 1){
                list.add(key);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        lc884 lc = new lc884();
        System.out.println(lc.uncommonFromSentences("this apple is sweet","this apple is sour"));    }
}
