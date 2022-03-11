package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/3/10
 * @Description
 */
public class Code0313 {
    public static void main(String[] args) {
        int n1 = 12;
        int[] primes1 = {2,7,13,19};
        System.out.println(nthSuperUglyNumber(n1,primes1));//32

        int n2 = 6;
        int[] primes2 = {2,3,5};
        System.out.println(nthSuperUglyNumber(n2,primes2));//1
    }
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        dp[0] = 1;
        int m = primes.length;
        int[] points = new int[m];

        int min;
        for(int i = 1; i < n; i++){
            min = Integer.MAX_VALUE;
            for(int j = 0; j < m; j++){
                min = Math.min(dp[points[j]] * primes[j], min);
            }
            dp[i] = min;
//            System.out.println("test---" + dp[i]);

            for(int j = 0; j < m; j++){
                if(min == dp[points[j]] * primes[j]){
                    points[j]++;
                }
            }
        }

        return dp[n - 1];
    }
}
//2,7,13,19
//1,2,4,7,8,13,14,16,19,26,28,32
