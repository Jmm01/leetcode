package DP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lc118 {
    static List<List<Integer>> ress = new ArrayList<>();
    static void getRess(){
//        使用Stream在list初始化时赋值
//        List<String> list = Stream.of("a", "b", "c").collect(Collectors.toList());
        ress.add(Stream.of(1).collect(Collectors.toList()));
        ress.add(Stream.of(1,1).collect(Collectors.toList()));
        for(int i=2; i<=30; i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j=1; j<i; j++){
                list.add(ress.get(i-1).get(j-1)+ress.get(i-1).get(j));
            }
            list.add(1);
            ress.add(list);
        }
    }
    public List<List<Integer>> generate(int numRows) {
        if(this.ress.size() == 0)
            this.getRess();
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            res.add(ress.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        lc118 lc = new lc118();
        lc.generate(5);
    }
}
