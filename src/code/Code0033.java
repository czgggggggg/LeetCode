//package code;
//
///**
// * @Author czgggggggg
// * @Date 2022/2/19
// * @Description
// */
//public class Code0033 {
//    public static void main(String[] args) {
////        int[] nums = {1,2,3,4};
////        int[] nums = {3,4,1,2};
//        int[] nums = {9,10,11,12,13,14,15,1,2,3,4,5,6,7,8};
//        System.out.println(BinarySearch(nums,0));
//        System.out.println(BinarySearch(nums,1));
//        System.out.println(BinarySearch(nums,2));
//        System.out.println(BinarySearch(nums,3));
//        System.out.println(BinarySearch(nums,4));
//        System.out.println(BinarySearch(nums,5));
//        System.out.println(BinarySearch(nums,6));
//        System.out.println(BinarySearch(nums,7));
//        System.out.println(BinarySearch(nums,8));
//        System.out.println(BinarySearch(nums,9));
//        System.out.println(BinarySearch(nums,10));
//        System.out.println(BinarySearch(nums,11));
//        System.out.println(BinarySearch(nums,12));
//        System.out.println(BinarySearch(nums,13));
//        System.out.println(BinarySearch(nums,14));
//        System.out.println(BinarySearch(nums,15));
//    }
//
//    public static boolean BinarySearch(int[] nums, int target){
//        int n = nums.length;
//        return BinarySearch(nums,target,0,n - 1);
//    }
//
//    public static boolean BinarySearch(int[] nums, int target, int low, int high){
//        if(low > high)
//            return false;
//
//        int mid = (low + high) / 2;
//        if(target == nums[mid])
//            return true;
//        else{
//            if(target < nums[low] && target < nums[high]){
//                if(target < nums[mid])
//                    return BinarySearch(nums,target,low,mid - 1);
//                else
//                    return BinarySearch(nums,target,low,mid - 1) || NormalBinarySearch(nums,target,mid + 1,high);
//            }else{//target > nums[low] && target > nums[high]
//                if(target < nums[mid])
//                    return BinarySearch(nums,target,mid + 1,high) || NormalBinarySearch(nums,target,low,mid - 1);
//                else
//                    return BinarySearch(nums,target,mid + 1,high);
//            }
//        }
//    }
//
//    //普通折半查找
//    public static boolean NormalBinarySearch(int[] nums, int target, int low, int high){
//        if(low > high)
//            return false;
//
//        int mid = (low + high) / 2;
//        if(target == nums[mid])
//            return true;
//        else if(target < nums[mid])
//            return NormalBinarySearch(nums,target,0,mid - 1);
//        else
//            return NormalBinarySearch(nums,target,mid + 1, high);
//    }
//}
