package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/1/7
 * @Description
 */
public class Code0912 {
    public static void main(String[] args) {
        int[] nums1 = {5,2,3,1};
        nums1 = sortArray(nums1);
        for (int num : nums1)
            System.out.print(num + " ");
        System.out.println();

        int[] nums2 = {5,1,1,2,0,0};
        nums2 = sortArray(nums2);
        for (int num : nums2)
            System.out.print(num + " ");
    }
    public static int[] sortArray(int[] nums) {
        Arrays.sort(nums);

//        int tmp;
//        int n = nums.length;
//        for(int i = 0; i < n / 2; i++){
//            tmp = nums[n - i - 1];
//            nums[n - i - 1] = nums[i];
//            nums[i] = tmp;
//        }

        return nums;
    }
}
