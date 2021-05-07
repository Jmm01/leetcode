package leetcode_01;

public class test14 {

    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        if(nums.length == 0){
            return res;
        }else{
            res[0] = nums[0];
            if(nums.length>1){
                for(int i=1; i<nums.length; i++){
                    int temp = nums[i]+res[i-1];
                    res[i] = temp;
                }
            }
            return res;
        }
    }

    public String toString(int[] res) {
        String returnString = "";
        returnString += "[";
        for(int resTemp:res){
            returnString += resTemp;
            returnString += ",";
        }
        returnString = returnString.substring(0,returnString.length()-1);
        returnString += "]";
        return returnString;
    }



    public static void main(String[] args) {
        test14 t =new test14();
        int[] r = t.runningSum(new int[]{3,1,2,10,1});
        System.out.println(t.toString(r));
    }
}
