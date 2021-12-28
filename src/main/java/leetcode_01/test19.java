package leetcode_01;

public class test19 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        if (prices.length < 2)
            return 0;
        for (int i=0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        test19 t = new test19();
        int[] nums = new int[]{2,11,1,4,7};
        System.out.println(t.maxProfit(nums));
    }
}
