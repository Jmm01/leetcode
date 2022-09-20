package leetcode_09;

import java.util.Arrays;
import java.util.HashMap;

public class lc954 {
    public boolean canReorderDoubled(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        //负数
        for(; i<arr.length && arr[i]<0; i++){
            if(map.containsKey(arr[i]*2)){
                map.put(arr[i]*2, map.get(arr[i]*2)-1);
                if(map.get(arr[i]*2) == 0)
                    map.remove(arr[i]*2);
            }else
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        //正数
        for (; i<arr.length; i++){
            if(arr[i] % 2 == 0 && map.containsKey(arr[i]/2)){
                map.put(arr[i]/2,map.get(arr[i]/2)-1);
                if(map.get(arr[i]/2) == 0)
                    map.remove(arr[i]/2);
            }else
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        return map.size()==0;

    }

    public static void main(String[] args) {
        lc954 lc = new lc954();
        System.out.println(lc.canReorderDoubled(new int[]{4, -2, 2, -4}));
    }
}
