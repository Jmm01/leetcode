package leetcode_05;

import java.util.Arrays;

public class lc475 {
    public int findRadius(int[] houses, int[] heaters){
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int ans = 0;
        for(int i=0,j=0; i<houses.length; i++){
            int cur = Math.abs(heaters[j] - houses[i]);
            while(j < heaters.length && heaters[j] <=houses[i])
                cur = houses[i] - heaters[j++];
            if(j < heaters.length)
                cur = Math.min(cur,Math.abs(heaters[j] - houses[i]));
            ans = Math.max(ans, cur);
            if(j > 0)
                j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        lc475 l = new lc475();
        System.out.println(l.findRadius(new int[]{1,2,3}, new int[]{2}));
        System.out.println(l.findRadius(new int[]{1,2,3,4}, new int[]{1,4}));
        System.out.println(l.findRadius(new int[]{1,5}, new int[]{2}));
    }
}
