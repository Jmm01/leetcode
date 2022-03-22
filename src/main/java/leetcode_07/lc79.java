package leetcode_07;

import java.util.Arrays;

public class lc79 {
    int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
    int m,n;
    char[][] board;
    String word;
    boolean[][] visited;

    boolean inArea(int x, int y){
        return x>=0 && x<m && y>=0 && y<n;
    }

    //从board[startx][starty]开始，寻找word[index...word.size()]
    private boolean searchWord( int index, int startx, int starty){
        if(index == word.length()-1)
            return board[startx][starty] == word.charAt(index);

        if(board[startx][starty] == word.charAt(index)){
            visited[startx][starty] = true;
            //从startx，starty出发，向四个方向寻找
            for(int i=0; i<4; i++){
                int newx = startx + d[i][0];
                int newy = starty + d[i][1];
                if(inArea(newx, newy) && !visited[newx][newy] && searchWord(index+1, newx,newy))
                    return true;
            }
            visited[startx][starty] = false;
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        this.board = board;
        this.word = word;

        visited = new boolean[m][n];

        for(int i=0; i<board.length; i++)
            for(int j=0; j<board[i].length; j++)
                if(searchWord(0, i, j))
                    return true;

        return false;
    }

    public static void main(String[] args) {
        lc79 lc = new lc79();
        lc.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED");
    }
}
