package leetcode_07;

import java.util.ArrayList;
import java.util.List;

public class lc51 {
    //N皇后问题：回溯法

    //存储结果集
    List<List<String>> res = new ArrayList<>();
    //标记每列以及左右对角线是否已经有皇后
    boolean[] col, dia1, dia2;

    //尝试在一个n皇后问题中，摆放第index行的皇后位置
    private void putQueen(int n, int index, int[] row){
        if(index == n){
            //将结果集row格式化为指定格式的矩阵
            res.add(generateBoard(n,row));
            return;
        }
        for(int i=0; i<n; i++){
            //尝试将第index行的皇后摆放在第i列
            if(!col[i] && !dia1[index+i] && !dia2[index-i+n-1]){
                row[index] = i;
                col[i] = true;
                dia1[index+i] = true;
                dia2[index-i+n-1] = true;
                putQueen(n,index+1,row);
                col[i] = false;
                dia1[index+i] = false;
                dia2[index-i+n-1] = false;
                row[index] = -1;
            }

        }
        return;
    }

    List<String> generateBoard(int n, int[] row) {
        List<String> board = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                if(j != row[i])
                    sb.append('.');
                else
                    sb.append('Q');
            }
            board.add(sb.toString());
        }
        return board;
    }


    public List<List<String>> solveNQueens(int n) {
        res.clear();
        col = new boolean[n];
        dia1 = new boolean[2*n-1];
        dia2 = new boolean[2*n-1];

        int[] row = new int[n];
        for(int i=0; i<n; i++){
            row[i] = -1;
        }
        putQueen(n,0,row);
        return res;
    }

    public static void main(String[] args) {
        lc51 lc = new lc51();
        System.out.println(lc.solveNQueens(4));
    }
}
