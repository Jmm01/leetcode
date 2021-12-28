package leetcode_05;

import java.util.HashMap;

public class lc383 {
    public boolean canConstruct(String ransomNote, String magazine){
        Boolean res = true;
        if(magazine.length() < ransomNote.length()){
            res = false;
        }else {
            HashMap<Character, Integer> map = new HashMap();
            char m;
            for(int k=0; k<magazine.length(); k++){
                m = magazine.charAt(k);
                if(map.containsKey(m))
                    map.put(m,map.get(m)+1);
                else
                    map.put(m,1);
            }
            char r;
            for (int i=0; i<ransomNote.length(); i++){
                r = ransomNote.charAt(i);
                if(!map.containsKey(r)){
                    res = false;
                    break;
                }else {
                    if(map.get(r) == 1)
                        map.remove(r);
                    else
                        map.put(r,map.get(r)-1);
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc383 l = new lc383();
        System.out.println(l.canConstruct("aa","ab"));
    }


}
