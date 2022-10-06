package code;

public class Code0328 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        ListNode res = oddEvenList(head);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddCur = odd;
        ListNode evenCur = even;

        ListNode cur = head.next.next;
        boolean oddFlag = true;
        while (cur != null){
            if(oddFlag){
                oddCur.next = cur;
                oddCur = cur;
            }else{
                evenCur.next = cur;
                evenCur = cur;
            }
            oddFlag = !oddFlag;
            cur = cur.next;
        }
        oddCur.next = null;
        evenCur.next = null;

        oddCur = odd;
        while (oddCur.next != null){
            oddCur = oddCur.next;
        }
        oddCur.next = even;

        return odd;
    }
}
