package leetcode_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test11 {
    //����һ������?n ������������?nums?�� һ��Ŀ��ֵ?target��
    // �ҳ�?nums?�е�����������ʹ�����ǵĺ���?target?��ӽ���
    // �������������ĺ͡��ٶ�ÿ������ֻ����Ψһ�𰸡�
    public int threeSumClosest(int[] nums, int target) {
        //����ruturn�ı���
        int res = 0;
        //numsֻҪ����Ԫ�ص����
        if(nums.length == 3)
            return res = nums[0] + nums[1] + nums[2];
        //����������
        Arrays.sort(nums);
        //�ж�target������С���
        int len = nums.length;
        int max = nums[len-1] + nums[len-2] + nums[len-3];
        int min = nums[0] + nums[1] + nums[2];
        if(target >= max)
            return res = max;
        if(target <= min)
            return res = min;
        //��target��ֵ��min��max֮��ʱ
        //�������i��Ԫ��Ϊ�����������������ұߵ��������˵�ָ��֮����target�Ĳ��res��
        int oldgap = target - min;
        res = min;
        for(int i=0; i<nums.length; i++){
            //���ĳ��Ԫ�غ���һ�����ڵ�Ԫ���ظ������������������ظ���
            if( i>0 && nums[i] == nums[i-1])
                continue;
            //��������ָ�룬��ָ��Ϊi+1����ָ��Ϊnums.length-1
            int cur = nums[i];
            int R = nums.length-1;
            int L = i+1;
            //ֻҪ����ָ�벻�����������м������
            while (L < R){
                int sum = cur + nums[R] + nums[L];
                int gap = target - sum;
                //���Ϊ0ʱ��ӽ���ֱ�ӷ��ء�
                if(gap == 0) {
                    return res = sum;
                }else{
                    if(Math.abs(gap) < Math.abs(oldgap)) {
                        //�������С���͸���res��
                        oldgap = gap;
                        res = sum;
                    }
                    if(gap > 0)
                        //�������˵����С�ˣ����ֻ�ƶ���ָ�룬�ͱ��
                        L++;
                    else
                        //�������˵�������ˣ����ֻ�ƶ���ָ�룬�ͱ�С��
                        R--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        test11 t = new test11();
        int[] nums = new int[]{-1,0,1,1,55};
        System.out.println(t.threeSumClosest(nums,3));
    }
}
