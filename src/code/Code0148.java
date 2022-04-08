package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/4/8
 * @Description
 */
public class Code0148 {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head = sortList(head);
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static ListNode sortList(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }

        int[] arr = new int[len];
        cur = head;
        for(int i = 0; i < len; i++){
            arr[i] = cur.val;
            cur = cur.next;
        }

        Arrays.sort(arr);

        cur = head;
        for(int i = 0; i < len; i++){
            cur.val = arr[i];
            cur = cur.next;
        }

        return head;
    }
}
