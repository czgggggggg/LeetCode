package jzOffer.offer01_10;

import java.util.Stack;

/**
* @Author czgggggggg
* @Date 2021/1/17
* @Description 从尾到头打印链表
*/
public class Offer06 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);

        int[] array = reversePrint(head);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        while(head != null){
            int x = head.val;
            stack.push(new Integer(x));
            count++;
            head = head.next;
        }
        int[] arr = new int[count];
        for(int i = 0; i < count; i++){
            arr[i] = stack.pop().intValue();
        }
        return arr;
    }
    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
