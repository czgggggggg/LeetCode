package wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/27
 * @Description
 */
public class Test0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        if(n == 1)
            System.out.println(0);
        else if(n == 2){
            int a = str.charAt(0) - 96;
            int b = str.charAt(1) - 96;
            if(a == b || a - 1 == b || b - 1 == a){
                System.out.println(a + b);
            }else
                System.out.println(0);
        }
        else{
            int[] dp = new int[n];
            Arrays.fill(dp,0);
            int a = str.charAt(0) - 96;
            int b = str.charAt(1) - 96;
            if(a == b || a - 1 == b || b - 1 == a)
                dp[1] = a + b;

            for(int i = 2; i < n; i++){
                a = str.charAt(i - 1) - 96;
                b = str.charAt(i) - 96;
                int score = 0;
                if(a == b || a - 1 == b || b - 1 == a)
                    score = a + b;

                dp[i] = Math.max(dp[i - 1], dp[i - 2] + score);
            }
            System.out.println(dp[n - 1]);
        }
    }
}
//abdbb
//7 = 1+2+2+2

//abdbb
//-- --
//7 = 1+2+2+2

//abcde
// ----
//14 = 2+3+4+5
//abczde
// -- --
//14 = 2+3+4+5

//aa
//2
//ab
//3
//ba
//3
//ac
//0