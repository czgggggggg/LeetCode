package jzOffer;

/**
 * @Author czgggggggg
 * @Date 2021/9/24
 * @Description
 */
public class Offer0023II {
    public static void main(String[] args) {

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
