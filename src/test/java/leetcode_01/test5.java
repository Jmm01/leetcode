package leetcode_01;

public class test5 {
    public int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        if(array.length == 0){
            return 0;
        }else{
           // String[] array = s.split(" ");
            String res = array[array.length-1];
            return res.length();
            }
    }
    public static void main(String[] args) {
        test5 t = new test5();
        String s = "hello ooo";
       // String[] array = s.split(" ");
        //System.out.println(s);
        System.out.println(t.lengthOfLastWord(s));
    }
}
