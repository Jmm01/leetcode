package leetcode_06;

public class lc76 {
    //滑动窗口
    public String minWindow(String s, String t) {
        if(s.length() < t.length())
            return "";

        //遍历t的字母频率
        int tFreq[] = new int[64];
        for(int i=0; i<t.length(); i++){
            tFreq[t.charAt(i)-'A']++;
        }
        //定义左右边界
        int l=0, r=-1;
        int winLen = s.length()+1;
        String minRes = "";

        int sFreq[] = new int[64];
        while(l < s.length()-t.length()+1){
            if(r-l+1 < t.length() || !is(sFreq, tFreq)){
                if(r + 1 < s.length())
                    sFreq[s.charAt(++r)-'A']++;
                else if(r + 1 == s.length())
                    l++;
            }else {
                while(is(sFreq, tFreq))
                    sFreq[s.charAt(l++)-'A']--;
                if(winLen > r-l+2){
                    winLen = r-l+2;
                    minRes = s.substring(l-1,r+1);
                }
            }
        }
        return minRes;
    }
    //判断s的l-r是否包含t
    boolean is(int[] sFreq, int[] tFreq){
        int k=0;
        while(k < 64){
            if(tFreq[k] > sFreq[k]){
                return false;
            }
            k++;
        }
        return true;
    }

    public static void main(String[] args) {
        lc76 l = new lc76();
        System.out.println(l.minWindow("ADOBECODEBANC","ABC"));
        System.out.println(l.minWindow("a","a"));
        System.out.println(l.minWindow("a","aa"));
    }
}
