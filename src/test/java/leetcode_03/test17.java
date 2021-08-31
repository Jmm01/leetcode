package leetcode_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test17 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        //nums�������еĽڵ�
        List<ListNode> nums = new ArrayList<ListNode>();
        //����ListNode�������еĽڵ㶼������
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
        //�ж�nums����û����Ч����
        if(nums.size() == 0)
            return null;
        //����һ������������ڵ����ݲ�����
        int[] newNums = new int[nums.size()];
        int i = 0;
        for(ListNode num:nums){
            newNums[i] = num.val;
            i++;
        }
        //�����нڵ��ֵ����
        Arrays.sort(newNums);
        //��������ͷ�ڵ�
       ListNode dummy = new ListNode();
       //������ֵ����С�������ɶ�Ӧ�Ľڵ�ŵ�li������
       ListNode[] li = new ListNode[newNums.length];
       for(int j=0;  j<newNums.length; j++){
           ListNode node = new ListNode(newNums[j]);
           li[j] = node;
       }
       //����li�����node
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
