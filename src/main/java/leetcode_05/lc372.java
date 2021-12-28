package leetcode_05;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class lc372 {
    int MOD = 1337;
    public int superPow(int a, int[] b){
        if(a == 1)
            return 1;
        a = a % MOD;
        int res = 1;
        for(int i=0; i<b.length; i++){
            res = quickPow(res,10) * quickPow(a, b[i]) % MOD;
        }
        return res;
    }
    //计算a的num次方
    private int quickPow(int a, int num){
        if(a == 1 || num == 0)
            return 1;
        else if(num % 2 == 1){
            //如果num是奇数，就每次减一递归计算%1337的值
            return quickPow(a,num-1) * a % MOD;
        }else {
            //如果num是偶数，每次除以二计算%1337的值，再乘以本身再取模
            int temp = quickPow(a, num/2) % 1337;
            return (temp * temp % 1337);
        }

    }

    public static void main(String[] args) {
        lc372 l = new lc372();
        int a = 2;
        int[] b = new int[]{1,0};
        System.out.println(l.superPow(a,b));
    }
}
