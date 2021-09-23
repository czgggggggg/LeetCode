package list;

/**
 * @Author czgggggggg
 * @Date 2021/9/23
 * @Description
 */
public class List0083 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        ListNode result = deleteDuplicates(head);
//        while(result != null){
//            System.out.print(result.val + " ");
//            result = result.next;
//        }

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(3);
//        ListNode result = deleteDuplicates(head);
//        while(result != null){
//            System.out.print(result.val + " ");
//            result = result.next;
//        }

        ListNode head = null;
        ListNode result = deleteDuplicates(head);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur != null){
            if(cur.next != null) {
                if (cur.val == cur.next.val) {
                    cur.next = cur.next.next;
                }else{
                    cur = cur.next;
                }
            }else{
                break;
            }
        }
        return head;
    }
}

