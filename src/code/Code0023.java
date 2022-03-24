package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/3/24
 * @Description
 */
public class Code0023 {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);
        ListNode[] lists = new ListNode[3];
        lists[0] = list1;
        lists[1] = list2;
        lists[2] = list3;
        ListNode res = mergeKLists(lists);
        ListNode cur = res;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }//1 1 2 3 4 4 5 6


//        ListNode[] lists = {};
//        ListNode res = mergeKLists(lists);
//        ListNode cur = res;
//        while(cur != null){
//            System.out.print(cur.val + " ");
//            cur = cur.next;
//        }//

//        ListNode list1 = null;
//        ListNode[] lists = new ListNode[1];
//        lists[0] = list1;
//        ListNode res = mergeKLists(lists);
//        ListNode cur = res;
//        while(cur != null){
//            System.out.print(cur.val + " ");
//            cur = cur.next;
//        }//
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n == 0)
            return null;
        ArrayList<Integer> nums = new ArrayList<>();

        ListNode cur;
        for(int i = 0; i < n; i++){
            cur = lists[i];
            while(cur != null){
                nums.add(cur.val);
                cur = cur.next;
            }
        }

        int len = nums.size();
        int[] nums_arr = new int[len];
        int pos = 0;
        Iterator iterator = nums.iterator();
        while(iterator.hasNext()){
            nums_arr[pos++] = (int) iterator.next();
        }

        Arrays.sort(nums_arr);
        ListNode res = null;
        if(len == 0)
            return res;

        res = new ListNode(nums_arr[0]);
        cur = res;
        for(int i = 1; i < len; i++){
            cur.next = new ListNode(nums_arr[i]);
            cur = cur.next;
        }

        return res;
    }
}
