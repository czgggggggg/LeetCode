package list;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2021/9/28
 * @Description
 */
public class List0082 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(4);
//        head.next.next.next.next.next = new ListNode(4);
//        head.next.next.next.next.next.next = new ListNode(5);
//        ListNode newHead = deleteDuplicates(head);
//        while(newHead != null){
//            System.out.print(newHead.val + " ");
//            newHead = newHead.next;
//        }

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(3);
//        ListNode newHead = deleteDuplicates(head);
//        while(newHead != null){
//            System.out.print(newHead.val + " ");
//            newHead = newHead.next;
//        }

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(3);
//        ListNode newHead = deleteDuplicates(head);
//        while(newHead != null){
//            System.out.print(newHead.val + " ");
//            newHead = newHead.next;
//        }

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(1);
//        head.next.next.next.next = new ListNode(1);
//        ListNode newHead = deleteDuplicates(head);
//        while(newHead != null){
//            System.out.print(newHead.val + " ");
//            newHead = newHead.next;
//        }

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        ListNode newHead = deleteDuplicates(head);
        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ListNode cur = head;
        while(cur != null){
            if(hashMap.get(cur.val) != null)
                hashMap.put(cur.val,hashMap.get(cur.val)+1);
            else
                hashMap.put(cur.val,1);
            cur = cur.next;
        }

        ListNode oldCur = new ListNode(0);
        cur = head;
        while(cur != null){
            if(hashMap.get(cur.val) > 1){
                if(cur == head){
                    head = head.next;
                    oldCur = cur;
                    cur = head;
                }else{
                    if(cur.next != null){//注意此处的判断
//                        System.out.println("test1");
                        cur.val = cur.next.val;
                        cur.next = cur.next.next;
                    }else{
//                        System.out.println("test2");
//                        System.out.println("test3---" + cur.val);
                        cur = null;//第一次提交错误的地方，这里只是把cur置为null，而cur只是一个辅助变量，并没有改变链表的结构。
                        oldCur.next = null;//加上这条语句
                    }
                }
            }else{
                oldCur = cur;
                cur = cur.next;
            }
        }

        return head;
    }
}
