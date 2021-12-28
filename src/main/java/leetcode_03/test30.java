package leetcode_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test30 {
    //56.�ϲ�����
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0)
            return new int[0][2];
        //������������䰴����˵��С��������
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //����������Ž��������
        List<int[]> merged = new ArrayList<int[]>();

        for(int i=0; i<intervals.length; i++){
            int left = intervals[i][0];
            int right = intervals[i][1];
            //��������Ϊ�ջ��߽�����������Ҷ˵�С�ڵ�ǰ�������˵㣬
            // ˵�����غϣ�ֱ�ӱ����������������úϲ�
            if(merged.size() == 0 || merged.get(merged.size() - 1)[1]<left){
                merged.add(new int[]{left,right});
            }else {
                //�����ǰ����ͽ��������������غϣ��Ҷ˵��Ҫ����ȡ���ֵ
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size() - 1)[1],right);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
