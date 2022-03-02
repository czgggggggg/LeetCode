package alibaba;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/2
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        while (sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
