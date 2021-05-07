package leetcode_01;

public class test4 {
    public String countAndSay(int n) {
        char flag = '0';
        int i = 1;
        String res = "";
        if(n<1 || n>30){
            return "";
        }
        if(n == 1){
            res ="1";
            return res;
        }else if(n == 2){
            res ="11";
            return res;
        }else{
            String c = countAndSay(n-1);
            flag = c.charAt(0);
            for(int j=1; j<c.length();j++){
                if(c.charAt(j)==flag){
                    i++;
                    if(j == c.length()-1){
                        res = res +i+flag;
                    }
                }else{
                    res = res +i+flag;
                    flag = c.charAt(j);
                    i = 1;
                    if(j == c.length()-1){
                        res = res +i+flag;
                    }
                }
            }
            return res;
        }
    }
    public static void main(String[] args) {
        test4 t = new test4();

        System.out.println(t.countAndSay(7));
    }
}
