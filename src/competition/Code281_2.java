package competition;

/**
 * @Author czgggggggg
 * @Date 2022/3/1
 * @Description
 */
public class Code281_2 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(0);
//        head.next = new ListNode(3);
//        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(0);
//        head.next.next.next.next = new ListNode(4);
//        head.next.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next.next = new ListNode(0);
//        ListNode res = mergeNodes(head);
//        while(res != null){
//            System.out.print(res.val + " ");
//            res = res.next;
//        }
//        System.out.println();
        //4 11

//        ListNode head = new ListNode(0);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(0);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(0);
//        head.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next.next = new ListNode(0);
//        ListNode res = mergeNodes(head);
//        while(res != null){
//            System.out.print(res.val + " ");
//            res = res.next;
//        }
//        System.out.println();
        //1 3 4

        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        ListNode res = mergeNodes(head);
        while(res != null){
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
        //1
    }
    public static ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode();
        ListNode res_cur = res;
        int sum = 0;

        ListNode cur = head.next;
        while(cur != null){
            if(cur.val == 0){
                res_cur.next = new ListNode(sum);
                res_cur = res_cur.next;
                sum = 0;
            }else{
                sum += cur.val;
            }
            cur = cur.next;
        }

        return res.next;
    }
}
//45.61%、62.41%
