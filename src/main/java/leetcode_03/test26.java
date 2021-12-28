package leetcode_03;

public class test26 {
    //41.缺失的第一个正数：原地哈希法，时间复杂度O(n),空间复杂度O(1)
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        //遍历数组，将数组元素放到对应的序号上，比如元素3放在nums[3-1]的位置上
        for(int i = 0; i<length; i++){
            //元素值在0-length的范围内，才有对应的位置可换；
            //nums[nums[i]-1] != nums[i]判断此时元素位置是否正确，不正确的才需要交换位置
            //while循环是为了多次判断和交换，直到i的位置出现正确元素或者不在0-length以内的数
            while(nums[i]>0 && nums[i]<=length && nums[nums[i]-1] != nums[i])
                //将元素交换到 值-1 的位置处
                change(nums, nums[i]-1, i);
        }
        //遍历数组,寻找没有对应元素的索引，就是缺失的正数
        for(int i=0; i<length; i++){
            if(nums[i] != i+1)
                return i+1;
        }
        //如果所有元素都有对应的正确索引，说明缺失元素在数组长度外
        return length+1;
    }
    //私有函数，交换nums数组中a和b位置处的元素值
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
