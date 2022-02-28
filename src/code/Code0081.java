package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/28
 * @Description
 */
public class Code0081 {
    public static void main(String[] args) {
//        int[] nums = {2,5,6,0,0,1,2};
//        System.out.println(search(nums,0));
//        System.out.println(search(nums,1));
//        System.out.println(search(nums,2));
//        System.out.println(search(nums,5));
//        System.out.println(search(nums,6));
//        System.out.println(search(nums,3));//false
//        System.out.println(search(nums,4));//false

//        int[] nums = {2,5,6,0,0,1,2};
//        System.out.println(search(nums,0));
//        System.out.println(search(nums,1));
//        System.out.println(search(nums,2));
//        System.out.println(search(nums,5));
//        System.out.println(search(nums,6));
//        System.out.println(search(nums,3));//false
//        System.out.println(search(nums,4));//false

        int[] nums = {1,0,1,1,1,1,1,1};
//        int[] nums = {0,1,0,0,0,0,0,0};
        System.out.println(search(nums,0));
        System.out.println(search(nums,1));
    }
    public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        return BinarySearch(nums,target,low,high);
    }
    //特殊折半查找
    public static boolean BinarySearch(int[] nums, int target, int low, int high){
        if(low > high)
            return false;

        int mid = (low + high) / 2;
        if(nums[mid] == target){
            return true;
        }else{
            if(nums[mid] >= nums[low]){
                if(target >= nums[low] && target < nums[mid]){
                    return NormalBinarySearch(nums,target,low,mid-1);
                }
                //增加的判断分支
                else if((target > nums[low] && target > nums[mid]) || (target < nums[low] && target < nums[high])){
//                    if(nums[mid] == nums[low] && nums[mid] == nums[high]){
                    return BinarySearch(nums,target,low,mid-1) || BinarySearch(nums,target,mid+1,high);
//                    }
                }
                else{
                    return BinarySearch(nums,target,mid+1,high);
                }
            }else{//nums[mid] < nums[low]
                if(target > nums[mid] && target <= nums[high]){
                    return NormalBinarySearch(nums,target,mid+1,high);
                }
                else{
                    return BinarySearch(nums,target,low,mid-1);
                }
            }
        }
    }
    //普通折半查找
    public static boolean NormalBinarySearch(int[] nums, int target, int low, int high){
        if(low > high)
            return false;

        int mid = (low + high) / 2;
        if(target == nums[mid])
            return true;
        else if(target < nums[mid])
            return NormalBinarySearch(nums,target,low,mid - 1);
        else
            return NormalBinarySearch(nums,target,mid + 1, high);
    }
}
