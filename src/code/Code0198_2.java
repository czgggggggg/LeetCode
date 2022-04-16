package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/15
 * @Description
 */
public class Code0198_2 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        System.out.println(rob(nums1));//4
        int[] nums2 = {2,7,9,3,1};
        System.out.println(rob(nums2));//12
        int[] nums3 = {2,1,1,2};
        System.out.println(rob(nums3));//4
    }
    public static int rob(int[] nums) {
        int n = nums.length;

        if(n == 1)
            return nums[0];
        if(n == 2)
            return Math.max(nums[0], nums[1]);

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[n - 1];
    }
}
