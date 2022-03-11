package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/3/11
 * @Description
 */
public class Code0368 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        List<Integer> list1 = largestDivisibleSubset(nums1);
        Iterator<Integer> iterator1 = list1.iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();

        int[] nums2 = {1,2,4,8};
        List<Integer> list2 = largestDivisibleSubset(nums2);
        Iterator<Integer> iterator2 = list2.iterator();
        while(iterator2.hasNext()){
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();

        int[] nums3 = {1};
        List<Integer> list3 = largestDivisibleSubset(nums3);
        Iterator<Integer> iterator3 = list3.iterator();
        while(iterator3.hasNext()){
            System.out.print(iterator3.next() + " ");
        }
        System.out.println();
    }

    //按照官方题解自己写一遍
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        if(n == 1){
            List<Integer> res = new ArrayList<>();
            res.add(nums[0]);
        }

        int maxSize = 1;
        int maxValue = nums[0];//
        for(int i = 1; i < n; i++){//当前遍历的是第（i+1）个数
            for(int j = 0; j < i; j++){//前 i 个数已经获得dp
                if(nums[i] % nums[j] == 0){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if(dp[i] > maxSize){
                maxSize = dp[i];
                maxValue = nums[i];
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i = n - 1; i >= 0 && maxSize > 0; i--){
            if(dp[i] == maxSize && maxValue % nums[i] == 0){
                res.add(nums[i]);
                maxValue = nums[i];
                maxSize--;
            }
        }

        return res;
    }


    //官方题解
//    public static List<Integer> largestDivisibleSubset(int[] nums) {
//        int len = nums.length;
//        Arrays.sort(nums);
//
//        // 第 1 步：动态规划找出最大子集的个数、最大子集中的最大整数
//        int[] dp = new int[len];
//        Arrays.fill(dp, 1);
//        int maxSize = 1;
//        int maxVal = dp[0];
//        for (int i = 1; i < len; i++) {
//            for (int j = 0; j < i; j++) {
//                // 题目中说「没有重复元素」很重要
//                if (nums[i] % nums[j] == 0) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                }
//            }
//
//            if (dp[i] > maxSize) {
//                maxSize = dp[i];
//                maxVal = nums[i];
//            }
//        }
//
//        // 第 2 步：倒推获得最大子集
//        List<Integer> res = new ArrayList<Integer>();
//        if (maxSize == 1) {
//            res.add(nums[0]);
//            return res;
//        }
//
//        for (int i = len - 1; i >= 0 && maxSize > 0; i--) {
//            if (dp[i] == maxSize && maxVal % nums[i] == 0) {
//                res.add(nums[i]);
//                maxVal = nums[i];
//                maxSize--;
//            }
//        }
//        return res;
//    }
}
