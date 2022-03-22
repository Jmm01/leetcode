package leetcode_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc539 {
    public int findMinDifference(List<String> timePoints) {
        int[] times = new int[timePoints.size()];
        for(int i=0; i<timePoints.size(); i++){
            String s = timePoints.get(i);
            int t1 = ((s.charAt(0) - '0')*10 + s.charAt(1) - '0')*60;
            int t2 = (s.charAt(3) - '0')*10 + s.charAt(4) - '0';
            times[i] = t1+t2;
        }
        Arrays.sort(times);
        int min = Math.abs(24*60 - times[times.length-1] + times[0]);
        for(int i=0; i<times.length-1; i++){
            int temp = times[i+1] - times[i];
            min = Math.min(temp,min);
        }
        return min;
    }

    public static void main(String[] args) {
        lc539 l = new lc539();
        System.out.println(l.findMinDifference(new ArrayList<>(Arrays.asList("00:00","23:59","00:00"))));
    }
}
