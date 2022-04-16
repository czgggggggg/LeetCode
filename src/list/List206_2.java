package list;

/**
 * @Author czgggggggg
 * @Date 2022/4/15
 * @Description
 */
public class List206_2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = reverseList(head);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        ListNode result = reverseList(head);
//        while(result != null){
//            System.out.print(result.val + " ");
//            result = result.next;
//        }
//        System.out.println();

//        ListNode head = null;
//        ListNode result = reverseList(head);
//        while(result != null){
//            System.out.print(result.val + " ");
//            result = result.next;
//        }
//        System.out.println();
    }

    public static ListNode reverseList(ListNode head) {
        //辅助用的头节点
        ListNode result = new ListNode(0);

        ListNode cur = head;
        ListNode cur_next;
        ListNode tmp;
        while(cur != null){
            cur_next = cur.next;

            tmp = result.next;
            result.next = cur;
            cur.next = tmp;

            cur = cur_next;
        }

        return result.next;
    }
}
