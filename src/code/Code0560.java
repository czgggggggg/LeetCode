//package code;
//
///**
// * @Author czgggggggg
// * @Date 2022/2/3
// * @Description
// */
//public class Code0560 {
//    public static void main(String[] args) {
//        int[] nums1 = {1,1,1};
//        int k1 = 2;
//        System.out.println(subarraySum(nums1,k1));
//        //2
//        int[] nums2 = {1,2,3};
//        int k2 = 3;
//        System.out.println(subarraySum(nums2,k2));
//        //2
//        int[] nums3 = {1, 2, 3, 1, 2, 3, 4, 5, 3, 2, 1, 2, 3};
//        int k3 = 6;
//        System.out.println(subarraySum(nums3,k3));
//        //6
//        int[] nums4 = {1};
//        int k4 = 1;
//        System.out.println(subarraySum(nums4,k4));
//        //1
//
//        int[] nums5 = {-1,-1,1};
//        int k5 = 0;
//        System.out.println(subarraySum(nums5,k5));
//        //1
//    }
//
//    //v0.2 考虑了负数的版本
//    public static int subarraySum(int[] nums, int k) {
//        int n = nums.length;
//        int sum = 0;
//        int count = 0;
//
//        int j = 0;
//        for(int i = 0; i < n; i++){
//            for(; j < n; j++){
//                sum += nums[j];
//                if(sum == k){
//                    count++;
//                    //因为下一轮子数组从nums[i+1]开始，所以此处减去nums[i]。
//                    sum -= nums[i];
//                    //因为sum减去了nums[i]，所以nums[i+1] + nums[j]是不可能等于k的，要保留nums[j]，而下一轮还会执行sum += nums[j]，所以此处要sum -= nums[j]。
//                    sum -= nums[j];
//                    break;
//                }else if(sum > k){
//                    sum -= nums[i];
//                    //因为下一轮还会执行sum += nums[j]，所以此处要sum -= nums[j]
//                    sum -= nums[j];
//                    //此时j的位置要保留，因为内循环执行j++，所以此处要j--
//                    break;
//                }
//                //sum < k 则内循环继续进行
//            }
//        }
//
//        return count;
//    }
//    //思路图：
//    //[-1,-1, 1,-1, 1]
//    //     _  _
//    //     _  _  _  _
//    //        _  _
//    //           _  _
//
//
//
//
//    //v0.1 没有考虑负数的版本
////    public static int subarraySum(int[] nums, int k) {
////        int n = nums.length;
////        int sum = 0;
////        int count = 0;
////
////        int j = 0;
////        for(int i = 0; i < n; i++){
////            for(; j < n; j++){
////                sum += nums[j];
////                if(sum == k){
////                    count++;
////                    //因为下一轮子数组从nums[i+1]开始，所以此处减去nums[i]。
////                    sum -= nums[i];
////                    //因为sum减去了nums[i]，所以nums[i+1] + nums[j]是不可能等于k的，要保留nums[j]，而下一轮还会执行sum += nums[j]，所以此处要sum -= nums[j]。
////                    sum -= nums[j];
////                    break;
////                }else if(sum > k){
////                    sum -= nums[i];
////                    //因为下一轮还会执行sum += nums[j]，所以此处要sum -= nums[j]
////                    sum -= nums[j];
////                    //此时j的位置要保留，因为内循环执行j++，所以此处要j--
////                    break;
////                }
////                //sum < k 则内循环继续进行
////            }
////        }
////
////        return count;
////    }
//}
////思路图
//// 1 2 3 1 2 3 4 5 3 2 1 2 3  //6
//// _ _ _
////   _ _ _
////     _ _ _
////       _ _ _
////                 _ _ _
////                     _ _ _
//
////第一次提交错误，没有考虑数组元素可能为负数
////执行结果：
////解答错误
////显示详情
////添加备注
////
////通过测试用例：
////32 / 89