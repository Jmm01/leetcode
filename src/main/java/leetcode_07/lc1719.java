package leetcode_07;

import java.util.*;

public class lc1719 {
//    private static final int size = 501;
//
//    public int checkWays(int[][] pairs) {
//        int ans = 1;
//        int m = pairs.length;
//        int[] pre = new int[size];
//        int[] nums = new int[size];
//        boolean[] vis = new boolean[size];
//        List<int[]> list = new ArrayList<>();
//        List<List<Integer>> edges = new ArrayList<>();
//
//        for (int i = 0; i < size; i++)
//            edges.add(new ArrayList<>());
//
//        for(int[] pair : pairs){
//            nums[pair[0]]++;
//            nums[pair[1]]++;
//            edges.get(pair[0]).add(pair[1]);
//            edges.get(pair[1]).add(pair[0]);
//            pre[pair[0]] = pre[pair[1]] = -1;
//        }

        //按照关系数来排序
//        List<Map.Entry<Integer,Integer>> list = new ArrayList(c.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
//            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2){
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });
//        ArrayList<Integer> res = new ArrayList();
//        for(Map.Entry<Integer,Integer> p:list){
//            res.add(p.getKey());
//        }
//
//        for(int[] pair:pairs){
//            if(c.get(pair[0]) == c.get(pair[1]))
//                ans = 2;
//        }
//        HashMap<Integer,Integer> par = new HashMap();
//        //判断根的关系数是否满足条件
//        if(c[res.get(0)] != n-1)
//            ans = 0;
//        else{
//            for(int i:res){
//                //将所有节点先挂在根节点下
//                par.put(i,res.get(0));
//            }
//            Boolean f = true;
//            boolean[] vis = new boolean[501];
//            for (int i=1; i<n; i++){
//                for(int v:g[res[i]]){
//                    if(!vis.continus(v)){
//                        if(par[v] != par[res[i]]){
//                            //判断是否能够更新
//                            ans = 0;
//                            f = false;
//                            break;
//                        }
//                        //将v挂到当前节点res[i]下
//                        par[v] = res[i];
//                    }
//                }
//                if(!f){
//                    vis.add(res[i])
//                }
//            }
//        }
//        return ans;
//
//    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> c = new HashMap();
        c.put(1,3);
        c.put(20,5);
        c.put(10,1);
        c.put(12,10);
        List<Map.Entry<Integer,Integer>> list = new ArrayList(c.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2){
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        String string = list.toString();
        System.out.println(string);

    }
}
