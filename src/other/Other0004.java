package other;

/**
 * @Author czgggggggg
 * @Date 2022/4/16
 * @Description  折半查找
 */
public class Other0004 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,5,6,7};
        System.out.println(find(nums1,0));//
        System.out.println(find(nums1,1));
        System.out.println(find(nums1,2));
        System.out.println(find(nums1,3));
        System.out.println(find(nums1,4));//
        System.out.println(find(nums1,5));
        System.out.println(find(nums1,6));
        System.out.println(find(nums1,7));
        System.out.println(find(nums1,8));//
    }

    public static int find(int[] nums, int target){
        int n = nums.length;
        return find(nums, target, 0, n - 1);
    }

    public static int find(int[] nums, int target, int left, int right){
        int n = nums.length;
        if(left > right)
            return -1;

        int mid = (left + right) / 2;
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] > target)
            return find(nums, target, left, mid - 1);
        else
            return find(nums, target, mid + 1, right);
    }

//    public static boolean find(int[] nums, int target){
//        int n = nums.length;
//        return find(nums, target, 0, n - 1);
//    }
//
//    public static boolean find(int[] nums, int target, int left, int right){
//        int n = nums.length;
//        if(left > right)
//            return false;
//
//        int mid = (left + right) / 2;
//        if(nums[mid] == target)
//            return true;
//        else if(nums[mid] > target)
//            return find(nums, target, left, mid - 1);
//        else
//            return find(nums, target, mid + 1, right);
//    }
}
