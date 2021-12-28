package leetcode_05;

public class lc1154 {
    public int dayOfYear(String date){
        int res = 0;
        int[] year1 = new int[]{0,0,31,59,90,120,151,181,212,243,273,304,334};
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8));
        res = year1[month] + day;
        //判断是否是闰年
        if((year%4==0 && year%100!=0 && month>2) || (year%400==0 && month>2))
            res += 1;
        return res;
    }

    public static void main(String[] args) {
        lc1154 l = new lc1154();
        System.out.println(l.dayOfYear("2019-01-09"));
        System.out.println(l.dayOfYear("2019-02-10"));
        System.out.println(l.dayOfYear("2003-03-01"));
        System.out.println(l.dayOfYear("2004-03-01"));
        System.out.println(l.dayOfYear("2004-00-06"));
    }
}
