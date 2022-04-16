package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/4/15
 * @Description
 */
public class Code0152_2 {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        System.out.println(maxProduct(num1));//6
        int[] num2 = {-1,-2,-3,-4};
        System.out.println(maxProduct(num2));//24
        int[] num3 = {-1,-2,-3,0};
        System.out.println(maxProduct(num3));//6
        int[] num4 = {-1,-2,0};
        System.out.println(maxProduct(num4));//2
        int[] num5 = {2,3,-2,4};
        System.out.println(maxProduct(num5));//6
        int[] num6 = {-2,0,-1};
        System.out.println(maxProduct(num6));//0
    }
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int[] max = Arrays.copyOf(nums,n);
        int[] min = Arrays.copyOf(nums,n);

        for(int i = 1; i < n; i++){
            max[i] = Math.max(nums[i], Math.max(max[i - 1] * nums[i], min[i - 1] * nums[i]));
            min[i] = Math.min(nums[i], Math.min(max[i - 1] * nums[i], min[i - 1] * nums[i]));
        }

        int res = max[0];
        for(int i = 1; i < n; i++)
            res = Math.max(res, max[i]);

        return res;
    }
}
