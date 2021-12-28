package leetcode_03;

public class test28 {
    //55.��Ծ��Ϸ
    public boolean canJump(int[] nums) {
        if(nums == null)
            return false;
        //�洢����������
        int distance = 0;

        for(int i=0; i<nums.length; i++){
            //��ʱdistance������i��λ�ã�˵���޷�����ȥ
            if(i > distance)
                return false;
            //����ǰi��Ԫ������������Զλ��
            distance = Math.max(i + nums[i],distance);
            //�����Զλ���ܹ����������ô�ͷ����жϽ��
            if(distance >= nums.length-1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        test28 t = new test28();
        int[] nums = new int[]{3,2,1,0,4};
        System.out.println(t.canJump(nums));
    }

}
