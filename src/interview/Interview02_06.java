package interview;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class Interview02_06 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(2);
//        head.next.next.next = new ListNode(1);
//        System.out.println(isPalindrome(head));

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        System.out.println(isPalindrome(head));

        ListNode head = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        int len = 0;
        while(cur != null){
            len++;
            cur = cur.next;
        }

        int[] arr = new int[len];
        cur = head;
        int index = 0;
        while(cur != null){
            arr[index++] = cur.val;
            cur = cur.next;
        }

        for(int i = 0; i < len/2; i++){
            if(arr[i] != arr[len - 1 - i])
                return false;
        }

        return true;
    }
}
