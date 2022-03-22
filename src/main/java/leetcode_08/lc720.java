package leetcode_08;

import java.util.Arrays;
import java.util.HashSet;

public class lc720 {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String res = new String();
        HashSet<String> set = new HashSet();
        String temp = new String();
        for(String word:words){
            if(word.length() == 1 || set.contains(word.substring(0,word.length()-1))){
                res = word.length() > res.length() ? word:res;
                set.add(word);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc720 lc = new lc720();
        System.out.println(lc.longestWord(new String[]{"yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"}));//yodn
        System.out.println(lc.longestWord(new String[]{"rac","rs","ra","on","r","otif","o","onpdu","rsf","rs","ot","oti","racy","onpd"}));//otif
        System.out.println(lc.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
    }
}
