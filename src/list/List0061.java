package list;

/**
 * @Author czgggggggg
 * @Date 2021/9/27
 * @Description
 */
public class List0061 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        ListNode newHead = rotateRight(head,2);
//        while(newHead != null){
//            System.out.print(newHead.val + " ");
//            newHead = newHead.next;
//        }//4 5 1 2 3

//        ListNode head = new ListNode(0);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(2);
//        ListNode newHead = rotateRight(head,4);
//        while(newHead != null){
//            System.out.print(newHead.val + " ");
//            newHead = newHead.next;
//        }//2 0 1

        ListNode head = null;
        ListNode newHead = rotateRight(head,4);
        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }//2 0 1
    }
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode cur1 = head;
        ListNode cur2;
        ListNode newHead = head;
        int len = 0;
        while(cur1 != null){
            len++;
            cur1 = cur1.next;
        }

        if(len == 0)
            return head;

        k %= len;
        if(k == 0)
            return head;
        else{
            //利用List0019的函数（稍作修改）
            newHead = getNthFromEnd(head,k);
            cur2 = newHead;
            while(cur2.next != null){
                cur2 = cur2.next;
            }
            cur2.next = head;//连接上
            while(cur2.next != newHead){
                cur2 = cur2.next;
            }
            cur2.next = null;//断掉

            return newHead;
        }
    }

    public static ListNode getNthFromEnd(ListNode head, int n) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        while(n != 0){
            cur1 = cur1.next;
            n--;
        }
        while(cur1 != null){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        return cur2;//不删除cur2，而是直接返回cur2
    }
}
