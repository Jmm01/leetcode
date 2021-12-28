package leetcode_05;

import java.util.*;

//lc911
class TopVotedCandidate {
    private int[] persons;
    private int[] times;
    private int indexT;
    List<Integer> list = new ArrayList<>();
    public TopVotedCandidate(int[] persons, int[] times) {
        this.persons = persons;
        this.times = times;
        int cur;
        int val = 0;
        HashMap<Integer,Integer> hashMap = new LinkedHashMap();
        for(int i=0; i<times.length; i++){
            cur = persons[i];
            hashMap.put(cur,hashMap.getOrDefault(cur, 0) + 1);
            if(hashMap.get(cur) >= val){
                val = hashMap.get(cur);
                list.add(cur);
            }else {
                list.add(list.get(i-1));
            }
        }
    }

    public int q(int t) {
        //默认是indexT位置的候选人，如果有人票数比他多，再替代，平局时以indexT时刻优先
        indexT = t == 0 ? 0 : t >= times[times.length-1] ? times.length-1 : find(t,times,0,times.length-1);
        return  list.get(indexT);
    }

    //二分查找，在数组times中查找t在的位置范围
    //times[i] <= t < times, 返回i
    private int find(int t, int[] times, int begin, int end){
        int b = begin;
        int e = end;
        int cur = (b+e)/2;
        if(times[cur] <= t && times[cur+1] > t ){
            indexT = cur;
        }else if(times[cur+1] <= t){
            find(t,times,cur+1,e);
        }else if(times[cur] > t){
            find(t,times,b,cur);
        }
        return indexT;
    }

    public static void main(String[] args) {
        int[] times = new int[]{0,67,69,74,87};
        int[] persons = new int[]{0,0,1,1,2};
        TopVotedCandidate obj = new TopVotedCandidate(persons, times);
        System.out.print(obj.q(4));
        System.out.print(obj.q(62));
        System.out.print(obj.q(100));
        System.out.print(obj.q(88));
        System.out.print(obj.q(70));
        System.out.print(obj.q(73));
        System.out.print(obj.q(22));
        System.out.print(obj.q(75));
        System.out.print(obj.q(29));
        System.out.println(obj.q(10));
        System.out.println("0011000100");
    }
}


/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 *
 */

