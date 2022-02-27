package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/2/27
 * @Description
 */
public class Code0016 {
    public static void main(String[] args) {
        int[] nums1 = {-1,2,1,-4};
        int target1 = 1;
        System.out.println(threeSumClosest(nums1,target1));

        int[] nums2 = {0,0,0};
        int target2 = 1;
        System.out.println(threeSumClosest(nums2,target2));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        int min = Math.abs(res - target);
        int sum;
        int diff;

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    diff = Math.abs(sum - target);
                    if(diff < min){
                        res = sum;
                        min = diff;
                    }
                }
            }
        }

        return res;
    }

    //v0.1 暴力解法
//    public static int threeSumClosest(int[] nums, int target) {
//        int n = nums.length;
//        Arrays.sort(nums);
//        int res = nums[0] + nums[1] + nums[2];
//        int min = Math.abs(res - target);
//        int sum;
//        int diff;
//
//        for(int i = 0; i < n - 2; i++){
//            for(int j = i + 1; j < n - 1; j++){
//                for(int k = j + 1; k < n; k++){
//                    sum = nums[i] + nums[j] + nums[k];
//                    diff = Math.abs(sum - target);
//                    if(diff < min){
//                        res = sum;
//                        min = diff;
//                    }
//                }
//            }
//        }
//
//        return res;
//    }
}
