package interview;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class Interview02_07 {
    public static void main(String[] args) {
//        ListNode headA = new ListNode(4);
//        headA.next = new ListNode(1);
//        headA.next.next = new ListNode(8);
//        headA.next.next.next = new ListNode(4);
//        headA.next.next.next.next  = new ListNode(5);
//        ListNode headB = new ListNode(5);
//        headB.next = new ListNode(0);
//        headB.next.next = new ListNode(1);
//        headB.next.next.next = headA.next.next;
//        ListNode result = getIntersectionNode(headA, headB);
//        System.out.println(result.val);

//        ListNode headA = new ListNode(0);
//        headA.next = new ListNode(9);
//        headA.next.next = new ListNode(1);
//        headA.next.next.next = new ListNode(2);
//        headA.next.next.next.next  = new ListNode(4);
//        ListNode headB = new ListNode(3);
//        headB.next = headA.next.next.next;
//        ListNode result = getIntersectionNode(headA, headB);
//        System.out.println(result.val);

//        ListNode headA = new ListNode(2);
//        headA.next = new ListNode(6);
//        headA.next.next = new ListNode(4);
//        ListNode headB = new ListNode(1);
//        headB.next = new ListNode(5);
//        ListNode result = getIntersectionNode(headA, headB);
//        System.out.println(result.val);

//        ListNode headA = null;
//        ListNode headB = null;
//        ListNode result = getIntersectionNode(headA, headB);
//        System.out.println(result.val);

//        ListNode headA = new ListNode(1);
//        ListNode headB = headA;
//        ListNode result = getIntersectionNode(headA, headB);
//        System.out.println(result.val);

        ListNode headA = new ListNode(3);
        ListNode headB = new ListNode(2);
        headB.next = headA;
        ListNode result = getIntersectionNode(headA, headB);
        System.out.println(result.val);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        ListNode curA, curB;
        curA = headA;
        curB = headB;

//        if(headA == headB)//第一次提交忽略的地方
//            return headA;

        while(curA != null){
//            if(curA.next != null){
//                set.add(curA.next);
//            }
            set.add(curA);
            curA = curA.next;
        }

        while(curB != null){
//            if(curB.next != null){
//                if(set.contains(curB.next))
//                    return curB.next;
//            }
            if(set.contains(curB))
                return curB;
            curB = curB.next;
        }

        return null;
    }
}
