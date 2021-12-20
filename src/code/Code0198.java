package code;

/**
 * @Author czgggggggg
 * @Date 2021/12/20
 * @Description
 */
public class Code0198 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        System.out.println(rob(nums1));//4
        int[] nums2 = {2,7,9,3,1};
        System.out.println(rob(nums2));//12
    }
    public static int rob(int[] nums) {
        int len = nums.length;
        if(len == 1)
            return nums[0];
        if(len == 2)
            return Math.max(nums[0],nums[1]);

        int[] max_Sum = new int[len];
        max_Sum[0] = nums[0];
        max_Sum[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < len; i++){
            max_Sum[i] = Math.max(max_Sum[i - 1], max_Sum[i - 2] + nums[i]);
        }

        return max_Sum[len - 1];
    }
}
