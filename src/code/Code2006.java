package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/2/13
 * @Description
 */
public class Code2006 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int k1 = 1;
        System.out.println(countKDifference(nums1, k1));//4

        int[] nums2 = {1,3};
        int k2 = 3;
        System.out.println(countKDifference(nums2, k2));//0

        int[] nums3 = {3,2,1,5,4};
        int k3 = 2;
        System.out.println(countKDifference(nums3, k3));//3

        int[] nums4 = {1};
        int k4 = 1;
        System.out.println(countKDifference(nums4, k4));//0
    }
    public static int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        Arrays.sort(nums);
        int diff;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                diff = nums[j] - nums[i];
                if(diff == k){
                    count++;
                }else if(diff > k){
                    break;
                }
            }
        }

        return count;
    }
}
