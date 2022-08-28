package code;

/**
 * @Author chaizhigang
 * @Date 2022/8/28
 */
public class Code0312 {
    public static void main(String[] args) {
        int[] nums1 = {3, 1, 5, 8};
        System.out.println(maxCoins(nums1));//167
        int[] nums2 = {1, 5};
        System.out.println(maxCoins(nums2));//10
        int[] nums3 = {0};
        System.out.println(maxCoins(nums3));//0
        int[] nums4 = {3, 1, 5, 8, 3, 1, 5, 8, 3, 1, 5, 8, 3, 1, 5, 8, 3, 1, 5, 8, 3, 1, 5, 8, 3, 1, 5, 8};
        System.out.println(maxCoins(nums4));//5777
    }
    public static int maxCoins(int[] nums) {
        int n = nums.length;
        int[] val = new int[n + 2];
        val[0] = 1;
        for(int i = 1; i <= n; i++){
            val[i] = nums[i - 1];
        }
        val[n + 1] = 1;
        int[][] dp = new int[n + 2][n + 2];
        for(int i = 0; i < n + 2; i++){
            for(int j = 0; j < n + 2; j++){
                dp[i][j] = -1;
            }
        }

        return maxCoins(val, dp, 0, n + 1);
    }
    public static int maxCoins(int[] val, int[][] dp, int left, int right){
        if(left + 1 >= right){
            dp[left][right] = 0;
            return 0;
        }
        int max = 0;
        for(int mid = left + 1; mid < right; mid++){
            if(dp[left][mid] == -1){
                dp[left][mid] = maxCoins(val, dp, left, mid);
            }
            if(dp[mid][right] == -1){
                dp[mid][right] = maxCoins(val, dp, mid, right);
            }
            max = Math.max(max, val[left] * val[mid] * val[right] + dp[left][mid] + dp[mid][right]);
        }
        dp[left][right] = max;
        return max;
    }
}