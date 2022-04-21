//package keep;
//
///**
// * @Author czgggggggg
// * @Date 2022/4/21
// * @Description
// */
//public class Code0001_1_2 {
//    static final int mod = 1000000000 + 7;
//
//    public static void main(String[] args) {
//
//    }
//
//    public static int numWays(int n, int s) {
//        if(n == s){
//            return 0;
//        }else if(n < s){
//            return numWays(n);
//        }else{//n > s
////            //正常的方式跳到s上有多少种方式
////            int s_count = numWays(s);
////            if(s == 1){//n > 1
////                return numWays(n - 1);
////            }else if(s == 2){//n > 2
////                return numWays(n - 3);
////            }
//
//        }
//    }
//
//    public static int numWays(int n) {
//        if(n == 0)
//            return 1;
//        if(n == 1)
//            return 1;
//        if(n == 2)
//            return 2;
//        if(n == 3)
//            return 4;
//
//        int[] dp = new int[n];
//        dp[0] = 1;
//        dp[1] = 2;
//        dp[2] = 4;
//        for(int i = 3; i < n; i++){
//            dp[i] = (dp[i - 3] + dp[i - 2] + dp[i - 1]) % mod;
//        }
//
//        return dp[n - 1];
//    }
//}
