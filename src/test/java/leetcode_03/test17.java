package leetcode_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test17 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        //nums保存所有的节点
        List<ListNode> nums = new ArrayList<ListNode>();
        //遍历ListNode，将所有的节点都存起来
        for(int i=0; i<lists.length; i++){
            ListNode temphead = lists[i];
            if(temphead == null)
                continue;
            nums.add(temphead);
            while(temphead.next != null){
                temphead = temphead.next;
                nums.add(temphead);
            }
        }
        //判断nums中有没有有效数字
        if(nums.size() == 0)
            return null;
        //定义一个数组来保存节点数据并排序
        int[] newNums = new int[nums.size()];
        int i = 0;
        for(ListNode num:nums){
            newNums[i] = num.val;
            i++;
        }
        //将所有节点的值排序
        Arrays.sort(newNums);
        //定义虚拟头节点
       ListNode dummy = new ListNode();
       //将所有值按从小到大生成对应的节点放到li数组中
       ListNode[] li = new ListNode[newNums.length];
       for(int j=0;  j<newNums.length; j++){
           ListNode node = new ListNode(newNums[j]);
           li[j] = node;
       }
       //连接li里面的node
        dummy.next = li[0];
       for (int j=0; j<li.length-1; j++){
           li[j].next = li[j+1];
       }
       return dummy.next;
    }

    public static void main(String[] args) {
        test17 t = new test17();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2,null);
        ListNode l3 = new ListNode(3,null);
        ListNode l4 = new ListNode(4);
        l1.next = l3;
        l4.next = l2;
        ListNode[] ll = new ListNode[]{null,null,null};
        System.out.println(t.mergeKLists(ll));
    }

}
