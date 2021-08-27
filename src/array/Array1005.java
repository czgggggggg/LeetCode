package array;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/8/27
 * @Description
 */
public class Array1005 {
    public static void main(String[] args) {
        int[] nums1 = {4,2,3};
        int k1 = 1;
        System.out.println(largestSumAfterKNegations(nums1,k1));
        int[] nums2 = {3,-1,0,2};
        int k2 = 3;
        System.out.println(largestSumAfterKNegations(nums2,k2));
        int[] nums3 = {2,-3,-1,5,-4};
        int k3 = 2;
        System.out.println(largestSumAfterKNegations(nums3,k3));
        int[] nums4 = {100};
        int k4 = 101;
        System.out.println(largestSumAfterKNegations(nums4,k4));
        int[] nums5 = {-4,-2,-3};
        int k5 = 4;
        System.out.println(largestSumAfterKNegations(nums5,k5));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int negativeNum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0)
                negativeNum++;
            else
                break;
        }
        if(k <= negativeNum){
            for(int i = 0; i < k; i++)
                nums[i] = -nums[i];
        }else{
            for(int i = 0; i < negativeNum; i++){
                nums[i] = -nums[i];
            }
            k -= negativeNum;
            k %= 2;
            if(k == 1){//多余1次取反操作，则对当前的nums数组中最小非负整数取反
                if(negativeNum == 0){//原数组没有负数的情况
                    nums[0] = -nums[0];
                }else{//原数组有负数的情况
                    if(nums.length == 1)//数组中只有1个元素
                        nums[0] = -nums[0];
                    else if(nums.length >= 1){//数组中至少有两个元素
                        if(negativeNum == nums.length){//第一次提交没有AC的地方，没有考虑原数组的所有元素都是负数，之间判断nums[negativeNum - 1] < nums[negativeNum]会造成数组越界。
                            nums[negativeNum - 1] = -nums[negativeNum - 1];
                        }else{
                            if(nums[negativeNum - 1] < nums[negativeNum])
                                nums[negativeNum - 1] = -nums[negativeNum - 1];
                            else
                                nums[negativeNum] = -nums[negativeNum];
                        }
                    }
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
//            System.out.print(nums[i] + " ");
            sum += nums[i];
        }
//        System.out.println();

        return sum;
    }
}
