package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/1/6
 * @Description
 */
public class Code0215 {
    public static void main(String[] args) {
//        int[] nums = {3,2,1,5,6,4};
//        System.out.println(findKthLargest(nums,2));//5
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums,4));//4
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
