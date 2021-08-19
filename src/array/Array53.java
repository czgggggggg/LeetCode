package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/19
 * @Description
 */
public class Array53 {
    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums1));
        int[] nums2 = {1};
        System.out.println(maxSubArray(nums2));
        int[] nums3 = {0};
        System.out.println(maxSubArray(nums3));
        int[] nums4 = {-1};
        System.out.println(maxSubArray(nums4));
        int[] nums5 = {-100000};
        System.out.println(maxSubArray(nums5));
    }
    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
//            System.out.println("dp[" + i + "] = " + dp[i]);
        }
        int max = Integer.MIN_VALUE;
        int tag = -1;
        for(int i = 0; i < nums.length; i++){
            if(max < dp[i]){
                max = dp[i];
                tag = i;
            }
        }
        System.out.println("tag = " + tag);
        return max;
    }
}
//[-2,1,-3,4,-1,2,1,-5,4]
//[-2]          -> [-2]                     ->[-2]
//[-2,1]        -> [1] [max([-2]),1]        ->[1]
//[-2,1,-3]     -> [-3] [max([-2,1]),-3]    ->[1]
//[-2,1,-3,4]   -> [4] [max([-2,1,-3]),4]   ->[4]
//...
