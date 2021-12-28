package leetcode_03;

public class test9 {
    //ʢˮ��������
    //˫ָ�뷨
    public int maxArea(int[] height) {
        int res = 0;
        //������ָ��
        int i = 0;
        //������ָ��
        int j = height.length - 1;
        //ֻҪ����ָ��û�����м�ĳ���������Ϳ��Լ���������
        while(i<j){
            //����ʢˮ�����j-i�ǵ׵Ŀ�ȣ��߶������˵Ķ̰������
            //������������
            res = Math.max(res,(j-i) * Math.min(height[i],height[j]));
            //ָ�����м��ƶ�ʱ����ȼ���1���߶���������ӣ�����ض����٣�
            // ����ÿ���ƶ��̰壬����ſ������ӡ�
            if(height[i] > height[j])
                j--;
            else
                i++;
        }
        return res;
    }

    public static void main(String[] args) {
        test9 t = new test9();
        System.out.println(t.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
