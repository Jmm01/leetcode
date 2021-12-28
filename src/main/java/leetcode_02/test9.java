package leetcode_02;

public class test9 {
    public void reverseString(char[] s) {
        if(s.length>1){
            for(int i=0; i<s.length/2; i++){
                char temp = s[i];
                s[i] = s[s.length-1-i];
                s[s.length-1-i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        test9 t = new test9();
        char[] ch = new char[]{'h','e','l','l','o'};
        t.reverseString(ch);
    }
}
