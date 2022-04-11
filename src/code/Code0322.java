package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/4/11
 * @Description
 */
public class Code0322 {
    static int sum;
    static int n;
    static int min;
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
        if(amount == 0)
            return 0;

        n = coins.length;
        Arrays.sort(coins);
        int tmp;
        for(int i = 0; i < n / 2; i++){
            tmp = coins[i];
            coins[i] = coins[n - i - 1];
            coins[n - i - 1] = tmp;
        }

        sum = 0;
        min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(coins[i]);
            sum += coins[i];
            boolean res = dfs(coins, amount, list, i);
//            if(res)
//                return list.size();
//            else{
                list.remove(list.size() - 1);
                sum -= coins[i];
//            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static boolean dfs(int[] coins, int amount, List<Integer> list, int preIndex){
        if(sum == amount){
            min = Math.min(min,list.size());
            return true;
        }

        if(sum > amount)
            return false;

        for(int i = preIndex; i < n; i++){
            list.add(coins[i]);
            sum += coins[i];
            boolean res = dfs(coins, amount, list, i);
//            if(res)
//                return true;
//            else{
                list.remove(list.size() - 1);
                sum -= coins[i];
//            }
        }

        return false;
    }
}
//[186,419,83,408]
//6249