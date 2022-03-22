package leetcode_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class lc599 {
    public String[] findRestaurant(String[] list1, String[] list2){
        List<String> tempRes = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap();
        int minIdx = list1.length+list2.length;
        for(int i=0; i<list1.length; i++){
            map.put(list1[i],i);
        }
        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                int index = map.get(list2[i])+ i;
                if(index < minIdx){
                    tempRes.clear();
                    tempRes.add(list2[i]);
                }else if(index == minIdx){
                    tempRes.add(list2[i]);
                }
                minIdx = Math.min(minIdx,index);
            }

        }
        return tempRes.toArray(new String[tempRes.size()]);
    }

    public static void main(String[] args) {
        lc599 lc = new lc599();
        lc.findRestaurant(new String[]{"Shogun", "Tap", "Burger", "KFC"},new String[]{"KFC", "Shogun", "Burger"});
    }
}
