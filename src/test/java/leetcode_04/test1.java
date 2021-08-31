package leetcode_04;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    //54.螺旋矩阵
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0)
            return res;
        int left = 0, right = matrix[0].length-1, up = 0, down = matrix.length-1;
        while(down >= up && right >= left){
            if(left>=0 && right>=0 && up>=0 && down>=0)
                spira(matrix,left,right,up,down,res);
            left++;
            right--;
            up++;
            down--;
        }
        return res;
    }
    //定义私有函数，每次将矩阵的指定位置的一圈数据加入到结果集。
    private List<Integer> spira(int[][] matrix, int left, int right, int up, int down, List res){
        //添加上面一行元素
        for(int i= left; i<=right; i++)
            res.add(matrix[up][i]);
        //添加右边一列元素
        if(up+1<down){
            for(int i=up+1; i<down; i++)
                res.add(matrix[i][right]);
        }
        //添加下面一行元素
        if(up!=down){
            for(int i=right; i>=left; i--)
                res.add(matrix[down][i]);
        }
        //添加左边一列元素
        if(down-1 > left && left != right){
            for(int i=down-1; i>left; i--)
                res.add(matrix[i][left]);
        }
        return res;
    }

    public static void main(String[] args) {
        test1 t = new test1();
        int[][] m = new int[][]{{1,2,3},{4,5,6}};
        System.out.println(t.spiralOrder(m));
    }
}
