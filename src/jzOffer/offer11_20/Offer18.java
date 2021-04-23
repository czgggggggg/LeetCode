package jzOffer.offer11_20;
/**
* @Author czgggggggg
* @Date 2021/2/15
* @Description 删除链表的节点
* @Since version-1.0
*/
public class Offer18 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(5);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(9);
        printList(listNode);
//        printList(deleteNode(listNode, 4));
        printList(deleteNode(listNode, 5));
//        printList(deleteNode(listNode, 1));
//        printList(deleteNode(listNode, 9));
    }
    //分析：
    //1 -> 2 -> 3
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode p = null;//当前遍历到的节点的上一节点
        ListNode current = head;//当前遍历到的节点
        while(current.val != val){
            p = current;
            current = current.next;
        }
        //头节点
        if(current == head){
            head = current.next;
        }
        //中间节点
        else if(current.next != null){
            p.next = p.next.next;
        }
        //尾节点
        else{//current != head && current.next == null
            p.next = null;
        }
        return head;
    }

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
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
