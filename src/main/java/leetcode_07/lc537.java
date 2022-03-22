package leetcode_07;

public class lc537 {
    public String complexNumberMultiply(String num1, String num2) {

        int i1 = Integer.parseInt(num1.substring(0,num1.indexOf("+")));
        System.out.println(i1);
        int j1 = Integer.parseInt(num1.substring(num1.indexOf("+")+1,num1.length()-1));
        System.out.println(j1);
        int i2 = Integer.parseInt(num2.substring(0,num2.indexOf("+")));
        System.out.println(i2);
        int j2 = Integer.parseInt(num2.substring(num2.indexOf("+")+1,num2.length()-1));
        int a = i1 * i2 - j1 * j2;
        int b = i1 * j2 + j1 * i2;
        return a+"+"+b +"i";
    }

    public static void main(String[] args) {
        lc537 lc = new lc537();
        System.out.println(lc.complexNumberMultiply("1+1i","1+1i"));
    }


}
