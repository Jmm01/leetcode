package leetcode_02;

public class test23 {

    public String addBinary(String a, String b) {
        boolean carry = false;
        char[] aa = new char[a.length()];
        char[] bb = new char[b.length()];
        int len = a.length()>b.length()?a.length():b.length();
        char[] res = new char[len];
        for(int i=a.length()-1; i>=0; i--){
          aa[a.length()-1-i] = a.charAt(i);
        }
        for(int i=b.length()-1; i>=0; i--){
            bb[b.length()-1-i] = b.charAt(i);
        }
        for(int i=0; i<len; i++){
            char ca = i<a.length()?aa[i]:'0';
            char cb = i<b.length()?bb[i]:'0';
            char[] ch = add(ca,cb,carry);
            res[i] = ch[0];
            carry = (ch[1]=='1');
        }
        StringBuilder sb = new StringBuilder();
        if(carry){
            sb.append('1');
        }
        for(int i=len-1; i>=0; i--){
            sb.append(res[i]);
        }
        return sb.toString();
    }
    private char[] add(char a, char b, boolean carry){
        char[] res = new char[2];
        if(a=='0' && b=='0' ){
            if(carry){
                res[0]='1';
                res[1]='0';
            }else{
                res[0]='0';
                res[1]='0';
            }
        }else if((a=='0' && b=='1')||(a=='1' && b=='0')){
            if(carry){
                res[0]='0';
                res[1]='1';
            }else{
                res[0]='1';
                res[1]='0';
            }
        }else if(a=='1' && b=='1'){
            if(carry){
                res[0]='1';
                res[1]='1';
            }else{
                res[0]='0';
                res[1]='1';
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test23  t = new test23();
        System.out.println(t.addBinary("1010","1011"));
    }
}
