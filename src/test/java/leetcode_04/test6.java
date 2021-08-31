package leetcode_04;

import java.util.Arrays;

public class test6 {
    public boolean isUnique(String astr) {
        Boolean isUnique = true;
        if(astr.length()<2)
            return true;
        Arrays.sort(new String[]{astr});
        for(int i=0; i<astr.length(); i++){
            char cur = astr.charAt(i);
            for(int j=i+1; j<astr.length(); j++){
                if(cur == astr.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
        }
        return isUnique;
    }

    public static void main(String[] args) {
        test6 t = new test6();
        System.out.println(t.isUnique("aaaa"));
    }
}
