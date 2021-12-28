package leetcode_03;

public class test26 {
    //41.ȱʧ�ĵ�һ��������ԭ�ع�ϣ����ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(1)
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        //�������飬������Ԫ�طŵ���Ӧ������ϣ�����Ԫ��3����nums[3-1]��λ����
        for(int i = 0; i<length; i++){
            //Ԫ��ֵ��0-length�ķ�Χ�ڣ����ж�Ӧ��λ�ÿɻ���
            //nums[nums[i]-1] != nums[i]�жϴ�ʱԪ��λ���Ƿ���ȷ������ȷ�Ĳ���Ҫ����λ��
            //whileѭ����Ϊ�˶���жϺͽ�����ֱ��i��λ�ó�����ȷԪ�ػ��߲���0-length���ڵ���
            while(nums[i]>0 && nums[i]<=length && nums[nums[i]-1] != nums[i])
                //��Ԫ�ؽ����� ֵ-1 ��λ�ô�
                change(nums, nums[i]-1, i);
        }
        //��������,Ѱ��û�ж�ӦԪ�ص�����������ȱʧ������
        for(int i=0; i<length; i++){
            if(nums[i] != i+1)
                return i+1;
        }
        //�������Ԫ�ض��ж�Ӧ����ȷ������˵��ȱʧԪ�������鳤����
        return length+1;
    }
    //˽�к���������nums������a��bλ�ô���Ԫ��ֵ
    private void change(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        test26 t = new test26();
        int[] nums = new int[]{3,4,-1,1};
        System.out.println(t.firstMissingPositive(nums));
    }
}
