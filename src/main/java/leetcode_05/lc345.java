package leetcode_05;

import java.util.HashSet;

public class lc345 {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        HashSet set = new HashSet();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int l=0, r=s.length()-1;
        while(l<r){
            if(set.contains(ch[l])){
                if(set.contains(ch[r])){
                    char temp = ch[l];
                    ch[l] = ch[r];
                    ch[r] = temp;
                    l++;
                    r--;
                }else
                    r--;
            }else
                l++;
        }
        StringBuilder sb = new StringBuilder();
        for(char c:ch)
            sb.append(c);
        return sb.toString();

    }
}
