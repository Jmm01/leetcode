package leetcode_03;

public class test21 {
    //时间复杂度要求为logN，二分查找才能满足，二分查找只能查找有序数组。
    //升序数组旋转后的数组是把一部分小值按照升序移到后面。
    //判断某一段数组L-R内是否有序，看nums[R]是否大于nums[L]
    //无序的区间内一定是右端点的值小于左端点的情况
    //每次将数组一分为二，若有序，就二分查找，若无序，就递归本方法。
    public int search(int[] nums, int target) {
        if(nums.length == 1)
            return target==nums[0]?0:-1;
        return search(nums,0, nums.length-1,target);

    }
    //创建查找有序数组的私有方法
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
        //定义中点
        int mid = (R-L)/2+L;
        if(nums[mid] == target)
            return mid;
        //如果左边数组是有序
        if(nums[L] <= nums[mid]){
            //二分查找
            int temp1 = search2(nums,L,mid,target);
            if(temp1 != -1)
                return temp1;
            //如果左边的有序数组没有target
            //再来递归右边的无序数组
            int temp2 = search(nums,mid, R,target);
            return temp2;
            //如果右边数组是有序
        }else if(nums[R] >= nums[mid]){
            //二分查找
            int temp = search2(nums,mid,R,target);
            if(temp != -1)
                return temp;
            //如果右边的有序数组没有target
            //再来递归左边的无序数组
            int temp3 = search(nums,L, mid,target);
            return temp3;
        }
        return -1;
    }
    //传进来有序数组二分查找target
    private int search2(int[] nums,int L, int R, int target){
        //nums在L-R区间内一定是升序排列的
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
        //定义中间位置
        int m = (R-L)/2+L;
        //如果target=中间值
        if(target == nums[m])
            return m;
        else if(target > nums[m])
            //查找右半边
            return search2(nums,m,R,target);
        else
            //查找左半边
            return search2(nums,L,m,target);

    }

    public static void main(String[] args) {
        test21 t = new test21();
        int[] nums = new int[]{4,5,6,7,0,1,2};
        System.out.println(t.search(nums,-1));
    }

}
