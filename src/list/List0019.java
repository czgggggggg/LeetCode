package list;

/**
 * @Author czgggggggg
 * @Date 2021/9/27
 * @Description
 */
public class List0019 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        ListNode newHead = removeNthFromEnd(head, 2);
//        while(newHead != null){
//            System.out.print(newHead.val + " ");
//            newHead = newHead.next;
//        }

//        ListNode head = new ListNode(1);
//        ListNode newHead = removeNthFromEnd(head, 1);
//        while(newHead != null){
//            System.out.print(newHead.val + " ");
//            newHead = newHead.next;
//        }

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode newHead = removeNthFromEnd(head, 1);
        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        ListNode old_cur2 = new ListNode(0);//辅助节点
        old_cur2.next = cur2;
        while(n != 0){
            cur1 = cur1.next;
            n--;
        }
        while(cur1 != null){
            cur1 = cur1.next;
            old_cur2 = cur2;
            cur2 = cur2.next;
        }

        //删除cur2节点
        if(cur2 == head)
            head = cur2.next;
        else{
            old_cur2.next = cur2.next;
        }
        return head;
    }
}
