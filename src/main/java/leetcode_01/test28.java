package leetcode_01;

public class test28 {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummyHead = new ListNode(-1);
//        ListNode cur = new ListNode();
//        cur = dummyHead;
//        int k = 0;
//        while (l1!=null || l2!=null){
//            ListNode temp = new ListNode();
//            if(l1 == null)
//                temp.val = l2.val + k;
//            else if(l2 == null)
//                temp.val = l1.val + k;
//            else
//                temp.val = l1.val + l2.val + k;
//            if(temp.val < 10)
//                k=0;
//            else {
//                k = 1;
//                temp.val = temp.val -10;
//            }
//            cur.next = temp;
//            cur = cur.next;
//            if(l1!=null)
//                l1 = l1.next;
//            if(l2!=null)
//                l2 = l2.next;
//            if(l1 == null && l2 == null){
//                if(k==1){
//                    cur.next = new ListNode(1,null);
//                }
//            }
//        }
//        return  dummyHead.next;
//    }

//    public static void main(String[] args) {
//        test28 t = new test28();
//        ListNode l11 = new ListNode(2);
//        ListNode l12 = new ListNode(4);
//        ListNode l13 = new ListNode(3,null);
//        l11.next = l13;
//        //l12.next = l13;
//
//
//        ListNode l21 = new ListNode(5);
//        ListNode l22 = new ListNode(6);
//        ListNode l23 = new ListNode(4,null);
//        l21.next = l22;
//        l22.next = l23;
//        ListNode res = t.addTwoNumbers(l11,l21);
//        System.out.println(res.val);
//    }
}
