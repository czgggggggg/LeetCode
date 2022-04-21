package weizhong;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/20
 * @Description
 */
public class Code0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        long[] dp = new long[n];
        long res = 0, mod = 1000000007;
        for(int i = 0; i < n; i++){
            dp[i] = 1;
            for(int j = i - 1; j >= 0; j--){
                if(nums[i] > nums[j]){
                    dp[i] = (dp[i] + dp[j] % mod) % mod;
                }
            }
            res = (res + dp[i]) % mod;
        }
        System.out.println(res);
    }
}
