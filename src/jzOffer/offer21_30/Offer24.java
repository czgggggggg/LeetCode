package jzOffer.offer21_30;
/**
* @Author czgggggggg
* @Date 2021/2/15
* @Description 反转链表
* @Since version-1.0
*/
public class Offer24 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        printList(listNode);
        printList(reverseList(listNode));
    }

    //分析：Offer06也类似反转
    //      输入: 1->2->3->4->5->NULL
    //      输出: 5->4->3->2->1->NULL
    //思路：借助一个辅助数组
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;

        int count = 0;//记录链表中节点的个数
        while(current != null){
            count++;
            current = current.next;
        }

        //按链表元素顺序，将链表元素保存在数组中。
        int[] nums = new int[count];
        int i = 0;
        current = head;
        while(current != null){
            nums[i++] = current.val;
            current = current.next;
        }

        //按链表元素顺序遍历，将数组元素从尾到头依次来更新链表中的元素。
        i = nums.length - 1;
        current = head;
        while(current != null){
            current.val = nums[i--];
            current = current.next;
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
