package leetcode_03;

public class test9 {
    //盛水最多的容器
    //双指针法
    public int maxArea(int[] height) {
        int res = 0;
        //定义左指针
        int i = 0;
        //定义右指针
        int j = height.length - 1;
        //只要两个指针没有在中间某处相遇，就可以继续遍历。
        while(i<j){
            //计算盛水面积，j-i是底的宽度，高度是两端的短板决定。
            //更新最大面积。
            res = Math.max(res,(j-i) * Math.min(height[i],height[j]));
            //指针向中间移动时，宽度减少1，高度如果不增加，面积必定减少，
            // 所以每次移动短板，面积才可能增加。
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
