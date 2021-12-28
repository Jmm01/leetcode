package leetcode_03;

import java.util.TreeSet;

public class test23 {
    public boolean isValidSudoku(char[][] board) {
        return rowisValid(board) && colisValid(board) && blockisValid(board);
    }
    //�ж������Ƿ���Ч
    private boolean rowisValid(char[][] ch){
        for(int i=0; i<9; i++){
            TreeSet set = new TreeSet();
            char[] c = ch[i];
            for(char cc:c){
                //��¼���Ԫ��ǰ��size
                int tempsize = set.size();
                int size;
                //���Ԫ�ز���.����ӵ�set��
                if(cc != '.'){
                    set.add(cc);
                    size = set.size();
                    //���sizeû�иı�,˵����ӵ�����Ϊ�ظ��ģ�������Ч
                    if(size == tempsize)
                        return false;
                }
            }
        }
        return true;
    }
    //�ж������Ƿ���Ч
    private boolean colisValid(char[][] ch){
        for(int i=0; i<9; i++){
            TreeSet set = new TreeSet();
            for(int j=0; j<9; j++){
                //��¼���Ԫ��ǰ��size
                int tempsize = set.size();
                int size;
                if(ch[j][i] != '.'){
                    set.add(ch[j][i]);
                    size = set.size();
                    //���sizeû�иı�,˵����ӵ�����Ϊ�ظ��ģ�������Ч
                    if(size == tempsize)
                        return false;
                }
            }
        }
        return true;
    }
    //�ж�����3��3�Ź������Ƿ���Ч
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
    //�ж�ĳ��3��3�Ź������Ƿ���Ч
    //begin-end�еĵ�index���Ź���index=1��2��3
    private boolean oneisValid(int begin,int end, int index,char[][] ch) {
        TreeSet set = new TreeSet();
        for (int i = begin; i < end; i++) {
            for (int j = (index - 1) * 3; j < 3 * index; j++) {
                //��¼���Ԫ��ǰ��size
                int tempsize = set.size();
                int size;
                if (ch[j][i] != '.') {
                    set.add(ch[j][i]);
                    size = set.size();
                    //���sizeû�иı�,˵����ӵ�����Ϊ�ظ��ģ�������Ч
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
