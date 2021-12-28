package leetcode_03;

public class test27 {
    //48. ��תͼ��Ҫ��ԭ�ط�ת����������ʹ���µľ���
    //����Ч����M[i,j]λ�õ�Ԫ�ؽ�����M[j,n-1-i]��
    //ÿ�����ĸ�Ԫ��Ϊһ��ѭ����������һ������temp�����汻����λ�õ�Ԫ��
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
