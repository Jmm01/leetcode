package leetcode_03;

import java.util.TreeSet;

public class test23 {
    public boolean isValidSudoku(char[][] board) {
        return rowisValid(board) && colisValid(board) && blockisValid(board);
    }
    //判断行内是否有效
    private boolean rowisValid(char[][] ch){
        for(int i=0; i<9; i++){
            TreeSet set = new TreeSet();
            char[] c = ch[i];
            for(char cc:c){
                //记录添加元素前的size
                int tempsize = set.size();
                int size;
                //如果元素不是.就添加到set中
                if(cc != '.'){
                    set.add(cc);
                    size = set.size();
                    //如果size没有改变,说明添加的数字为重复的，数独无效
                    if(size == tempsize)
                        return false;
                }
            }
        }
        return true;
    }
    //判断列内是否有效
    private boolean colisValid(char[][] ch){
        for(int i=0; i<9; i++){
            TreeSet set = new TreeSet();
            for(int j=0; j<9; j++){
                //记录添加元素前的size
                int tempsize = set.size();
                int size;
                if(ch[j][i] != '.'){
                    set.add(ch[j][i]);
                    size = set.size();
                    //如果size没有改变,说明添加的数字为重复的，数独无效
                    if(size == tempsize)
                        return false;
                }
            }
        }
        return true;
    }
    //判断所有3×3九宫格内是否有效
    private boolean blockisValid(char[][] ch){
        return oneisValid(0,3, 1, ch)&&
                oneisValid(0,3, 2, ch)&&
                oneisValid(0,3, 3, ch)&&
                oneisValid(3,6, 1, ch)&&
                oneisValid(3,6, 2, ch)&&
                oneisValid(3,6, 3, ch)&&
                oneisValid(6,9, 1, ch)&&
                oneisValid(6,9, 2, ch)&&
                oneisValid(6,9, 3, ch);

    }
    //判断某个3×3九宫格内是否有效
    //begin-end列的第index个九宫格，index=1，2，3
    private boolean oneisValid(int begin,int end, int index,char[][] ch) {
        TreeSet set = new TreeSet();
        for (int i = begin; i < end; i++) {
            for (int j = (index - 1) * 3; j < 3 * index; j++) {
                //记录添加元素前的size
                int tempsize = set.size();
                int size;
                if (ch[j][i] != '.') {
                    set.add(ch[j][i]);
                    size = set.size();
                    //如果size没有改变,说明添加的数字为重复的，数独无效
                    if (size == tempsize)
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        test23 t = new test23();
        char[][] board = new char[][]{  new char[]{'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                                        new char[]{'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                                        new char[]{'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                                        new char[]{'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                                        new char[]{'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                                        new char[]{'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                                        new char[]{'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                                        new char[]{'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                                        new char[]{'.', '.', '4', '.', '.', '.', '.', '.', '.'}};
        System.out.println(t.isValidSudoku(board));
    }
}
