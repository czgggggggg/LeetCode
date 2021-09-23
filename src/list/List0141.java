package list;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/23
 * @Description
 */
public class List0141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
//        head.next.next.next.next = head.next;
        head.next.next.next.next = head;
        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        ListNode cur = head;
        while(cur != null){
            if(cur.next != null){
                if(set.contains(cur.next)){
//                    System.out.println("test2---" + cur.next.val);
                    return true;
                }
                else{
//                    System.out.println("test1---" + cur.next.val);
                    set.add(cur.next);
                }
            }
            cur = cur.next;
        }

        return false;
    }
}
