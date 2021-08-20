package array;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array217 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
            else
                return true;
        }
        return false;
    }
}
