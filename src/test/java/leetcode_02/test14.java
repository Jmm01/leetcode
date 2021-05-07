package leetcode_02;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class test14 {
    public int longestPalindrome(String s) {
        int sum=0;
        boolean falg = true;
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        Set<Character> set = new TreeSet<Character>();
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            set.add(temp);
            if(map.containsKey(temp))
                map.put(temp, map.get(temp)+1);
            else
                map.put(temp, 1);
        }

        for(char c:set){
            if(map.get(c)%2==1){
                sum++;
                if(sum != 0)
                    falg = false;
            }
        }
        if(falg)
            return s.length()-sum;
        else
            return s.length()-sum + 1;
    }

    public static void main(String[] args) {
        test14 t =new test14();
        System.out.println(t.longestPalindrome("dddaa"));
        System.out.println('9'-48);
    }

}
