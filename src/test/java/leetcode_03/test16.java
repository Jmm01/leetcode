package leetcode_03;

public class test16 {
    public ListNode swapPairs(ListNode head) {
        //创建虚拟头节点
        ListNode dummy = new ListNode();
        dummy.next = head;
        swap(dummy);
        return dummy.next;
    }
    //每次交换涉及4个节点的变动，传入的参数cur为需要交换的两个节点的前一个结点
    private void swap(ListNode cur){
        //如果cur后面为空或者只有一个节点，就不需要再交换了
        if(cur.next == null || cur.next.next == null)
            return;
        //否则，交换cur后面一个节点one和它后面的第二个节点two
        ListNode one = cur.next;
        ListNode two = cur.next.next;
        ListNode three = cur.next.next.next;
        cur.next = two;
        two.next = one;
        one.next = three;
        //递归调用swap交换后面一对节点
        //此时后面一对节点的前一个结点为one节点
        swap(one);
    }
}
