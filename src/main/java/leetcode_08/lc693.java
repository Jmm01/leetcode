package leetcode_08;

public class lc693 {
    public boolean hasAlternatingBits(int n) {
        boolean res = true;
        int temp1,temp2;
        while(n != 0){
            temp1 = n % 2;
            n = n / 2;
            temp2 = n % 2;
            if(temp1 == temp2){
                res = false;
                break;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc693 lc = new lc693();
        System.out.println(lc.hasAlternatingBits(11));
    }
}
