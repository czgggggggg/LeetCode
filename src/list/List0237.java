package list;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class List0237 {
    public static void main(String[] args) {

    }
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
