package leetcode_07;

public class lc917 {
    //双指针
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
//        char[] chars = s.toCharArray();
        int l=0, r=s.length()-1;
        while(l<r){
            while(!isLetters(sb.charAt(l)) && l<s.length()-1)
                l++;
            while(!isLetters(sb.charAt(r)) && r>0)
                r--;
            if(l < r){
                sb.replace(l,l+1,s.substring(r,r+1));
                sb.replace(r,r+1,s.substring(l,l+1));
                l++;
                r--;
            }
        }
        return sb.toString();
    }

    //判断字符是否为英文字母
    boolean isLetters(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z');
    }

    public static void main(String[] args) {
        lc917 lc = new lc917();
        System.out.println(lc.reverseOnlyLetters("------"));
        System.out.println(lc.reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(lc.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
