package leetcode_06;

import java.util.HashMap;

public class lc149 {
    //直线上最多的点数
    public int maxPoints(int[][] points) {
        int res = 1;
        for(int i=0; i<points.length; i++){
            HashMap<String ,Integer> map = new HashMap();
            int max = 0;
            for (int j=i+1; j<points.length; j++){
                int x1 = points[i][0], y1 = points[i][1],
                        x2 = points[j][0], y2 = points[j][1];
                int a = x1 - x2, b = y1 - y2;
                int k = gcd(a,b);
                String key = (a/k) + "-" + (b/k);
                map.put(key, map.getOrDefault(key,0) + 1);
                max = Math.max(max, map.get(key));
            }
            res = Math.max(res, max + 1);
        }
        return res;
    }
    int gcd(int a, int b){
        return b==0 ? a : gcd(b, a%b);
    }
}
