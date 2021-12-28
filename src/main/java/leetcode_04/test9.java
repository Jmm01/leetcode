package leetcode_04;

public class test9 {
    //01.06.字符串压缩
    public String compressString(String S) {
        if(S.length()<2)
            return S;
        StringBuilder str = new StringBuilder();
        char cur = ' ';
        char curNext = ' ';
        int num = 1;
        for(int i=0; i<S.length(); ){
            num = 1;
            cur = S.charAt(i);
            for(int j=i+1; j<S.length(); j++){
                curNext = S.charAt(j);
                if(cur == curNext)
                    num++;
                else {
                    str.append(cur);
                    str.append(num);
                    break;
                }
            }
            i = i+num;
        }
        str.append(cur);
        str.append(num);
        if(str.length()>=S.length())
            return S;
        else
            return str.toString();
    }

    public static void main(String[] args) {
        test9 t = new test9();
        System.out.println(t.compressString("aabbccd"));
    }
}
