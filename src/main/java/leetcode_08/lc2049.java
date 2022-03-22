package leetcode_08;

import java.util.ArrayList;
import java.util.List;

public class lc2049 {
    //深度优先搜索
    long maxScore = 0;
    int cnt = 0;
    int n;
    List<Integer>[] children;

    public int countHighestScoreNodes(int[] parents) {
        //记录所有节点个数
        n = parents.length;
        //定义用来记录某个节点的子节点个数的数组
        children = new List[n];
        //初始化children数组内每个位置为一个ArrayList
        for(int i=0; i<n; i++){
            children[i] = new ArrayList<Integer>();
        }
        //处理传进来的数组元素，按照parents[i]的值来存在children数组的对应位置
        //parents[i]的值即当前节点的父节点，所以只要不是-1，就不是根节点，就需要存放在它父节点对应的children数组中
        for(int i=0; i<n; i++){
            int p = parents[i];
            if(p != -1){
                children[p].add(i);
            }
        }

        dfs(0);
        return cnt;
    }

    public int dfs(int node){
        long score = 1;
        int size = n-1;
        //遍历传进来的node的子节点们
        //对子节点继续进行深度优先搜索
        //同时记录分数和未遍历到的节点个数
        for (int c : children[node]){
            int t = dfs(c);
            score *= t;
            size -= t;
        }
        if(node != 0){
            score *= size;
        }
        if(score == maxScore){
            cnt++;
        }else if(score > maxScore){
            maxScore = score;
            cnt = 1;
        }
        return n-size;
    }
}
