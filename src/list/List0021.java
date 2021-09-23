package list;

/**
 * @Author czgggggggg
 * @Date 2021/9/23
 * @Description
 */
public class List0021 {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);
//        ListNode result = mergeTwoLists(l1, l2);
//        while(result != null){
//            System.out.print(result.val + " ");
//            result = result.next;
//        }

//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
//        ListNode l2 = null;
//        ListNode result = mergeTwoLists(l1, l2);
//        while(result != null){
//            System.out.print(result.val + " ");
//            result = result.next;
//        }

        ListNode l1 = null;
        ListNode l2 = null;
        ListNode result = mergeTwoLists(l1, l2);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode tmp = result;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                tmp.next = new ListNode(l1.val);
                tmp = tmp.next;
                l1 = l1.next;
            }else{
                tmp.next = new ListNode(l2.val);
                tmp = tmp.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            tmp.next = new ListNode(l1.val);
            tmp = tmp.next;
            l1 = l1.next;
        }
        while(l2 != null){
            tmp.next = new ListNode(l2.val);
            tmp = tmp.next;
            l2 = l2.next;
        }
        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]