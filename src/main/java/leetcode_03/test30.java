package leetcode_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test30 {
    //56.合并区间
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0)
            return new int[0][2];
        //将数组里的区间按照左端点大小进行排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //定义用来存放结果的数组
        List<int[]> merged = new ArrayList<int[]>();

        for(int i=0; i<intervals.length; i++){
            int left = intervals[i][0];
            int right = intervals[i][1];
            //如果结果集为空或者结果集的区间右端点小于当前区间的左端点，
            // 说明不重合，直接保存进来结果集，不用合并
            if(merged.size() == 0 || merged.get(merged.size() - 1)[1]<left){
                merged.add(new int[]{left,right});
            }else {
                //如果当前区间和结果集里的区间有重合，右端点就要重新取最大值
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size() - 1)[1],right);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
