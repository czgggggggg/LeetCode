package jzOffer.offer21_30;
/**
* @Author czgggggggg
* @Date 2021/2/15
* @Description 链表中倒数第k个节点
* @Since version-1.0
*/
public class Offer22 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        printList(listNode);
        printList(getKthFromEnd(listNode,2));
    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public static ListNode getKthFromEnd(ListNode head, int k) {
        int count1 = 0;//记录链表中节点的个数
        ListNode current = head;
        while(current != null){
            count1++;
            current = current.next;
        }

        int count2 = count1 - k;
        current = head;
        while(count2-- != 0){
            current = current.next;
        }
        return current;
    }

    //打印链表
    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
