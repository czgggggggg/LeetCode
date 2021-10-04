package list;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/10/4
 * @Description
 */
public class List0142 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(3);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(0);
//        head.next.next.next = new ListNode(-4);
//        head.next.next.next.next = head.next;
//        System.out.println(detectCycle(head).val);

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = head;
//        System.out.println(detectCycle(head).val);

//        ListNode head = new ListNode(1);
//        System.out.println(detectCycle(head).val);

//        ListNode head = null;
//        System.out.println(detectCycle(head).val);
    }
    public static ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode cur = head;
        while(cur != null){
            if(!hashSet.contains(cur))
                hashSet.add(cur);
            else
                return cur;
            cur = cur.next;
        }
        return null;
    }
}
