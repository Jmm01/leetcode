package leetcode_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test10 {
    //����һ������ n ������������?nums���ж�?nums?���Ƿ��������Ԫ�� a��b��c ��
    // ʹ��?a + b + c = 0 �������ҳ����к�Ϊ 0 �Ҳ��ظ�����Ԫ�顣
    //˫ָ�뷨��ʱ�临�Ӷ�n^2��
    public List<List<Integer>> threeSum(int[] nums) {
        //����һ����������lists
        List<List<Integer>> ress = new ArrayList<List<Integer>>();
        //���nums�ĳ���С��3��ֱ�ӷ��ؿա�
        if(nums.length < 3)
            return ress;
        //��nums��Ԫ������
        Arrays.sort(nums);

        //�������i��Ԫ��Ϊ�����������������ұߵ��������˵�ָ��֮���Ƿ�Ϊ0��
        for(int i=0; i<nums.length; i++){
            //�������������ĳ��λ�ô���0�������������Ҳ������0���������ĺͲ�����Ϊ0��ֱ�ӷ��ؽ������
            if(nums[i] > 0)
                return ress;
            //���ĳ��Ԫ�غ���һ�����ڵ�Ԫ���ظ������������������ظ���i>0��Ϊ�˷�ֹ[0,0,0]�������
            if(i>0 && nums[i] == nums[i-1])
                continue;
            //��������ָ�룬��ָ��Ϊi+1����ָ��Ϊnums.length-1
            int cur = nums[i];
            int R = nums.length-1;
            int L = i+1;
            //ֻҪ����ָ�벻�����������м������
            while (L < R){
                if(cur + nums[R] + nums[L] == 0){
                    List res = new ArrayList();
                    res.add(cur);
                    res.add(nums[L]);
                    res.add(nums[R]);
                    ress.add(res);
                    //�����ظ�Ԫ��,����[0,1,1,3],L=1ʱ��L++��L=2����ʱ�������ظ���Ԫ���������ж���֮����Ҫ++������
                    while(L < R && nums[L+1] == nums[L])
                        L++;
                    while(L < R && nums[R-1] == nums[R])
                        R--;
                    //˫ָ�붼�ƶ���һ��ֵ���һ��ֵ��С��
                    L++;
                    R--;
                }else if(cur + nums[R] + nums[L] > 0){
                    //�������˵�������ˣ����ֻ�ƶ���ָ�룬�ͱ�С��
                    R--;
                }else {
                    //�������˵����С�ˣ����ֻ�ƶ���ָ�룬�ͱ��
                    L++;
                }
            }
        }
        return ress;

    }

    public static void main(String[] args) {
        test10 t = new test10();
        int[] nums = new int[]{0};
        System.out.println(t.threeSum(nums));
    }

}
