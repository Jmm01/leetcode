package leetcode_02;

public class test27 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0)
            return head;
        ListNode oldhead = head;
        int size = 1;
        while(head.next!=null){
            size++;
            head = head.next;
        }
        int index = k%size;
        for(int i=0; i<index; i++){
            oldhead = rotate(oldhead);
        }
        return oldhead;

    }
    private ListNode rotate(ListNode head){
        ListNode cur = head;
        ListNode newHead;
        if(head.next.next == null){
            newHead = cur.next;
            newHead.next = cur;
            cur.next = null;
        }else {
            while(cur.next.next!=null){
                cur = cur.next;
            }
            newHead = cur.next;
            newHead.next = head;
            cur.next = null;
        }
        return newHead;
    }

    public static void main(String[] args) {
        test27 t = new test27();
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(3);
        ListNode l14 = new ListNode(4);
        ListNode l15 = new ListNode(5);
//        ListNode l16 = new ListNode(6);
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;
        l15.next = null;
//        l16.next = null;
        ListNode res = t.rotateRight(l11,2);
        System.out.println(res.val);
    }

}
