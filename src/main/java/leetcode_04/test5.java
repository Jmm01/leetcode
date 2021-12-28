package leetcode_04;

public class test5 {
    //96.不同的二叉搜索树
    //卡塔兰数
    public int numTrees(int n) {
        if(n==1)
            return 1; 
        long res = 1;
        for(int i=0; i<n; i++){
            res = (res*2*(2*i+1))/(i+2);
        }
        return (int) res;
    }

    public static void main(String[] args) {
        test5 t = new test5();
        System.out.println(t.numTrees(3));
    }
}
