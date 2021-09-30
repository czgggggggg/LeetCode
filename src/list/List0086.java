package list;

/**
 * @Author czgggggggg
 * @Date 2021/9/30
 * @Description
 */
public class List0086 {
    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(2);
//        ListNode newHead = partition(head, 3);
//        while(newHead != null){
//            System.out.print(newHead.val + " ");
//            newHead = newHead.next;
//        }

//        ListNode head = new ListNode(2);
//        head.next = new ListNode(1);
//        ListNode newHead = partition(head, 2);
//        while(newHead != null){
//            System.out.print(newHead.val + " ");
//            newHead = newHead.next;
//        }

        ListNode head = null;
        ListNode newHead = partition(head, 2);
        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
    public static ListNode partition(ListNode head, int x) {
        int len1 = 0;//值小于x的节点的个数
        int len2 = 0;//值大于等于x的节点的个数
        ListNode cur = head;
        while(cur != null){
            if(cur.val < x)
                len1++;
            else
                len2++;
            cur = cur.next;
        }

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        int count1 = 0;
        int count2 = 0;
        cur = head;
        while(cur != null){
            if(cur.val < x)
                arr1[count1++] = cur.val;
            else
                arr2[count2++] = cur.val;
            cur = cur.next;
        }

        count1 = 0;
        count2 = 0;
        cur = head;
        while(cur != null){
            if(count1 < len1){
                cur.val = arr1[count1++];
            }else if(count2 < len2){
                cur.val = arr2[count2++];
            }else
                break;
            cur = cur.next;
        }

        return head;
    }
}
