package xiecheng;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/14
 * @Description
 */
public class Test0004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 3 * n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            for(int j = n + 1; j <= 3 * n; j++){
                System.out.print(".");
            }
            for(int j = 3 * n + 1; j <= 4 * n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 3 * n + 1; i <= 4 * n; i++){
            for(int j = 1; j <= (i - 3 * n); j++){
                System.out.print(".");
            }
            for(int j = (i - 3 * n) + 1; j <= (i - 3 * n) + n; j++){
                System.out.print("*");
            }
            for(int j = (i - 3 * n) + n + 1; j <= 7 * n - i - (n - 1) - 1; j++){
                System.out.print(".");
            }
            for(int j = 7 * n - i - (n - 1); j <= 7 * n - i; j++){
                System.out.print("*");
            }
            for(int j = 7 * n - i + 1; j <= 4 * n; j++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
