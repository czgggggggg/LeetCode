package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/19
 * @Description
 */
public class Code0033 {
    public static void main(String[] args) {
//        int[] nums = {4,5,6,7,0,1,2};
//        System.out.println(search(nums,0));//4
//        int[] nums = {4,5,6,7,0,1,2};
//        System.out.println(search(nums,3));//-1
        int[] nums = {1};
        System.out.println(search(nums,0));//-1

//        int[] nums = {1,2,3,4};
//        System.out.println(search(nums,1));
//        System.out.println(search(nums,2));
//        System.out.println(search(nums,3));
//        System.out.println(search(nums,4));

//        int[] nums = {3,4,1,2};
//        System.out.println(search(nums,3));
//        System.out.println(search(nums,4));
//        System.out.println(search(nums,1));
//        System.out.println(search(nums,2));

//        int[] nums = {9,10,11,12,13,14,15,1,2,3,4,5,6,7,8};
//        System.out.println(search(nums,9));
//        System.out.println(search(nums,10));
//        System.out.println(search(nums,11));
//        System.out.println(search(nums,12));
//        System.out.println(search(nums,13));
//        System.out.println(search(nums,14));
//        System.out.println(search(nums,15));
//        System.out.println(search(nums,1));
//        System.out.println(search(nums,2));
//        System.out.println(search(nums,3));
//        System.out.println(search(nums,4));
//        System.out.println(search(nums,5));
//        System.out.println(search(nums,6));
//        System.out.println(search(nums,7));
//        System.out.println(search(nums,8));
//        System.out.println(search(nums,0));//-1
//        System.out.println(search(nums,16));//-1

//        int[] nums = {5,6,7,1,2,3,4};
//        System.out.println(search(nums,5));
//        System.out.println(search(nums,6));
//        System.out.println(search(nums,7));
//        System.out.println(search(nums,1));
//        System.out.println(search(nums,2));
//        System.out.println(search(nums,3));
//        System.out.println(search(nums,4));
    }
    //v0.2
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        return BinarySearch(nums,target,low,high);
    }

    //v0.2
    //特殊折半查找
    public static int BinarySearch(int[] nums, int target, int low, int high){
        if(low > high)
            return -1;

        int mid = (low + high) / 2;
        if(nums[mid] == target){
            return mid;
        }else{
            if(nums[mid] >= nums[low]){
                if(target >= nums[low] && target < nums[mid]){
                    return NormalBinarySearch(nums,target,low,mid-1);
                }else{
                    return BinarySearch(nums,target,mid+1,high);
                }
            }else{//nums[mid] < nums[low]
                if(target > nums[mid] && target <= nums[high]){
                    return NormalBinarySearch(nums,target,mid+1,high);
                }else{
                    return BinarySearch(nums,target,low,mid-1);
                }
            }
        }
    }

    //v0.1 弃
//    public static boolean BinarySearch(int[] nums, int target){
//        int n = nums.length;
//        return BinarySearch(nums,target,0,n - 1);
//    }
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

    //普通折半查找
    public static int NormalBinarySearch(int[] nums, int target, int low, int high){
        if(low > high)
            return -1;

        int mid = (low + high) / 2;
        if(target == nums[mid])
            return mid;
        else if(target < nums[mid])
            return NormalBinarySearch(nums,target,low,mid - 1);
        else
            return NormalBinarySearch(nums,target,mid + 1, high);
    }
}
