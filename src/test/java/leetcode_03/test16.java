package leetcode_03;

public class test16 {
    public ListNode swapPairs(ListNode head) {
        //��������ͷ�ڵ�
        ListNode dummy = new ListNode();
        dummy.next = head;
        swap(dummy);
        return dummy.next;
    }
    //ÿ�ν����漰4���ڵ�ı䶯������Ĳ���curΪ��Ҫ�����������ڵ��ǰһ�����
    private void swap(ListNode cur){
        //���cur����Ϊ�ջ���ֻ��һ���ڵ㣬�Ͳ���Ҫ�ٽ�����
        if(cur.next == null || cur.next.next == null)
            return;
        //���򣬽���cur����һ���ڵ�one��������ĵڶ����ڵ�two
        ListNode one = cur.next;
        ListNode two = cur.next.next;
        ListNode three = cur.next.next.next;
        cur.next = two;
        two.next = one;
        one.next = three;
        //�ݹ����swap��������һ�Խڵ�
        //��ʱ����һ�Խڵ��ǰһ�����Ϊone�ڵ�
        swap(one);
    }
}
