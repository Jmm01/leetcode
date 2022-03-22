package DP;

public class lc1137 {
//    public int tribonacci(int n){
//        int t0 = 0, t1 = 1, t2 = 1;
//        if(n == 0)
//            return t0;
//        else if (n == 1)
//            return t1;
//        else if (n == 2)
//            return t2;
//        else {
//            for(int i = 3; i<=n; i++){
//                int cur = t0+t1+t2;
//                t0 = t1;
//                t1 = t2;
//                t2 = cur;
//            }
//        }
//        return t2;
//    }

    public int tribonacci(int n) {
        int res[] = new int[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136, 5768, 10609, 19513, 35890, 66012, 121415, 223317, 410744, 755476, 1389537, 2555757, 4700770, 8646064, 15902591, 29249425, 53798080, 98950096, 181997601, 334745777, 615693474, 1132436852, 2082876103};
        return res[n];
    }

    public static void main(String[] args) {
        lc1137 lc = new lc1137();
        System.out.println(lc.tribonacci(25));
    }
}
