package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Code0070_2 {
    public static void main(String[] args) {
        System.out.println(func(2));
        System.out.println(func(3));
    }

    //动态规划
    public static int func(int n){
        if(n == 1)
            return 1;

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++){
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n - 1];
    }

    //递归会超时
//    public static int func(int n){
//        if(n == 1)
//            return 1;
//
//        if(n == 2)
//            return 2;
//
//        return func(n - 1) + func(n - 2);
//    }
}
