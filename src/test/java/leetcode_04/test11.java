package leetcode_04;

public class test11 {
//    面试题02.01.移除重复节点
    public ListNode removeDuplicateNodes(ListNode head) {
        //当头节点为空或只有头节点时，直接返回
        if(head == null || head.next == null)
            return head;
        //定义一个当前节点
        ListNode currNode = head;
        while(currNode != null){
            int curVal = currNode.val;
            ListNode curNode = currNode;
            while(curNode.next != null){
                if(curNode.next.val == curVal){
                    curNode.next = curNode.next.next;
                }else {
                    curNode = curNode.next;
                }
            }
            currNode = currNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        test11 t = new test11();
        ListNode l6 = new ListNode(1);
        ListNode l5 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l1 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = null;
        System.out.println(t.removeDuplicateNodes(l1));



    }
}
