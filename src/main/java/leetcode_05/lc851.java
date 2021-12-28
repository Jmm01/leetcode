package leetcode_05;

import java.util.*;

public class lc851 {
    //动态规划+拓扑排序
    //1. 先把入度为0 的节点找到并打印
    //2. 删掉入度为0的节点，继续循环1的步骤，直至图为null。
    public int[] loudAndRich(int[][] richer, int[] quiet){
        int n = quiet.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] in = new int[n];
        //遍历richer数组，将person[a]作为key值， 指向比他穷的b存在list中作为value值
        for(int[] r:richer){
            int a = r[0];
            int b = r[1];
            List<Integer> list = map.getOrDefault(a, new ArrayList<>());
            list.add(b);
            map.put(a,list);
            //每当有一个person[a]指向person[b]，b的入度值就加一，将每个节点的入度值存在in数组中
            in[b]++;
        }
        Deque<Integer> d = new ArrayDeque<>();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = i;
            //如果某个节点的入度值为0，就放到队列中
            if(in[i] == 0){
                d.addLast(i);
            }
        }
        while(!d.isEmpty()){
            //只要队列不为空，就取出队首元素
            int t = d.pollFirst();
            //找出map中该元素对应的value值，即没有他富有的persons的list
            for(int u : map.getOrDefault(t, new ArrayList<>())){
                //当前的t肯定比u富有，如果t比u安静，那么u处对应的最富有且安静的人为t
                if(quiet[ans[t]] < quiet[ans[u]])
                    ans[u] = ans[t];
                //如果u的入度值为0，就放到队列中去
                if(--in[u] == 0)
                    d.addLast(u);
            }
        }
        return ans;
    }
}
