package leetcode_04;

public class test12 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curNode = headA;
        while(curNode != null){
            ListNode b = headB;
            while(b != null){
                if(b == curNode)
                    return curNode;
                else
                    b = b.next;
            }
            curNode = curNode.next;
        }
        return null;
    }

    public static void main(String[] args) {
        test12 t = new test12();
        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4);
        ListNode l3 = new ListNode(8);
        ListNode l2 = new ListNode(1);
        ListNode l1 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;
        ListNode ll5 = new ListNode(4);
        ListNode ll4 = new ListNode(8);
        ListNode ll3 = new ListNode(1);
        ListNode ll2 = new ListNode(0);
        ListNode ll1 = new ListNode(5);
        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        ll4.next = ll5;
        ll5.next = null;
        System.out.println(t.getIntersectionNode(l1,ll1));
    }
}
