package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code1991 {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println(findMiddleIndex(nums1));
        //3
        int[] nums2 = {1, 2, 3};
        System.out.println(findMiddleIndex(nums2));
        //-1
        int[] nums3 = {2, 1, -1};
        System.out.println(findMiddleIndex(nums3));
        //0
        int[] nums4 = {1};
        System.out.println(findMiddleIndex(nums4));
        //0
    }
    public static int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int total = Arrays.stream(nums).sum();

        for(int i = 0; i < n; i++){
            if(2 * sum + nums[i] == total)
                return i;
            sum += nums[i];
        }

        return -1;
    }
}
