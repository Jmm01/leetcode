package leetcode_03;

public class test8 {

    public String intToRoman(int num) {
        String res = new String();
        int[] nums = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0; i<13; i++){
            while(num >= nums[i]){
                num = num - nums[i];
                res = res + strs[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test8 t = new test8();
        System.out.println(t.intToRoman(3888));
    }

}
