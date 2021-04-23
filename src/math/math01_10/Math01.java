package math.math01_10;
/**
* @Author czgggggggg
* @Date 2021/4/23
* @Description  2. 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
*/
public class Math01 {
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);

//        ListNode l1 = new ListNode(0);
//        ListNode l2 = new ListNode(0);

//        ListNode l1 = new ListNode(9);
//        l1.next = new ListNode(9);
//        l1.next.next = new ListNode(9);
//        l1.next.next.next = new ListNode(9);
//        l1.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next.next = new ListNode(9);
//        ListNode l2 = new ListNode(9);
//        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(9);
//        l2.next.next.next = new ListNode(9);

        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        //[2,4,9]
        //[5,6,4,9]
        //[7,0,4,0,1]
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(9);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        l2.next.next.next = new ListNode(9);

        ListNode listNode = addTowNumbers(l1, l2);
        ListNode current = listNode;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode addTowNumbers(ListNode l1, ListNode l2){
        int size1 = 0, size2 = 0;//分别记录链表1和链表2的节点个数
        ListNode current1 = l1;
        while(current1 != null){
            size1++;
            current1 = current1.next;
        }
        ListNode current2 = l2;
        while(current2 != null){
            size2++;
            current2 = current2.next;
        }
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int size3 = size1 >= size2 ? size1 + 1 :size2 + 1;
        int[] arr3 = new int[size3];
        current1 = l1;
        current2 = l2;
        int i1 = 0, i2 = 0;
        while(current1 != null){
            arr1[i1++] = current1.val;
            current1 = current1.next;
        }
        while(current2 != null){
            arr2[i2++] = current2.val;
            current2 = current2.next;
        }
        //[2,4,3] [5,6,4]
        int count1 = size1, count2 = size2, count3 = size3;
        int tmp = 0;
        count1--;
        count2--;
//        for(int i = 0; i < size1; i++){
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.println();
//        for(int i = 0; i < size2; i++){
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
        //arr1、arr2数组逆序
        for(int i = 0; i < arr1.length / 2; i++){
            int tmp1 = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = tmp1;
        }
        for(int i = 0; i < arr2.length / 2; i++){
            int tmp1 = arr2[i];
            arr2[i] = arr2[arr2.length - i - 1];
            arr2[arr2.length - i - 1] = tmp1;
        }
        while(count1 >= 0 || count2 >= 0){
            if(count1 >= 0 && count2 >= 0){
                arr3[--count3] = (arr1[count1] + arr2[count2] + tmp) % 10;
                tmp = (arr1[count1] + arr2[count2] + tmp) / 10;
                count1--;
                count2--;
            }
            else if(count1 >= 0){
                arr3[--count3] = (arr1[count1] + tmp) % 10;
                tmp = (arr1[count1] + tmp) / 10;
                count1--;
            }
            else if(count2 >= 0){
                arr3[--count3] = (arr2[count2] + tmp) % 10;
                tmp = (arr2[count2] + tmp) / 10;
                count2--;
            }
        }
        //最后一次进位  只可能是0或1
        if(tmp == 0)
            arr3[--count3] = -1;
        else
            arr3[--count3] = tmp;
//        for(int i = 0; i < size3; i++){
//            System.out.print(arr3[i] + " ");
//        }
        count3 = size3;
        ListNode result = new ListNode(arr3[--count3]);
        ListNode current = result;
        while(--count3 >= 0){
            if(arr3[count3] != -1) {
                current.next = new ListNode(arr3[count3]);
                current = current.next;
            }
        }
        return result;
    }
    //注意：链表节点数范围在[1,100]，显然不能用int直接存储数字。
//    public static ListNode addTowNumbers(ListNode l1, ListNode l2){
//        int num1 = 0, num2 = 0;
//        int n1 = 1;
//        ListNode current1 = l1;
//        while(current1 != null){
//            num1 += current1.value * n1;
//            n1 *= 10;
//            current1 = current1.next;
//        }
//        System.out.println("num1 = " + num1);
//        int n2 = 1;
//        ListNode current2 = l2;
//        while(current2 != null){
//            num2 += current2.value * n2;
//            n2 *= 10;
//            current2 = current2.next;
//        }
//        System.out.println("num2 = " + num2);
////        return num1 + num2;//807
//        ListNode l3;
//        ListNode tmp;
//        int result = num1 + num2;
//        l3 = new ListNode(result % 10);
//        result /= 10;
//        tmp = l3;
//        while(result != 0) {
//            tmp.next = new ListNode(result % 10);
//            result /= 10;
//            tmp = tmp.next;
//        }
//        return l3;
//    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}
