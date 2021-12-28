package leetcode_05;

import java.io.*;

public class lc686 {
    public int repeatedStringMatch(String a, String b){
        StringBuilder sb = new StringBuilder();
        int res = 0;
        while(sb.length() < b.length()){
            sb.append(a);
            res ++;
        }
        sb.append(a);
        int index = sb.indexOf(b);
        if(index == -1)
            return -1;
        else
            return  index + b.length() > a.length() * res ? res+1 : res;
    }

    public static void main(String[] args) throws IOException {
        lc686 l = new lc686();
        System.out.println(l.repeatedStringMatch("abcd", "cdabcdab"));
    }

    public int repeatedStringMatch2(String a, String b){
        if(a.length() >= b.length()){
            if (a.contains(b)) {
                return 1;
            }
             a = a + a;
            if(a.contains(b)){
                return 2;
            }
        }else{
            int n = b.length() / a.length();
            if(b.length() % a.length() != 0){
                n = n + 1;
            }
            String as = a;
            for(int i = 1;i < n; i++ ){
                as = as + a;
            }
            if(as.contains(a)){
                return n;
            }
            as  = as + n;
            if(as.contains(a)){
                return n + 1;
            }
            as = as + as;
            if(as.contains(a)){
                return 2 * n;
            }
        }
        return -1;
    }
}
