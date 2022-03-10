package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/10
 * @Description
 */
public class Code0300 {
    public static void main(String[] args) {
        int[] nums1 = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums1));
        int[] nums2 = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums2));
        int[] nums3 = {7,7,7,7,7,7,7};
        System.out.println(lengthOfLIS(nums3));
    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int max;
        for(int i = 1; i < n; i++){
            max = 0;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    if(max < dp[j]){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max + 1;
        }

        max = 0;
        for(int i = 0; i < n; i++){
            if(max < dp[i])
                max = dp[i];
        }

        return max;
    }
}
//1 2 3 4 5 100 6 7 8
