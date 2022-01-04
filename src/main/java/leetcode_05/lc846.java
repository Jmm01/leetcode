package leetcode_05;

import java.util.Arrays;
import java.util.TreeMap;

public class lc846 {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0)
            return false;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i<hand.length; i++){
            if(map.containsKey(hand[i]))
                map.put(hand[i],map.get(hand[i])+1);
            else
                map.put(hand[i],1);
        }
        while(map.size()>0){
            int a = map.firstKey();
            for(int i=0; i<groupSize; i++){
                if(!map.containsKey(a))
                    return false;
                else if(map.get(a)>1)
                    map.put(a,map.get(a)-1);
                else
                    map.remove(a);
                a++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        lc846 l = new lc846();
        System.out.println(l.isNStraightHand(new int[]{1},1));
    }
}
