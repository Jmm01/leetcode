package leetcode_01;

public class test6 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int i = len-1;
        int th = 9;
        digits[i] += 1;
        if (digits[i] > th){
            while(i > 0 && digits[i] > th){
                digits[i] = 0;
                digits[--i] += 1;
            }
            if (i == 0 && digits[i] > th){
                digits = new int[len+1];
                digits[0] = 1;
            }
        }
            return digits;
        }

  /*  public int[] plus(int[] res,int[] digits){





        String s = "";
        for(int i=0; i<digits.length; i++){
            s = s+ String.valueOf(digits[i]);
        }
        int i=Integer.valueOf(s).intValue();
        i++;
        String str=String.valueOf(i);
        System.out.println(str.length());
        for(int j=0; j<str.length(); j++){
            char ch = str.charAt(j);
            int c = Integer.parseInt(String.valueOf(ch));
            res[j] = c;
        }
        return res;
    }
    public int[] plusOne(int[] digits) {
        boolean flag = true;
        for(int dig:digits){
            if(dig !=9){
                flag = false;
                break;
            }
        }
        if(flag){
            int[] res = new int[digits.length+1];
            return res = plus(res,digits);
            } else{
            int[] res = new int[digits.length];
            return res = plus(res,digits);
        }*/

    public static void main(String[] args) {
        test6 t = new test6();
        int[] digits = new int[]{9,9};
        System.out.println(t.plusOne(digits));
    }
}
