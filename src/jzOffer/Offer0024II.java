package jzOffer;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class Offer0024II {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode cur = head;

        ListNode tmp;
        while(cur != null){
            tmp = result.next;
            result.next = new ListNode(cur.val);
            result.next.next = tmp;

            cur = cur.next;
        }

        return result.next;//去掉result的头辅助节点
    }
}
