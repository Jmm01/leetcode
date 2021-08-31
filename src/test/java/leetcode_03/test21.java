package leetcode_03;

public class test21 {
    //ʱ�临�Ӷ�Ҫ��ΪlogN�����ֲ��Ҳ������㣬���ֲ���ֻ�ܲ����������顣
    //����������ת��������ǰ�һ����Сֵ���������Ƶ����档
    //�ж�ĳһ������L-R���Ƿ����򣬿�nums[R]�Ƿ����nums[L]
    //�����������һ�����Ҷ˵��ֵС����˵�����
    //ÿ�ν�����һ��Ϊ���������򣬾Ͷ��ֲ��ң������򣬾͵ݹ鱾������
    public int search(int[] nums, int target) {
        if(nums.length == 1)
            return target==nums[0]?0:-1;
        return search(nums,0, nums.length-1,target);

    }
    //�����������������˽�з���
    private int search(int[] nums,int L, int R, int target){
        if(R-L==1){
            if(nums[R] == target)
                return R;
            if(nums[L] == target)
                return L;
            else
                return -1;
        }
        if(R==L && nums[R]!=target)
            return -1;
        //�����е�
        int mid = (R-L)/2+L;
        if(nums[mid] == target)
            return mid;
        //����������������
        if(nums[L] <= nums[mid]){
            //���ֲ���
            int temp1 = search2(nums,L,mid,target);
            if(temp1 != -1)
                return temp1;
            //�����ߵ���������û��target
            //�����ݹ��ұߵ���������
            int temp2 = search(nums,mid, R,target);
            return temp2;
            //����ұ�����������
        }else if(nums[R] >= nums[mid]){
            //���ֲ���
            int temp = search2(nums,mid,R,target);
            if(temp != -1)
                return temp;
            //����ұߵ���������û��target
            //�����ݹ���ߵ���������
            int temp3 = search(nums,L, mid,target);
            return temp3;
        }
        return -1;
    }
    //����������������ֲ���target
    private int search2(int[] nums,int L, int R, int target){
        //nums��L-R������һ�����������е�
        if(R-L==1){
            if(nums[R] == target)
                return R;
            if(nums[L] == target)
                return L;
            else
                return -1;
        }
        if(R==L && nums[R]!=target)
            return -1;
        //�����м�λ��
        int m = (R-L)/2+L;
        //���target=�м�ֵ
        if(target == nums[m])
            return m;
        else if(target > nums[m])
            //�����Ұ��
            return search2(nums,m,R,target);
        else
            //��������
            return search2(nums,L,m,target);

    }

    public static void main(String[] args) {
        test21 t = new test21();
        int[] nums = new int[]{4,5,6,7,0,1,2};
        System.out.println(t.search(nums,-1));
    }

}
