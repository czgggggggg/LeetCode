package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/2/26
 * @Description
 */
public class Code0645 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,4};
        int[] res1 = findErrorNums(nums1);
        for(int num : res1){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[] findErrorNums(int[] nums) {
        int[] errorNums = new int[2];
        int n = nums.length;
        Arrays.sort(nums);
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            if (curr == prev) {
                errorNums[0] = prev;
            } else if (curr - prev > 1) {
                errorNums[1] = prev + 1;
            }
            prev = curr;
        }
        if (nums[n - 1] != n) {
            errorNums[1] = n;
        }
        return errorNums;
    }
}
