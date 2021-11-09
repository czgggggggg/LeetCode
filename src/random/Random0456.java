//package random;
//
//import java.util.Stack;
//
///**
// * @Author czgggggggg
// * @Date 2021/10/29
// * @Description
// */
//public class Random0456 {
//    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,4};
//        System.out.println(find132pattern(nums1));//false
//        int[] nums2 = {3,1,4,2};
//        System.out.println(find132pattern(nums2));//true
//        int[] nums3 = {-1,3,2,0};
//        System.out.println(find132pattern(nums3));//true
//    }
//
//    public static boolean find132pattern(int[] nums) {
//        int n = nums.length;
//        int last = Integer.MIN_VALUE; // 132中的2
//        Stack<Integer> sta = new Stack<>();// 用来存储132中的3
//        if(nums.length < 3)
//            return false;
//        for(int i=n-1; i>=0; i--){
//
//            if(nums[i] < last) // 若出现132中的1则返回正确值
//                return true;
//
//            // 若当前值大于或等于2则更新2（2为栈中小于当前值的最大元素）
//            while(!sta.isEmpty() && sta.peek() < nums[i]){
//                last = sta.pop();
//            }
//
//            // 将当前值压入栈中
//            sta.push(nums[i]);
//        }
//        return false;
//    }
//
////    //002 右侧怎么处理没想出来
////    public static boolean find132pattern(int[] nums) {
////        int[] min = new int[nums.length];
////        int min_tmp = nums[0];
////        for(int i = 0; i < nums.length; i++){
////            if(min_tmp > nums[i]){
////                min_tmp = nums[i];
////            }
////            min[i] = min_tmp;
////        }
////
////        //左侧最小的    nums[j]     [右侧存在落于[左侧最小的]和nums[j]之间的元素]
////        //                         左侧最小的 < 右侧最小的 < nums[j]
////        //                         左侧最小的 < 右侧最大的 < nums[j]
////        //
////
////
////
////        //左侧最小的都不能成立，那左侧其他的元素也不能成立。
////        for(int j = 1; j < nums.length - 1; j++){
////            if(min[j - 1] < nums[j]){
////
////            }
////        }
////
////        return false;
////    }
//
//    //001 暴力破解，超时
////    public static boolean find132pattern(int[] nums) {
////        for(int i = 0; i < nums.length - 2; i++){
////            //nums[i]的后面存在两个比它更大的元素，并且这两个元素的大小逆序
////            //暴力破解，复杂度太高
////            for(int j = i + 1; j < nums.length - 1; j++){
////                if(nums[j] > nums[i]){
////                    for(int k = j + 1; k < nums.length; k++){
////                        if(nums[k] > nums[i] && nums[k] < nums[j])
////                            return true;
////                    }
////                }
////            }
////
////        }
////        return false;
////    }
//}
////1,1,1,1,1,1,1,3,1,1,1,1,2,1,1,1,1,1,1,1
////1  3  ->  2
//
//
//
