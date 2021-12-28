package leetcode_03;

public class test20 {
    //�ݹ飬���ֲ���
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        //�������Ϊ��
        if (nums.length == 0){
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        //�������ֻ��һ��Ԫ��
        if (nums.length == 1){
            if(target == nums[0]){
                res[0] = 0;
                res[1] = 0;
                return res;
            }else {
                res[0] = -1;
                res[1] = -1;
                return res;
            }
        }
        return searchRange(nums, 0, nums.length-1, target,res);
    }
    //˽�к�������nums�����L��R�ķ�Χ����target
    private int[] searchRange(int[] nums, int L, int R, int target,int[] res){
        int  left;
        int right;
        //targetС���������Сֵ��target������������ֵ
        if(target<nums[L] || target>nums[R]){
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        //�����м�λ�õ�����
        int index = (R-L)/2 + L;
        //����м�λ�õ�num��target��ȣ����ɴ������߲���ͬ�������ַ�Χ
        if(target == nums[index]){
            left = index;
            while(left!=0 && nums[left-1] == target )
                left--;
            right = index;
            while(right<nums.length-1 && nums[right+1] == target )
                right++;
            res[0] = left;
            res[1] = right;
            return res;
        }
        //����м�λ�õ�num��targetС���͵��õݹ���������Ұ��ȥ����
        if(target > nums[index])
            return searchRange(nums,index+1,R,target,res);
        //����м�λ�õ�num��target�󣬾͵��õݹ������������ȥ����
        if(target < nums[index])
            return searchRange(nums,L,index-1,target,res);
        return res;
    }

    public static void main(String[] args) {
        test20 t = new test20();
        int[] nums = new int[]{0,1,2,3,4,4,4};
        System.out.println(t.searchRange(nums,2));
    }
}
