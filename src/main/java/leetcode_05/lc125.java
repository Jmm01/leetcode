package leetcode_05;

public class lc125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l=0,r=s.length()-1;
        char left=' ',right=' ';
        while(l < r){
            left = s.charAt(l);
            right = s.charAt(r);
            if(is(left)){
                if(is(right)){
                    if(left != right)
                        return false;
                    else {
                        l++;
                        r--;
                    }
                }else
                    r--;
            }else
                l++;
        }
        return true;

    }

    boolean is(char ch){
        if((ch >= 'a' && ch <= 'z') ||(ch >= '0' && ch <= '9'))
            return true;
        return false;
    }

    public static void main(String[] args) {
        lc125 l = new lc125();
        System.out.println(l.isPalindrome("race a car"));
    }
}
