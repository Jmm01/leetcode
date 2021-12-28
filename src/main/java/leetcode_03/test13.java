package leetcode_03;

import java.util.ArrayList;
import java.util.List;

public class test13 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //当只有一个节点时，被删除后肯定为空
        if(head.next == null)
            return null;
        //初始化一个数组来存储每个位置的节点
        List<ListNode> list = new ArrayList<ListNode>();
        //定义虚拟节点，避免头节点被删除的特殊情况
        ListNode d =  new ListNode();
        d.next = head;
        list.add(d);
        ListNode curNode = d.next;
        list.add(curNode);
        //遍历head，将所有node存在list中
        while(curNode.next != null){
            list.add(curNode.next);
            curNode = curNode.next;
        }
        int len = list.size();
        //index为倒数第n个节点在list中的索引位置
        int index = len - n;
        //如果被删除的是最后一个节点,只需与前一个节点断开
        if(n == 1)
            list.get(index - 1).next = null;
        else{
            //其他位置则将被删除的节点前后都断开联系
            list.get(index - 1).next = list.get(index + 1);
            list.get(index).next = null;
        }
        return list.get(0).next;
    }
}
