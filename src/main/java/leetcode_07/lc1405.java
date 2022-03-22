package leetcode_07;

import java.util.PriorityQueue;

public class lc1405 {
    public String longestDiverseString(int a, int b, int c) {

        //构建优先队列
        PriorityQueue<int[]> queue = new PriorityQueue<>((x,y) -> y[1]-x[1]);
        if(a>0){
            queue.add(new int[]{'a',a});
        }
        if(b>0){
            queue.add(new int[]{'b',b});
        }
        if(c>0){
            queue.add(new int[]{'c',c});
        }

        StringBuilder sb = new StringBuilder(a+b+c);
        while(!queue.isEmpty()){
            int[] top = queue.poll();
            int n = sb.length();

            //如果字符串长度大于2并且最后两个字符都是数量最多的元素，那数量最多的不能再加入字符串了
            if(n >= 2 && sb.charAt(n-1) == top[0] && sb.charAt(n-2) == top[0]){
                if(!queue.isEmpty()){
                    //添加次多的元素
                    int[] mid = queue.poll();
                    sb.append((char)mid[0]);
                    //将数量次多的元素使用后的数量重新入堆
                    if(--mid[1] > 0){
                        queue.add(mid);
                    }
                    //数量最多的元素也重新入堆
                    queue.add(top);
                }
            }else {
                //如果结尾两个字符不是最多的元素，就拼接数量最多的元素
                sb.append((char)top[0]);
                //数量最多的使用了一个以后还有剩余，重新入堆
                if(--top[1] > 0){
                    queue.add(top);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        lc1405 lc = new lc1405();
//        System.out.println(lc.longestDiverseString(7,1,0));

        String s = "1234";
        System.out.println(s.replaceAll("(.{1})", ":$1").substring(1));
    }

}
