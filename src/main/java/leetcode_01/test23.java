package leetcode_01;

public class test23 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean res = true;
        StringBuilder ss = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')||(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                ss.append(s.charAt(i));
            }
        }
        int j=ss.length()-1;
        for(int k=0; k<ss.length()/2; k++){
            if(ss.charAt(k) == ss.charAt(j)){
                j--;
            }else {
                res = false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test23 t = new test23();
        System.out.println(t.isPalindrome(" "));
    }
}
