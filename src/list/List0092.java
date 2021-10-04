//package list;
//
///**
// * @Author czgggggggg
// * @Date 2021/9/30
// * @Description
// */
//public class List0092 {
//    public static void main(String[] args) {
//
//    }
//    public static ListNode reverseBetween(ListNode head, int left, int right) {
//        ListNode newHead = new ListNode(0);//辅助节点
//        newHead.next = head;
//        ListNode tmp;//临时保存节点
//        ListNode cur = head;
//        ListNode leftNode_pre = new ListNode(0);//left位置节点的前一个节点
//
//        int count = 0;
//        while(cur != null){
//            count++;
//            if(left == 1){
//                leftNode_pre = newHead;
//            }else{
//                if(count == left - 1){
//                    leftNode_pre = cur;
//                }else if(count >= left && count <= right){
//                    tmp = leftNode_pre.next;
//                    leftNode_pre.next = cur;
//                    cur.next = tmp;
//
//
//                }
//
//            }
//
//        }
//
//    }
//}
