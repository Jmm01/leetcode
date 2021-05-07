package leetcode_02;

public class test6 {
//    public boolean isPerfectSquare(int num) {
//        int temp = 0;
//        boolean res = false;
//        for(int i=0; i<Math.pow(2,16); i++){
//            temp = i*i;
//            if(temp == num){
//                res = true;
//                break;
//            }else if(temp > num)
//                break;
//        }
//        return res;
//    }
    public boolean isPerfectSquare(int num){
        double newNum = num/1.0;
        double d = Math.sqrt(newNum);
        //Math.floor();
        return ((long) d) + 0.0 == d;
    }

    public static void main(String[] args) {
        test6 t =new test6();
        System.out.println(t.isPerfectSquare(5));
    }
}
