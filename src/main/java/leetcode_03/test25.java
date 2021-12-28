package leetcode_03;

public class test25 {
    //42.����ˮ��˫ָ�뷨��ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(1)
    public int trap(int[] height) {
        //��ʼ��˫ָ��
        int left = 0, right = height.length-1;
        //��ʼ���������ֵ�����ʹ洢����ı���
        int leftMax = 0, rightMax = 0, ans = 0;
        //����ָ������ʱ��������������λ�ô�����������
        while(left < right){
            //�����ߵ����ӽϵͣ�������ߵĸ߶Ⱦ�����ˮ��
            if(height[left] < height[right]){
                if(height[left] > leftMax){
                    //��ǰ���Ӹ߶��ڵ���ʱ���Ǵ治��ˮ�ģ�ֻ�������ֵ
                    leftMax = height[left];
                }else {
                    //����ǰλ�ñ�֮ǰ�����ֹ������Ӹߵͣ����ֵ��ݣ����Ի�ˮ
                    //��ˮ��Ϊ��ǰλ����������λ�õĲ�ֵ
                    ans += leftMax - height[left];
                }
                left++;
            }else {
                //����ұߵ����ӽϵͣ������ұߵĸ߶Ⱦ�����ˮ��
                if(height[right] > rightMax){
                    //��ǰ���Ӹ߶��ڵ���ʱ���Ǵ治��ˮ�ģ�ֻ�������ֵ
                    rightMax = height[right];
                }else {
                    //����ǰλ�ñ�֮ǰ�Ҳ���ֹ������ӵͣ����ֵ��ݣ����Ի�ˮ
                    //��ˮ��Ϊ��ǰλ�����ұ����λ�õĲ�ֵ
                    ans += rightMax - height[right];
                }
                right--;
            }
        }
        return ans;

    }
}
