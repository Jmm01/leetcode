package leetcode_01;

import java.util.ArrayList;
import java.util.List;

public class test15 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        if(rowIndex == 0){
            res.add(1);
            return res;
        }else {
            List<Integer> newList = getRow(rowIndex-1);
            res.add(1);
            for(int i=0; i<newList.size();i++){
                if(i!=newList.size()-1){
                    int temp = newList.get(i)+newList.get(i+1);
                    res.add(temp);
                }else {
                    int temp = newList.get(i);
                    res.add(temp);
                }
            }
            return res;
        }

    }
    public static void main(String[] args) {
        //leetcode_01.test15 t =new leetcode_01.test15();
        //System.out.println(t.getRow(3));
        String s = "hello world";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(i == 5){
                System.out.println(c);
            }
        }


    }
}
