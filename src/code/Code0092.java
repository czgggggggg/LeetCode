package code;

public class Code0092 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head = reverse(head);
//        while (head != null){
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//        System.out.println();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = reverseBetween(head,2,4);
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();//1 4 3 2 5

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//        head.next.next.next.next.next.next = new ListNode(7);
//        head = reverseBetween(head,3,5);
//        while (head != null){
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//        System.out.println();//1 2 5 4 3 6 7

//        ListNode head = new ListNode(5);
//        head = reverseBetween(head,1,1);
//        while (head != null){
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//        System.out.println();//5

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head = reverseBetween(head,1,4);
//        while (head != null){
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
//        System.out.println();//4 3 2 1
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre = null;
        ListNode last = null;
        ListNode cur = head;
        int count = 1;
        while (count < left){
            pre = cur;
            cur = cur.next;
            count++;
        }
//        System.out.println("pre.val = " + pre.val);
        while (count < right){
            cur = cur.next;
            count++;
        }
        last = cur.next;
//        System.out.println("last.val = " + last.val);

        cur.next = null;
        ListNode preNext = null;
        if(pre != null){
            preNext = reverse(pre.next);
            pre.next = preNext;
        }else{
            preNext = reverse(head);
            head = preNext;
//            System.out.println("preNext.val = " + preNext.val);
        }
        cur = preNext;
        while (cur != null){
            if(cur.next == null){
                cur.next = last;
                break;
            }
            cur = cur.next;
        }

        return head;
    }
    public static ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
