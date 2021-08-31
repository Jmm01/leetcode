package leetcode_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test15 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //����һ����������lists
        List<List<Integer>> ress = new ArrayList<List<Integer>>();
        //���nums�ĳ���С��4��ֱ�ӷ��ؿա�
        if(nums.length < 4)
            return ress;
        //��nums��Ԫ������
        Arrays.sort(nums);
        //�������i,jԪ��Ϊ�����������������ұߵ��������˵�ָ��֮���Ƿ�Ϊtarget��
        for(int j=0; j<nums.length;j++){
            //���ĳ��Ԫ�غ���һ�����ڵ�Ԫ���ظ������������������ظ���
            if(j>0 && nums[j] == nums[j-1])
                continue;
            for(int i=j+1; i<nums.length; i++){
                //��������ָ�룬��ָ��Ϊi+1����ָ��Ϊnums.length-1
                int cur1 = nums[j];
                int cur2 = nums[i];
                int R = nums.length-1;
                int L = i+1;
                //ֻҪ����ָ�벻�����������м������
                while (L < R){
                    if(cur1 + cur2 + nums[R] + nums[L] == target){
                        List res = new ArrayList();
                        res.add(cur1);
                        res.add(cur2);
                        res.add(nums[L]);
                        res.add(nums[R]);
                        ress.add(res);
                        //�����ظ�Ԫ��,����[0,1,1,3],L=1ʱ��L++��L=2����ʱ�������ظ���Ԫ���������ж���֮����Ҫ++������
                        while(L < R && nums[L+1] == nums[L])
                            L++;
                        while(L < R && nums[R-1] == nums[R])
                            R--;
                        while(i<L && nums[i+1] == nums[i])
                            i++;
                        //˫ָ�붼�ƶ���һ��ֵ���һ��ֵ��С��
                        L++;
                        R--;
                    }else if(cur1 + cur2 + nums[R] + nums[L] > target){
                        //�������˵�������ˣ����ֻ�ƶ���ָ�룬�ͱ�С��
                        R--;
                    }else {
                        //�������˵����С�ˣ����ֻ�ƶ���ָ�룬�ͱ��
                        L++;
                    }
                }
            }
        }

        return ress;
    }

    public static void main(String[] args) {
        test15 t = new test15();
        int[] nums = new int[]{1,-2,-5,-4,-3,3,3,5};
        System.out.println(t.fourSum(nums,-11));
    }
}
