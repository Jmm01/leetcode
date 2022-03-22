package leetcode_06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class lc1996 {
    public int numberOfWeakCharacters(int[][] properties) {

        Arrays.sort(properties,(o1,o2)->o1[0] == o2[0] ? o1[1]-o2[1]:o2[0]-o1[0]);
        int res = 0;
        int max = -1;

        for(int i=0; i<properties.length; i++){
            if(max > properties[i][1])
                res++;

            max = Math.max(max,properties[i][1]);
        }

        return res;
    }

    public static void main(String[] args) {
        lc1996 lc = new lc1996();
        System.out.println(lc.numberOfWeakCharacters(new int[][]{{1,1},{2,1},{2,2},{1,2}}));
        System.out.println(lc.numberOfWeakCharacters(new int[][]{{2,2},{3,3}}));
        System.out.println(lc.numberOfWeakCharacters(new int[][]{{1,5},{10,4},{4,3}}));
    }
}
