package leetcode_05;

public class lc507 {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1; i<num; i++){
            if(num%i == 0)
                sum += i;
        }
        if(sum == num)
            return true;
        return false;
    }

    public static void main(String[] args) {
        lc507 l = new lc507();
        System.out.println(l.checkPerfectNumber(28));
        System.out.println(l.checkPerfectNumber(6));
        System.out.println(l.checkPerfectNumber(496));
        System.out.println(l.checkPerfectNumber(8128));
        System.out.println(l.checkPerfectNumber(2));

    }
}
