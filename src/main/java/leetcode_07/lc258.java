package leetcode_07;

public class lc258 {
    public int addDigits(int num) {
        while(num >= 10)
            num = num/10 + num%10;
        return num;

//        return (num - 1) % 9 + 1;

    }

    public static void main(String[] args) {
        lc258 lc = new lc258();
        System.out.println(lc.addDigits(38));
        System.out.println(lc.addDigits(10));
    }
}
