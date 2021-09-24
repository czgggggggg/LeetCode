package list;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class List0206 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        ListNode result = reverseList(head);
//        while(result != null){
//            System.out.print(result.val + " ");
//            result = result.next;
//        }
//        System.out.println();

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        ListNode result = reverseList(head);
//        while(result != null){
//            System.out.print(result.val + " ");
//            result = result.next;
//        }
//        System.out.println();

        ListNode head = null;
        ListNode result = reverseList(head);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
    public static ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode cur = head;

        ListNode tmp;
        while(cur != null){
            tmp = result.next;
            result.next = new ListNode(cur.val);
            result.next.next = tmp;

            cur = cur.next;
        }

        return result.next;//去掉result的头辅助节点
    }
}
