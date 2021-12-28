package leetcode_01;

public class test16 {
    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int i=0,j=A.length-1;
        for(int k=0; k<A.length; k++){
            if(A[k]%2 == 0){
                res[i] = A[k];
                i++;
            }else{
                res[j] = A[k];
                j--;
            }
        }
        return res;
    }
}
