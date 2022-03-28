package wangyi;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/27
 * @Description
 */
public class Test0004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[m][n];

        int left, down, right;
        //第一行
        for(int j = 1; j < n; j++){
            if(arr[0][j - 1] == arr[0][j])
                left = 1;
            else
                left = 2;
            dp[0][j] = dp[0][j - 1] + left;
        }

        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                left = -1;
                down = -1;
                if(j > 0)
                    left = (arr[i][j - 1] == arr[i][j] ? 1 : 2);
                if(i > 0)
                    down = (arr[i - 1][j] == arr[i][j] ? 1 : 2);

                if(left != -1 && down != -1)
                    dp[i][j] = Math.min(dp[i][j - 1] + left, dp[i - 1][j] + down);
                else{
                    if(left != -1)
                        dp[i][j] = dp[i][j - 1] + left;
                    else
                        dp[i][j] = dp[i - 1][j] + down;
                }
            }
        }

        System.out.println(dp[m - 1][n - 1]);

    }
}
//3 3
//1 0 0
//1 1 1
//0 0 1
