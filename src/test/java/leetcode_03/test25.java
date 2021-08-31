package leetcode_03;

public class test25 {
    //42.接雨水：双指针法，时间复杂度O(n),空间复杂度O(1)
    public int trap(int[] height) {
        //初始化双指针
        int left = 0, right = height.length-1;
        //初始化左右最大值变量和存储结果的变量
        int leftMax = 0, rightMax = 0, ans = 0;
        //左右指针相遇时，处在最大的柱子位置处，遍历结束
        while(left < right){
            //如果左边的柱子较低，就以左边的高度决定积水量
            if(height[left] < height[right]){
                if(height[left] > leftMax){
                    //当前柱子高度在递增时，是存不到水的，只更新最大值
                    leftMax = height[left];
                }else {
                    //否则当前位置比之前左侧出现过的柱子高低，出现低洼，可以积水
                    //积水量为当前位置与左边最高位置的差值
                    ans += leftMax - height[left];
                }
                left++;
            }else {
                //如果右边的柱子较低，就以右边的高度决定积水量
                if(height[right] > rightMax){
                    //当前柱子高度在递增时，是存不到水的，只更新最大值
                    rightMax = height[right];
                }else {
                    //否则当前位置比之前右侧出现过的柱子低，出现低洼，可以积水
                    //积水量为当前位置与右边最高位置的差值
                    ans += rightMax - height[right];
                }
                right--;
            }
        }
        return ans;

    }
}
