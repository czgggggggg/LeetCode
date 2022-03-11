package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/11
 * @Description
 */
public class Code0309 {
    public static void main(String[] args) {
        int[] prices1 = {1};
        System.out.println(maxProfit(prices1));
        int[] prices2 = {1,2};
        System.out.println(maxProfit(prices2));
        int[] prices3 = {1,2,3};
        System.out.println(maxProfit(prices3));
        int[] prices4 = {2,0,2};
        System.out.println(maxProfit(prices4));
        int[] prices5 = {2,4,0};
        System.out.println(maxProfit(prices5));
        int[] prices6 = {1,2,3,0,2};
        System.out.println(maxProfit(prices6));
        int[] prices7 = {1,2,10,0,12};
        System.out.println(maxProfit(prices7));//13 = (2 - 1) + (12 - 0)
        int[] prices8 = {1,2,10,0,9};
        System.out.println(maxProfit(prices8));//10 = (2 - 1) + (9 - 0)
        int[] prices9 = {1,2,10,0,10};
        System.out.println(maxProfit(prices9));//11 = (2 - 1) + (10 - 0)
        int[] prices10 = {1,2,10,0,8};
        System.out.println(maxProfit(prices10));//9 = (10 - 1)

        int[] prices11 = {6,1,3,2,4,7};
        System.out.println(maxProfit(prices11));//6 = (7 - 1)
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 1)
            return 0;

        int m = n - 1;
        int[] prices_diff = new int[m];//价格差
        for(int i = 0; i < m; i++){
            prices_diff[i] = prices[i + 1] - prices[i];
        }

        int max = 0;
        int tmp1 = 0, tmp2 = 0, tmp3 = 0;

        if(m >= 1){
            max = Math.max(prices_diff[0],max);
            tmp1 = max;
        }
        if(m >= 2){
            max = Math.max(prices_diff[1],max);
            max = Math.max(prices_diff[0] + prices_diff[1],max);
            tmp2 = max;
        }
        if(m >= 3){
            max = Math.max(prices_diff[2],max);
            max = Math.max(prices_diff[1] + prices_diff[2],max);
            max = Math.max(prices_diff[0] + prices_diff[1] + prices_diff[2],max);
            tmp3 = max;
        }

        if(m == 1){
            return tmp1;
        }else if(m == 2){
            return tmp2;
        }else if(m == 3){
            return tmp3;
        }

        //---------------------------------------------------------------//
        int[] dp = new int[m];//以i为末端的最大收益 定义为 dp[i]
        dp[0] = tmp1;
        dp[1] = tmp2;
        dp[2] = tmp3;
        for(int i = 3; i < m; i++){
            dp[i] = Math.max(dp[i - 3] + prices_diff[i], dp[i - 2]);
            dp[i] = Math.max(dp[i], dp[i - 1]);
        }

        max = 0;
        for(int i = 0; i < m; i++){
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    //官方题解
    public static int maxProfit2(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        // f[i][0]: 手上持有股票的最大收益
        // f[i][1]: 手上不持有股票，并且处于冷冻期中的累计最大收益
        // f[i][2]: 手上不持有股票，并且不在冷冻期中的累计最大收益
        int[][] f = new int[n][3];
        f[0][0] = -prices[0];
        for (int i = 1; i < n; ++i) {
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][2] - prices[i]);
            f[i][1] = f[i - 1][0] + prices[i];
            f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]);
        }
        return Math.max(f[n - 1][1], f[n - 1][2]);
    }
}

//执行结果：解答错误
//通过测试用例：167 / 210
//输入：[6,1,3,2,4,7]
//输出：5
//预期结果：6