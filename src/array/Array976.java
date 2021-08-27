package array;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/8/27
 * @Description
 */
public class Array976 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,7,4,9,6,8,2,5};
        System.out.println(largestPerimeter(nums1));
        int[] nums2 = {2,1,2};
        System.out.println(largestPerimeter(nums2));
        int[] nums3 = {1,2,1};
        System.out.println(largestPerimeter(nums3));
        int[] nums4 = {3,2,3,4};
        System.out.println(largestPerimeter(nums4));
        int[] nums5 = {3,6,2,3};
        System.out.println(largestPerimeter(nums5));
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 2; i--){
            if(nums[i - 2] + nums[i - 1] > nums[i]){
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        return 0;
    }
}
//3,6,2,3
//2,3,3,6
//2,3,3

//1,2,3,4,5,6,7,8,9
//7,8,9