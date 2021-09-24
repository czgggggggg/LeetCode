package list;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class List0203 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next.next = new ListNode(6);
        ListNode result1 = removeElements(head1, 6);
        while(result1 != null){
            System.out.print(result1.val + " ");
            result1 = result1.next;
        }
        System.out.println();

        ListNode head2 = null;
        ListNode result2 = removeElements(head2, 1);
        while(result2 != null){
            System.out.print(result2.val + " ");
            result2 = result2.next;
        }
        System.out.println();

        ListNode head3 = new ListNode(7);
        head3.next = new ListNode(7);
        head3.next.next = new ListNode(7);
        head3.next.next.next = new ListNode(7);
        ListNode result3 = removeElements(head3, 7);
        while(result3 != null){
            System.out.print(result3.val + " ");
            result3 = result3.next;
        }
        System.out.println();

        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(1);
        head4.next.next = new ListNode(2);
        head4.next.next.next = new ListNode(1);
        head4.next.next.next.next = new ListNode(1);
        ListNode result4 = removeElements(head4, 1);
        while(result4 != null){
            System.out.print(result4.val + " ");
            result4 = result4.next;
        }
        System.out.println();


    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode cur = new ListNode(0);
        cur.next = head;
        while(cur.next != null){
            if(cur.next.val == val){
                if(cur.next == head){
                    head = head.next;
                    cur.next = head;
                }else{
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }
        }

        return head;
    }
}
