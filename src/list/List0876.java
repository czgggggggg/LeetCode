package list;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class List0876 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        System.out.println(middleNode(head).val);//3

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//        System.out.println(middleNode(head).val);//4

        ListNode head = new ListNode(1);
        System.out.println(middleNode(head).val);//1
    }
    public static ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }

        cur = head;
        for(int i = 2; i <= len/2 + 1; i++){//5 -> [1,3]  //6 -> [1,4] //7 -> [1,4]
            cur = cur.next;
        }
        return cur;
    }
}
