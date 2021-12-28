package leetcode_02;

public class test13 {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        char[] schar = new char[s.length()];
        for(int k=0; k<s.length(); k++)
            schar[k] = s.charAt(k);
        char[] tchar = new char[t.length()];
        for(int k=0; k<t.length(); k++)
            tchar[k] = t.charAt(k);
        int temp = -1;
        for(char ss:schar){
            temp = index(tchar,ss,temp+1,tchar.length);
            if(temp == -1){
                return false;
            }
        }
        return true;
    }
    private int index(char[] chars, char c, int start, int end){
        for(int i = start; i<end; i++){
            if(chars[i]==c){
                return i;
            }
        }
        return -1;
    }

}
