package code;

public class Code0024 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        ListNode res = swapPairs(head);
//        while (res != null){
//            System.out.print(res.val + " ");
//            res = res.next;
//        }
//        System.out.println();//2 1 4 3

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        ListNode res = swapPairs(head);
//        while (res != null){
//            System.out.print(res.val + " ");
//            res = res.next;
//        }
//        System.out.println();//2 1 3

//        ListNode head = new ListNode(1);
//        ListNode res = swapPairs(head);
//        while (res != null){
//            System.out.print(res.val + " ");
//            res = res.next;
//        }
//        System.out.println();//1

        ListNode head = null;
        ListNode res = swapPairs(head);
        while (res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();//1
    }
    public static ListNode swapPairs(ListNode head) {
        //构建辅助的头节点
        ListNode res = new ListNode(0);
        res.next = head;
        //构建pre、first、second节点
        ListNode pre = res;
        ListNode first = head;
        ListNode second;
        //初始条件
        if(first == null){
            return res.next;
        }else if(first.next == null){
            return res.next;
        }
        second = first.next;
        //循环交换节点
        while (true){
            pre.next = second;
            first.next = second.next;
            second.next = first;
            //此时的次序：pre、second、first
            pre = first;
            first = first.next;
            //
            if(first == null){
                return res.next;
            }else if(first.next == null){
                return res.next;
            }else{
                second = first.next;
            }
        }
    }
}
