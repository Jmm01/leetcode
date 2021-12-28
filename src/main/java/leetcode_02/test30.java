package leetcode_02;

public class test30 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right ||head.next == null)
            return head;
        int size = 1;
        ListNode cur = head;
        while(cur.next != null){
            size ++;
            cur = cur.next;
        }
        int[] nums = new int[size];
        cur = head;
        nums[0] = cur.val;
        for(int i=1; i<size; i++){
            cur = cur.next;
            nums[i] = cur.val;
        }
        int mid = (left+right-2)/2;
        for(int i = left-1; i<= mid; i++){
            int temp = nums[i];
            nums[i] = nums[right+left-2-i];
            nums[right+left-2-i] = temp;
        }
        ListNode res = new ListNode();
        ListNode cu = res;
        for(int i =0; i<size; i++){
            ListNode tempNode = new ListNode(nums[i]);
            cu.next = tempNode;
            cu = cu.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        test30 t = new test30();
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(3);
        ListNode l14 = new ListNode(4);
        ListNode l15 = new ListNode(5);
        ListNode l16 = new ListNode(6);
        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;
        l15.next = l16;
        l16.next = null;
        ListNode res = t.reverseBetween(l11, 2,4);
        System.out.println(res.val);
    }

}
