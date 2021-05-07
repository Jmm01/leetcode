package leetcode_01;

import java.util.ArrayList;
import java.util.List;

public class test13 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if(numRows == 0){
            return null;
        }else if(numRows == 1){
            list.add(1);
            res.add(list);
            return res;
        }else {
            List<List<Integer>>  newList = generate(numRows-1);
            List<Integer> templist = new ArrayList<Integer>();
            templist = newList.get(numRows-2);
            list.add(1);
            for(int i=0; i<templist.size();i++){
                if(i!=templist.size()-1){
                    int temp = templist.get(i)+templist.get(i+1);
                    list.add(temp);
                }else {
                    int temp = templist.get(i);
                    list.add(temp);
                }
            }
            newList.add(list);
            return newList;
        }

    }
    public static void main(String[] args) {
        test13 t =new test13();
        System.out.println(t.generate(5));

    }
}
