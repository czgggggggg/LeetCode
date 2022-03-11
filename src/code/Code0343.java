package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/11
 * @Description
 */
public class Code0343 {
    public static void main(String[] args) {
        System.out.println(integerBreak(2));
        System.out.println(integerBreak(10));
    }
    public static int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;//1 -> 1
        dp[2] = 1;//2 -> 1
        if(n == 2)
            return dp[2];

        if(n == 3)
            dp[3] = 2;

        int max;
        int tmp1,tmp2;
        for(int i = 4; i <= n; i++){
            //当前针对的数字是 i
            max = 0;
            for(int j = 1; ; j++){
                //将 i 拆分为 j 和 i - j
                if(j <= i - j){//避免重复计算
                    tmp1 = dp[j] >= j ? dp[j] : j;
                    tmp2 = dp[i - j] > i - j ? dp[i - j] : i - j;
//                    max = Math.max(max, dp[j] * dp[i - j]);
                    max = Math.max(max, tmp1 * tmp2);
                }else
                    break;
            }
            dp[i] = max;
        }

        return dp[n];
    }
}
//1 -> 1  //无实际意义
//2 -> 1  //1 * 1
//3 -> 2  //1 * 2
//4 -> 4  //2 * 2 > 1 * 3
//5 -> 6  //2 * 3
//6 -> 6
//7 -> 12 //3 * 4

//10 -> dp[3] * dp[7] = (2|3) * (7|12) = 36
