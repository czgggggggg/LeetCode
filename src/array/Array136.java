package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array136 {
    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        System.out.println(singleNumber(nums1));
        int[] nums2 = {4,1,2,1,2};
        System.out.println(singleNumber(nums2));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }
}
//[4,1,2,1,2]
//[1,2,3,4,3,2,1]
