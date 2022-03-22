package DP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lc119 {
    static List<List<Integer>> ress = new ArrayList<>();
    static void getRess(){
//        使用Stream在list初始化时赋值
//        List<String> list = Stream.of("a", "b", "c").collect(Collectors.toList());
        ress.add(Stream.of(1).collect(Collectors.toList()));
        ress.add(Stream.of(1,1).collect(Collectors.toList()));
        for(int i=2; i<=33; i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j=1; j<i; j++){
                list.add(ress.get(i-1).get(j-1)+ress.get(i-1).get(j));
            }
            list.add(1);
            ress.add(list);
        }
    }
    public List<Integer> getRow(int rowIndex) {
        if(this.ress.size() == 0)
            this.getRess();
        List<Integer> res = new ArrayList<>();
        res = ress.get(rowIndex);
        return res;
    }
}
