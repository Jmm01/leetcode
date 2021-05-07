package leetcode_02;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.ArrayList;

public class test7 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length())
            return false;
        else {
            ArrayList arrayList = new ArrayList();
            for(int i=0; i<magazine.length(); i++)
                arrayList.add(magazine.charAt(i));
            for(int i=0; i<ransomNote.length(); i++){
                char temp = ransomNote.charAt(i);
                if(arrayList.contains(temp)){
                    arrayList.remove((Object) temp);
                    if(arrayList == null)
                        return false;
                }else
                    return false;
            }
        }
    return true;
    }

    public static void main(String[] args) {
        test7 t = new test7();
        String a = "abcd";
        String b = "dacdb";
        System.out.println(t.canConstruct(a,b));
    }

}
