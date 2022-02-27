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
        System.out.println(threeSumClosest(nums1,target1));//2

        int[] nums2 = {0,0,0};
        int target2 = 1;
        System.out.println(threeSumClosest(nums2,target2));//0

        int[] nums3 = {1,2,3,4,5,9,10,11,12,13,14};
        int target3 = 1;
        System.out.println(threeSumClosest(nums3,target3));//6
        int[] nums4 = {1,2,3,4,5,9,10,11,12,13,14};
        int target4 = 9;
        System.out.println(threeSumClosest(nums4,target4));//9
        int[] nums5 = {1,2,3,4,5,9,10,11,12,13,14};
        int target5 = 39;
        System.out.println(threeSumClosest(nums5,target5));//39
        int[] nums6 = {1,2,3,4,5,9,10,11,12,13,14};
        int target6 = 40;
        System.out.println(threeSumClosest(nums6,target6));//39

        int[] nums7 = {4,0,5,-5,3,3,0,-4,-5};
        //-5,-5,-4,0,0,3,3,4,5
        int target7 = -2;
        System.out.println(threeSumClosest(nums7,target7));//-2

        int[] nums8 = {-55,-24,-18,-11,-7,-3,4,5,6,9,11,23,33};
        int target8 = 0;
        System.out.println(threeSumClosest(nums8,target8));//0
    }

    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int closestNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r){
                int threeSum = nums[l] + nums[r] + nums[i];
                if (Math.abs(threeSum - target) < Math.abs(closestNum - target)) {
                    closestNum = threeSum;
                }
                if (threeSum > target) {
                    r--;
                } else if (threeSum < target) {
                    l++;
                } else {
                    // 如果已经等于target的话, 肯定是最接近的
                    return target;
                }
            }
        }
        return closestNum;
    }

    //v0.2双指针 死在倒数第二个样例上，逻辑有问题，不知如何修改，暂弃。
//    public static int threeSumClosest(int[] nums, int target) {
//        int n = nums.length;
//        Arrays.sort(nums);
//        int res = nums[0] + nums[1] + nums[2];
//
//        int i, j;
//        int diff1, diff2, diff3;
//        for(int t = 0; t < n - 2; t++){
//            i = t + 1;
//            j = n - 1;
//            while(j - i >= 2){
//                if(nums[t] == -11){
//                    System.out.println(nums[i] + " " + nums[j]);
//                }
//                diff1 = Math.abs(nums[t] + nums[i] + nums[j] - target);
//                diff2 = Math.abs(nums[t] + nums[i + 1] + nums[j] - target);
//                diff3 = Math.abs(nums[t] + nums[i] + nums[j - 1] - target);
////                if(diff1 <= diff2 && diff1 <= diff3){
//                if(diff1 < diff2 && diff1 < diff3){
//                    break;
//                }else{
//                    if(diff2 <= diff3){
//                        i++;
//                    }else{
//                        j--;
//                    }
//                }
//            }
////            res = nums[t] + nums[i] + nums[j];
//            if(Math.abs(nums[t] + nums[i] + nums[j] - target) < Math.abs(res - target)){
//                res = nums[t] + nums[i] + nums[j];
//            }
//        }
//
//        return res;
//    }
    //执行结果：解答错误
    //显示详情
    //通过测试用例：94 / 132
    //输入：
    //[4,0,5,-5,3,3,0,-4,-5]
    //-2
    //输出：
    //-1
    //预期结果：
    //-2

    //执行结果：解答错误
    //显示详情
    //通过测试用例：131 / 132
    //输入：
    //[-55,-24,-18,-11,-7,-3,4,5,6,9,11,23,33]
    //0
    //输出：
    //1
    //预期结果：
    //0

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
