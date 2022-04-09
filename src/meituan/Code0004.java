package meituan;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/9
 * @Description
 */
public class Code0004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        res += n * (n - 1) * (n - 2) * (n - 3);
        res += n * (n - 1) * (n - 2) * 2;
        res += n * (n - 1);
        System.out.println(res % 1000000007);
    }
}
