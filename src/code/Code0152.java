package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/12/20
 * @Description
 */
public class Code0152 {
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
        int[] maxF = new int[n];
        int[] minF = new int[n];
        System.arraycopy(nums,0,maxF,0,n);
        System.arraycopy(nums,0,minF,0,n);

        for(int i = 1; i < n; i++){
            maxF[i] = Math.max(nums[i],Math.max(maxF[i - 1] * nums[i], minF[i - 1] * nums[i]));
            minF[i] = Math.min(nums[i],Math.min(minF[i - 1] * nums[i], maxF[i - 1] * nums[i]));
        }

        int ans = maxF[0];
        for(int i = 1; i < n; i++)
            ans = Math.max(ans,maxF[i]);
        return ans;
    }










    //----------------------v0.1（弃）------------------------
//    public static int maxProduct(int[] nums) {
//        int n = nums.length;
//
//        //优化
//        int negative_count = 0;
//        boolean has_zero = false;
//        int all_product = 1;//所有数的乘积
//        for(int i = 0; i < n; i++){
//            if(nums[i] < 0)
//                negative_count++;
//            else if(nums[i] == 0)
//                has_zero = true;
//            all_product *= nums[i];
//        }
//        if(negative_count % 2 == 0 && !has_zero)
//            return all_product;
//        if(negative_count % 2 != 0 && has_zero)
//            return 0;
//
//        //负数奇数个、不包含0
//        //负数偶数个、包含零
//        int negative_first_index = 0;
//        int negative_last_index = 0;
//        boolean isFirst = true;
//        for(int i = 0; i < n; i++){
//            if(nums[i] < 0){
//                if(isFirst){
//                    negative_first_index = i;
//                    isFirst = false;
//                }
//                else
//                    negative_last_index = i;
//            }
//        }
//        int product_left = 1;
//        int product_rigit = 1;
//        if(negative_count % 2 != 0 && !has_zero){
//            for(int i = 0; i < n; i++){
//                if(i < negative_last_index)
//                    product_left *= nums[i];
//                else if(i > negative_first_index)
//                    product_rigit *= nums[i];
//            }
//        }
//
//
////        int[][] maxSum = new int[n][n];
////        for(int i = 0; i < n; i++)
////            maxSum[i][i] = nums[i];
////        for(int k = 1; k < n; k++){
////            for(int i = 0; i + k < n; i++){
////                maxSum[i][i + k] =
////            }
////        }
//
//        return 111;
//    }
}
