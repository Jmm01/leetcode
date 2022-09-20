package leetcode_09;

import java.util.ArrayList;
import java.util.List;

public class lc386 {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1; i<10; i++){
            dfs(i,n,res);
        }
        return res;
    }
    private void dfs(int k, int n, List<Integer> res){
        if(k <= n){
            res.add(k);
            int t = 10*k;
            if(t <= n){
                for (int i=0; i<10; i++){
                    dfs(t+i,n ,res);
                }
            }
        }
    }

    public static void main(String[] args) {
        lc386 lc = new lc386();
        System.out.println(lc.lexicalOrder(13));
    }
}
