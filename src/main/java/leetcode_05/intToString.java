package leetcode_05;

public class intToString {
    public String intToStr(int num){
        if(num == 0)
            return "0";
        String str = "";
        StringBuilder sb = new StringBuilder();
        sb = num < 0 ? sb.append("-"):sb;
        num = Math.abs(num);
        while(num != 0){
            str += num%10 + "";
            num = num/10;
        }
        for(int i=str.length()-1; i>=0; i--)
            sb.append(str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        intToString t = new intToString();
        System.out.println(t.intToStr(0));
        System.out.println(t.intToStr(1011));
        System.out.println(t.intToStr(-1010));
    }
}
