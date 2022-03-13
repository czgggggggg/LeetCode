package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/3/11
 * @Description
 */
public class Code0416 {
    public static void main(String[] args) {
        int[] nums1 = {1,5,11,5};
        System.out.println(canPartition(nums1));//true
        int[] nums2 = {1,2,3,5};
        System.out.println(canPartition(nums2));//false
        int[] nums3 = {1,2,3,5,9};
        System.out.println(canPartition(nums3));//true
        int[] nums4 = {2,3,3,5,5,7,9};
        System.out.println(canPartition(nums4));//true
        int[] nums5 = {3,3,3,5,5,8,9};
        System.out.println(canPartition(nums5));//true
        int[] nums6 = {2,3,8,9,9,13};
        System.out.println(canPartition(nums6));//true
        int[] nums7 = {3,4,8,9,9,13};
        System.out.println(canPartition(nums7));//false
        int[] nums8 = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97};
        System.out.println(canPartition(nums8));//false
        int[] nums9 = {2,2,20};
        System.out.println(canPartition(nums9));//false
    }

    //v0.2
    public static boolean canPartition(int[] nums) {
        int n = nums.length;
        if(n < 2)
            return false;
        Arrays.sort(nums);
        int sum = 0;
        int maxVal = nums[0];
        for(int num : nums){
            sum += num;
            maxVal = Math.max(maxVal,num);
        }
        if(sum % 2 == 1)
            return false;
        if(maxVal > sum / 2)
            return false;

        int target = sum / 2;
        //原问题转化为是否存在nums的子集，其和为target

        //---------------------------------------------------//
        boolean[][] dp = new boolean[n][target + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            for (int j = 1; j <= target; j++) {
                if (j >= num) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][target];
    }

    //v0.1 回溯法超时
//    public static boolean canPartition(int[] nums) {
//        int n = nums.length;
//        Arrays.sort(nums);
//        int sum = 0;
//        for(int num : nums)
//            sum += num;
//        if(sum % 2 == 1)
//            return false;
//
//        int target = sum / 2;
//        //原问题转化为是否存在nums的子集，其和为target
//
//        //想不出怎么用动态规划，先用回溯法
////        List<Integer> list = new ArrayList<>();
//        sum = 0;
//        int preIndex = -1;
//        return dfs(target,sum,preIndex,nums,n);
//    }
//    public static boolean dfs(int target, int sum, int preIndex, int[] nums, int n){
//        if(preIndex == n - 1)
//            return false;
//
//        boolean b = false;
//        for(int i = preIndex + 1; i < n; i++){
//            if(sum + nums[i] == target)
//                return true;
//            else if(sum + nums[i] < target){
////                sum += nums[i];
//                b = b || dfs(target,sum + nums[i],i,nums,n);
////                sum -= nums[i];
//            }
//        }
//
//        return b;
//    }

    //官方题解
//    public static boolean canPartition(int[] nums) {
//        int n = nums.length;
//        if (n < 2) {
//            return false;
//        }
//        int sum = 0, maxNum = 0;
//        for (int num : nums) {
//            sum += num;
//            maxNum = Math.max(maxNum, num);
//        }
//        if (sum % 2 != 0) {
//            return false;
//        }
//        int target = sum / 2;
//        if (maxNum > target) {
//            return false;
//        }
//        boolean[][] dp = new boolean[n][target + 1];
//        for (int i = 0; i < n; i++) {
//            dp[i][0] = true;
//        }
//        dp[0][nums[0]] = true;
//        for (int i = 1; i < n; i++) {
//            int num = nums[i];
//            for (int j = 1; j <= target; j++) {
//                if (j >= num) {
//                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
//                } else {
//                    dp[i][j] = dp[i - 1][j];
//                }
//            }
//        }
//        return dp[n - 1][target];
//    }
}
