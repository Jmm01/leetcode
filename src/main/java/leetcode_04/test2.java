package leetcode_04;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    //59.螺旋矩阵II
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if(n == 0)
            return res;
        int left = 0, right = n-1, up = 0, down = n-1,begin = 1;
        while(down >= up && right >= left){
            if(left>=0 && right>=0 && up>=0 && down>=0)
                begin = initMatrix(res,left,right,up,down,begin);
            left++;
            right--;
            up++;
            down--;
        }
        return res;
    }
    //定义私有函数，每次给矩阵的指定位置的一圈赋值。
    private int initMatrix(int[][] res, int left, int right, int up, int down, int begin){
        //赋值上面一行元素
        for(int i= left; i<=right; i++){
            res[up][i] = begin;
            begin++;
        }
        //赋值右边一列元素
        if(up+1<down){
            for(int i=up+1; i<down; i++){
                res[i][right] = begin;
                begin++;
            }
        }
        //赋值下面一行元素
        if(up!=down){
            for(int i=right; i>=left; i--) {
                res[down][i] = begin;
                begin++;
            }
        }
        //赋值左边一列元素
        if(down-1 > left && left != right){
            for(int i=down-1; i>left; i--) {
                res[i][left] = begin;
                begin++;
            }
        }
        return begin;
    }

    public static void main(String[] args) {
        test2 t = new test2();
        System.out.println(t.generateMatrix(3));
    }
}
