package array;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array349 {
    public static void main(String[] args) {
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        int[] num3 = intersection(num1, num2);
        for(int x: num3){
            System.out.print(x + " ");
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

        int[] results = new int[set2.size()];
        Iterator<Integer> iterator = set2.iterator();
        int i = 0;
        while (iterator.hasNext()){
            results[i++] = iterator.next();
        }

        return results;
    }
}
