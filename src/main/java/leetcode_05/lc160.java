package leetcode_05;

/**
 * 相交链表
 * 给你两个单链表的头节点 headA 和 headB ，
 * 请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表没有交点，返回 null 。
 */
public class lc160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //两个节点开头的链表中任一个为null，都没有相交的可能。
        if(headA == null || headB == null)
            return null;
        else {
            //定义两个指针，分别从两个头结点开始各自遍历自己，
            //遍历到终点结束后从另一个链表的头结点开始走，
            //如果有交点，在相交起始节点时刚好两个指针走过的步数相等
            ListNode a = headA;
            ListNode b = headB;
            while(a != b){
                a = a==null ? headB:a.next;
                b = b==null ? headA:b.next;
                //判断的是a,b是否为空，a，b本身可以为空，
                //如果两个链表没有交点，把两条路径都遍历一遍后为null时刚好相等，也会跳出循环。
            }
            return a;
        }
    }
}
