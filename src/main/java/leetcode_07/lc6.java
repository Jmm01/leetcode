package leetcode_07;

import java.util.ArrayList;
import java.util.List;

public class lc6 {
    public String convert(String s, int numRows) {
        if(s.length()<=2 || numRows<2)
            return s;
        List<StringBuilder> rows = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            rows.add(new StringBuilder());
        }
        int i=0, flag = -1;
        for(char c:s.toCharArray()){
            //把每个字符 c 填入对应行i;
            rows.get(i).append(c);
            if(i == 0 || i == numRows-1)
                //在达到 ZZ 字形转折点时，执行反向
                flag = -flag;
            //更新当前字符 c 对应的行索引;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row:rows)
            res.append(row);
        return res.toString();
    }

    public static void main(String[] args) {
        lc6 lc = new lc6();
        System.out.println(lc.convert("leetcod",3));
    }
}
