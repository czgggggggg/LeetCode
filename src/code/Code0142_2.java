package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/15
 * @Description
 */
public class Code0142_2 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(3);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(0);
//        head.next.next.next = new ListNode(-4);
//        head.next.next.next.next = head.next;
//        System.out.println(detectCycle(head).val);//2

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = head;
//        System.out.println(detectCycle(head).val);//1

        ListNode head = new ListNode(1);
        System.out.println(detectCycle(head));//null
    }
    public static ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast != null){
            slow = slow.next;
            if(fast.next == null)
                break;
            fast = fast.next.next;
            if(slow == null || fast == null){
                break;
            }else{
                if(slow == fast){
                    ListNode node1 = head;
                    ListNode node2 = slow;
                    while(node1 != node2){
                        node1 = node1.next;
                        node2 = node2.next;
                    }
                    return node1;
                }
            }
        }
        return null;
    }
}
