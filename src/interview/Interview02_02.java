package interview;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class Interview02_02 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        System.out.println(kthToLast(head,2));

        ListNode head = new ListNode(1);
        System.out.println(kthToLast(head,1));
    }
    public static int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while(k != 0){
            fast = fast.next;
            k--;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow.val;
    }
}
