package leetcode_03;

public class test5 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        if(head.next == null && head.val == val)
            return null;
        ListNode cur = new ListNode();
        cur.next = head;
        while(cur.next !=null){
            if(cur.next.val == val && cur.next == head){
                head = cur.next.next;
            }else if(cur.next.val == val){
                ListNode temp = cur.next;
                cur.next = cur.next.next;
                temp.next = null;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
