package acmtest;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/8
 * @Description
 */
public class Test01 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
