package interview;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class Interview02_01 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next = new ListNode(1);
//        ListNode result = removeDuplicateNodes(head);
//        while(result != null){
//            System.out.print(result.val + " ");
//            result = result.next;
//        }

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(1);
//        head.next.next.next.next = new ListNode(2);
//        ListNode result = removeDuplicateNodes(head);
//        while(result != null){
//            System.out.print(result.val + " ");
//            result = result.next;
//        }

        ListNode head = null;
        ListNode result = removeDuplicateNodes(head);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        ListNode cur = new ListNode(0);//辅助节点
        cur.next = head;
        while(cur.next != null){
            if(!set.contains(cur.next.val)){
                set.add(cur.next.val);
                cur = cur.next;
            }
            else{
                cur.next = cur.next.next;
//                cur = cur.next;
            }
        }

        return head;
    }
}
