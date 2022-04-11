package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/4/11
 * @Description
 */
public class Code0322_2 {
    public static void main(String[] args) {
        int[] coins1 = {1, 2, 5};
        System.out.println(coinChange(coins1,11));//3
        int[] coins2 = {2};
        System.out.println(coinChange(coins2,3));//-1
        int[] coins3 = {1};
        System.out.println(coinChange(coins3,0));//0
        int[] coins4 = {186,419,83,408};
        System.out.println(coinChange(coins4,6249));//20
        int[] coins5 = {1,4,96,98};
        System.out.println(coinChange(coins5,100));//2
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);//注意这里不能初始化为为Integer.MAX_VALUE，否则后面+1会溢出
        dp[0] = 0;

        Arrays.sort(coins);

        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }else{
                    break;
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE - 1 ? -1 : dp[amount];
    }
}
