package leetcode_06;

import java.util.*;

public class lc347 {
    //优先队列自定义比较器，在线排序，遍历map效率比较好的entrySet和iterator;
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length; i++)
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);

        PriorityQueue<Integer[]> priorityQueue = new PriorityQueue<Integer[]>(10, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1]-o2[1];
            }
        });

        Iterator<Map.Entry<Integer,Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            Integer value = next.getValue();
            Integer key = next.getKey();
            if(priorityQueue.size() == k){
                Integer[] peek = priorityQueue.peek();
                if(value > peek[1]){
                    priorityQueue.poll();
                    priorityQueue.add(new Integer[]{key,value});
                }
            }else
                priorityQueue.add(new Integer[]{key,value});
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++)
            res[i] = priorityQueue.poll()[0];

        return res;
    }

    public static void main(String[] args) {
        lc347 l = new lc347();
        System.out.println(l.topKFrequent(new int[]{1,1,1,2,2,3},2));
    }
}
