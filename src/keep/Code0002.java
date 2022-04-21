package keep;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Code0002 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(3);
        func(head);
        Node cur = head;
        while(cur != null){
            System.out.print(cur.value + " ");
            cur = cur.next;
        }

    }
    public static void func(Node head){
        if(head == null)
            return;
        if(head.next == null)
            return;

        HashSet<Integer> set = new HashSet<>();
        Node pre = head;
        set.add(head.value);

        Node cur = pre.next;
        while(cur != null){
            if(set.contains(cur.value)){
                pre.next = cur.next;
            }else{
                set.add(cur.value);
                pre = pre.next;
            }

            cur = cur.next;
        }
    }

}
class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }
}