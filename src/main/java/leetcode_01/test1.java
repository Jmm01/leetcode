package leetcode_01;

class test1 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            if(nums[0] == val){
                return i;
            }else{
                return 1;
            }
        }
        for(int j=0; j<nums.length-1; j++){
            if(nums[j] !=val ){
                if(i!=j){
                    nums[i] = nums[j];
                }
                i++;
            }else{
                nums[i] = nums[j+1];
            }
        }
        if(nums[nums.length-1] != val){
            if(i!=nums.length-1){
                nums[i] = nums[nums.length-1];
            }
            i++;
        }else{
            i = i;
        }
        return i;
    }

    public static void main(String[] args) {
//        test1 t = new test1();
//        int[] arr = new int[]{1,2,3,4};
//        int str = t.removeElement(arr,1);
//        System.out.println(str);
//        System.out.println(arr);
        Object obj = null;

        String str = null;
        String str1 = "";
        System.out.println("--"+str);
        System.out.println("----"+str1.toString());
//        System.out.println(obj.toString());
        System.out.println((String)obj);
        System.out.println(String.valueOf(obj));

    }
}
