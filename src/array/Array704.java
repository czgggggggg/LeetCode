package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array704 {
    public static void main(String[] args) {
        int[] nums1 = {-1,0,3,5,9,12};
        int target1 = 9;
        System.out.println(search(nums1,target1));
        int[] nums2 = {-1,0,3,5,9,12};
        int target2 = 2;
        System.out.println(search(nums2,target2));
        int[] nums3 = {1};
        int target3 = 1;
        System.out.println(search(nums3,target3));
    }
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while(low <= high){
            mid = (low + high) / 2;
            if(nums[mid] > target){
                high = mid - 1;
            }else if(nums[mid] == target){
                return mid;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
