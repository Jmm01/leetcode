package leetcode_09;

public class lc821 {
    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int temp = 0;
        boolean flag = false;
        //先从左往右遍历一遍，将出现c之前的位置初始化为-1；
        //出现c之后，每个位置计算与右边最近的c的距离；
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                flag = true;
                res[i] = 0;
                temp = 0;
            }else if(flag){
                res[i] = ++temp;
            }else if(!flag)
                res[i] = -1;
        }
        temp = 0;
        flag = false;
        for (int i=s.length()-1; i>=0; i-- ){
            if(s.charAt(i) == c){
                flag = true;
                res[i] = 0;
                temp = 0;
            }else if(flag){
                temp++;
                if(res[i] == -1)
                    res[i] = temp;
                else
                    res[i] = Math.min(temp, res[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        lc821 lc = new lc821();
        lc.shortestToChar("loveleetcode",'e');
        lc.shortestToChar("abaa",'b');

    }
}
