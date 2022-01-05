package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/5
 * @Description
 */
public class Code0147 {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(1);
//        head.next.next.next = new ListNode(3);

        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();

        cur = insertionSortList(head);
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static ListNode insertionSortList(ListNode head) {

        return new ListNode();
    }

    //v0.3还是写崩，战略性放弃
//    public static ListNode insertionSortList(ListNode head) {
//
//        ListNode finished = head;
//        int tmp;
//        ListNode cur;
//
//        while(finished.next != null){
//            tmp = finished.next.val;
//
//            if(finished == head){
//                if(tmp > finished.val){
//                    finished = finished.next;
//                }else{//////
//                    finished.next.val = finished.val;
//                    finished.val = tmp;
//                    finished = finished.next;
//                }
//            }else{
//                if(tmp >= finished.val){//
//                    finished = finished.next;
//                }else{
//                    cur = head;
//                    while(cur != finished){
//
//                        if(cur == head && tmp <= head.val){//
//                            ListNode tmpNode = finished.next;
//                            finished.next = finished.next.next;
//                            tmpNode.next = head;
//                            head = tmpNode;
//                            break;
//                        }
//
//                        cur = cur.next;
//                    }
//                    if(cur == finished){
//                        finished.next.val = finished.val;
//                        finished.val = tmp;
//                        finished = finished.next;
//                    }
//                }
//            }
//
//        }
//
//        return head;
//    }

    //v0.2依然写崩
//    public static ListNode insertionSortList(ListNode head) {
//        ListNode cur_pre = new ListNode(0);
//        ListNode cur = head;
//        ListNode finished = head;
//        int tmp;
//        while(finished.next != null){
////            System.out.println("test0");
//            cur = head;
//            cur_pre = new ListNode(0);
//
//            tmp = finished.next.val;
//            while(cur != finished.next){//
//                System.out.println("test1");
//
//                if(tmp <= cur.val){
//                    System.out.println("test21---" + cur.val + "---" + tmp);
//                    if(cur == head){
//                        head = finished.next;
//                        finished.next = finished.next.next;
//                        finished.next.next = cur;
//                        cur_pre = cur;
//                        cur = cur.next;
//                    }else{
//                        cur_pre.next = finished.next;
//                        finished.next = finished.next.next;
//                        cur_pre.next.next = cur;
//                    }
//                }else{
//                    System.out.println("test22");
//                    if(cur == head){
//                        cur_pre = cur;
//                        cur = cur.next;
//                    }else{
//                        cur_pre = cur;
//                        cur = cur.next;
//                    }
//                }
//            }
//
//
////            if(cur == finished){
////                finished = finished.next;
////            }
//        }
//        return head;
//    }

    //v0.1写崩了，乱！
//    public static ListNode insertionSortList(ListNode head) {
//        ListNode cur;
//        ListNode cur_pre = new ListNode(0);
//        ListNode finished = head;
//        int tmp;
//
//        System.out.println("test1");
//        while (finished.next != null) {
//            tmp = finished.next.val;
//            cur = head;
//            cur_pre.next = head;
//            System.out.println("test2---" + cur_pre.val + "---" + cur.val);
//            while (cur != null) {
//                System.out.println("test3");
//                if (cur != finished) {
//                    System.out.println("test41");
//                    if (tmp <= cur.val) {
//                        cur_pre.next = finished.next;
//                        finished.next = finished.next.next;
//                        cur_pre.next.next = cur;
//                        break;
//                    } else {
//                        cur = cur.next;
//                        cur_pre = cur_pre.next;
//                    }
//                } else {
//                    System.out.println("test42");
//                    if (tmp <= cur.val) {
//                        cur_pre.next = finished.next;
//                        finished.next = finished.next.next;
//                        cur_pre.next.next = cur;
//                        break;
//                    } else {
//                        finished = finished.next;
//                        break;
//                    }
//                }
//            }
//        }
//        return head;
//    }
}

//Definition for singly-linked list.
class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
