package leetcode_03;

import java.util.HashSet;

public class test4{
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 2)
            return new int[]{1,2};
        int[] res = new int[2];
        HashSet set = new HashSet();
        for(int num:numbers){
            set.add(num);
        }
        for(int i=0; i<numbers.length; i++){
            int temp = target - numbers[i];
            if(set.contains(temp)){
                res[0] = i+1;
                for(int j=i+1; i<numbers.length; j++){
                    if(numbers[j] == temp){
                        res[1] = j+1;
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
