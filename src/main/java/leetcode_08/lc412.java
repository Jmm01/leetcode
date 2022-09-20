package leetcode_08;

import java.util.ArrayList;
import java.util.List;

public class lc412 {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i=1; i<=n; i++){
            res.add(isFB(i));
        }
        return res;
    }

    private String isFB(int num){
        if(num%3==0 & num%5==0)
            return "FizzBuzz";
        else if(num%3==0)
            return "Fizz";
        else if(num%5==0)
            return "Buzz";
        else
            return String.valueOf(num);
    }
}
