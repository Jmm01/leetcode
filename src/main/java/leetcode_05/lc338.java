package leetcode_05;

public class lc338 {
    public int[] countBits(int n){
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i=0; i<=n; i++)
            res[i] = i%2 == 1 ? res[i-1] + 1 : res[i/2];
        return res;
    }
//    //计算一个数字的二进制中1的数量
//    private int findOne(int num){
//        int res = 0;
//        for(int i = 31;i >= 0; i--) {
//            if((num >>> i & 1)== 1)
//                res ++;
//        }
//        return res;
//    }

    public static void main(String[] args) {
        lc338 l = new lc338();
        l.countBits(5);
    }
}
