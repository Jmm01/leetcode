package leetcode_09;

public class lc806 {
    public int[] numberOfLines(int[] widths, String s) {
        int rowWidth = 100;
        int column = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int width = widths[ch-'a'];
            if(rowWidth >= width){
                //每次拿当前行宽减去当前字符宽度
                rowWidth = rowWidth - width;
            }else {
                //如果当前行的宽度不够减去当前字符的宽度时，让行数加一，从下一行开始
                column++;
                rowWidth = 100 - width;
            }
        }
        int[] res = new int[2];
        res[0] = column + 1;
        res[1] = 100 - rowWidth;
        return res;
    }

    public static void main(String[] args) {
        lc806 lc = new lc806();
        lc.numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"abcdefghijklmnopqrstuvwxyz");
        lc.numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"bbbcccdddaaa");

    }
}
