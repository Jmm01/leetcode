package leetcode_03;

public class test27 {
    //48. 旋转图像：要求原地翻转，不能另外使用新的矩阵
    //最终效果将M[i,j]位置的元素交换到M[j,n-1-i]处
    //每交换四个元素为一个循环。可以用一个变量temp来保存被覆盖位置的元素
    //M[i,j]-->M[j,n-i-1]-->M[n-i-1,n-j-1]-->M[n-j-1,i]
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n/2; i++){
            for(int j=0; j<(n+1)/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
}
