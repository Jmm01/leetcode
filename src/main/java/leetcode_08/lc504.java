package leetcode_08;

public class lc504 {
    public String convertToBase7(int num) {
        final int cs = 7;
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        //商
        int s = num / cs;
        //余数
        int ys = num % cs;
        if(ys < 0){
            flag = true;
            ys = -ys;
        }
        sb.append(ys);
        //直到商为0；
        while(s != 0){
            num = s;
            s = num / cs;
            ys = num % cs;
            if(ys < 0){
                flag = true;
                ys = -ys;
            }
            sb.append(ys);
        }
        if(flag){
            return sb.append("-").reverse().toString();
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        lc504 lc = new lc504();
        System.out.println(lc.convertToBase7(100));
        System.out.println(lc.convertToBase7(-1));

    }
}
