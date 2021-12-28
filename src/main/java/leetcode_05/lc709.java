package leetcode_05;

public class lc709 {
    public String toLowerCase(String s){
        StringBuilder sb = new StringBuilder();
        char lower;
        for(int i=0; i<s.length(); i++){
            lower = s.charAt(i)>='A' && s.charAt(i)<='Z' ? (char) (s.charAt(i) + 32) : s.charAt(i);
            sb.append(lower);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        lc709 l = new lc709();
        String str = "AbcDef>aD";
        System.out.println('A' - 'a');
        System.out.println(l.toLowerCase(str));
    }
}
