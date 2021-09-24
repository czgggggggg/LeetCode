package list;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class List1290 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(0);
//        head.next.next = new ListNode(1);
//        System.out.println(getDecimalValue(head));//5

//        ListNode head = new ListNode(0);
//        System.out.println(getDecimalValue(head));//0

//        ListNode head = new ListNode(1);
//        System.out.println(getDecimalValue(head));//1

//        ListNode head = new ListNode(1);
//        head.next = new ListNode(0);
//        head.next.next = new ListNode(0);
//        head.next.next.next = new ListNode(1);
//        head.next.next.next.next = new ListNode(0);
//        head.next.next.next.next.next = new ListNode(0);
//        head.next.next.next.next.next.next = new ListNode(1);
//        head.next.next.next.next.next.next.next= new ListNode(1);
//        head.next.next.next.next.next.next.next.next = new ListNode(1);
//        head.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        head.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        head.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        head.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
//        System.out.println(getDecimalValue(head));//18880

        ListNode head = new ListNode(0);
        head.next = new ListNode(0);
        System.out.println(getDecimalValue(head));//0
    }
    public static int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int len = 0;
        while(cur != null){
            len++;
            cur = cur.next;
        }

        int index = 0;
        int[] arr = new int[len];
        cur = head;
        while(cur != null){
            arr[index++] = cur.val;
            cur = cur.next;
        }

        int result = 0;
        int tmp = 1;
        for(int i = len - 1; i >= 0; i--){
            result += arr[i] * tmp;
            tmp *= 2;
        }

        return result;
    }
}
