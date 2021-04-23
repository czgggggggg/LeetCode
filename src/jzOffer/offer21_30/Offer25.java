package jzOffer.offer21_30;
/**
* @Author czgggggggg
* @Date 2021/2/15
* @Description 合并两个排序的链表
* @Since version-1.0
*/
public class Offer25 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);
        printList(listNode1);
        printList(listNode2);
        printList(mergeTwoLists(listNode1,listNode2));
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);//初始节点
        ListNode current = head;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = new ListNode(l1.val);//current = new ListNode(l1.val);会出错
                l1 = l1.next;
            }
            else{
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            while(l1 != null){
                current.next = new ListNode(l1.val);
                l1 = l1.next;
                current = current.next;
            }
        }else{//l2 != null
            while(l2 != null){
                current.next = new ListNode(l2.val);
                l2 = l2.next;
                current = current.next;
            }
        }
        return head.next;//去除初始节点
    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public static void printList(ListNode listNode){
        ListNode current = listNode;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
