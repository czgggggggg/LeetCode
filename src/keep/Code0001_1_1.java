package keep;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Code0001_1_1 {
    static final int mod = 1000000000 + 7;

    public static void main(String[] args) {
        System.out.println(numWays(2));
        System.out.println(numWays(4));//7
        System.out.println(numWays(7));
        System.out.println(numWays(0));
    }

    public static int numWays(int n) {
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        if(n == 3)
            return 4;

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        for(int i = 3; i < n; i++){
            dp[i] = (dp[i - 3] + dp[i - 2] + dp[i - 1]) % mod;
        }

        return dp[n - 1];
    }
}
