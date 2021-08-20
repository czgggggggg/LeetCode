package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array219 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int k1 = 3;
        System.out.println(containsNearbyDuplicate(nums1,k1));
        int[] nums2 = {1,0,1,1};
        int k2 = 1;
        System.out.println(containsNearbyDuplicate(nums2,k2));
        int[] nums3 = {1,2,3,1,2,3};
        int k3 = 2;
        System.out.println(containsNearbyDuplicate(nums3,k3));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length < 2 || k < 1)
            return false;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length && j <= i + k; j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}
