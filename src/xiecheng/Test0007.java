package xiecheng;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/14
 * @Description
 */
public class Test0007 {
    static int mod = 1000000000 +7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        int n = chars.length;

        int tmp;
        int[][] dp = new int[n + 1][9];
        for(int i = 1; i <= n; i++){
            int m = (chars[i - 1] - '0') % 9;
            dp[i][m] += 1;
            for(int j = 0; j < 9; j++){
                tmp = dp[i - 1][j] + dp[i - 1][(j + 9 - m) % 9];
                dp[i][j] += (tmp % mod);
            }
        }

        System.out.println(dp[n][0]);
    }
}
