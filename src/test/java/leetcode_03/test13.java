package leetcode_03;

import java.util.ArrayList;
import java.util.List;

public class test13 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //��ֻ��һ���ڵ�ʱ����ɾ����϶�Ϊ��
        if(head.next == null)
            return null;
        //��ʼ��һ���������洢ÿ��λ�õĽڵ�
        List<ListNode> list = new ArrayList<ListNode>();
        //��������ڵ㣬����ͷ�ڵ㱻ɾ�����������
        ListNode d =  new ListNode();
        d.next = head;
        list.add(d);
        ListNode curNode = d.next;
        list.add(curNode);
        //����head��������node����list��
        while(curNode.next != null){
            list.add(curNode.next);
            curNode = curNode.next;
        }
        int len = list.size();
        //indexΪ������n���ڵ���list�е�����λ��
        int index = len - n;
        //�����ɾ���������һ���ڵ�,ֻ����ǰһ���ڵ�Ͽ�
        if(n == 1)
            list.get(index - 1).next = null;
        else{
            //����λ���򽫱�ɾ���Ľڵ�ǰ�󶼶Ͽ���ϵ
            list.get(index - 1).next = list.get(index + 1);
            list.get(index).next = null;
        }
        return list.get(0).next;
    }
}
