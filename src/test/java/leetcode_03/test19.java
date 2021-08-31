package leetcode_03;

import java.util.Arrays;

public class test19 {
    //ʵ�ֻ�ȡ ��һ������ �ĺ������㷨��Ҫ���������������������г��ֵ�������һ����������С�
    //�����������һ����������У��������������г���С�����У����������У���
    //���� ԭ�� �޸ģ�ֻ����ʹ�ö��ⳣ���ռ䡣
    public int[] nextPermutation(int[] nums) {
        //�ж��Ƿ�Ϊ��������
        Boolean flag = true;
        for(int i=0; i<nums.length-1; i++){
            //�������nums[i] < nums[i]��˵�������������У�
            if(nums[i] < nums[i+1]){
                flag = false;
                break;
            }
        }
        //�����true,�������У��Ͳ����ڸ�������У�������Сֵ��
        if(flag){
            Arrays.sort(nums);
        }else {
            //�Ӻ��������Ҫ���������ֵ�λ��
            for(int i=nums.length-1; i>0; i--){
                int after = nums[i];
                int before = nums[i-1];
                //beforeΪ��Ҫ��������С����
                if(after > before){
                    //Ѱ�Ҵ�i��nums.length-1����before�����ֵ����С��һ��
                    int index = i;
                    for(int j=i; j<nums.length; j++ ){
                        if(nums[j] < after && nums[j] > before) {
                            after = nums[j];
                            index = j;
                        }
                    }
                    //����before�ʹ�ʱ���º���С��after��λ��
                    int temp = nums[i-1];
                    nums[i-1] = nums[index];
                    nums[index] = temp;
                    //��i��������ְ����������У�ȷ���������һ�����ֵ
                    Arrays.sort(nums,i,nums.length);
                    break;
                }
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        test19 t = new test19();
        System.out.println(t.nextPermutation(new int[]{1,3,2}));
    }
}
