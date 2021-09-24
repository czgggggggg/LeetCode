package jzOffer;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class Offer0052 {
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
        ListNode curA = headA;
        ListNode curB = headB;
        boolean isA = true;
        boolean isB = true;
        while(!(curA == null && curB == null)){
            if(curA == null){
                if(isA){
                    curA = headB;
                    isA = false;
                }else{
                    curA = headA;
                    isA = true;
                }
                curB = curB.next;
            }else if(curB == null){
                if(isB){
                    curB = headA;
                    isB = false;
                }else{
                    curB = headB;
                    isB = true;
                }
                curA = curA.next;
            }else{
                if(curA == curB)
                    return curA;
                curA = curA.next;
                curB = curB.next;
            }
        }
        if(curA == null && curB == null){
            return null;
        }
        return null;//不会执行到此句。
    }
}
