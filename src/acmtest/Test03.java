package acmtest;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/8
 * @Description
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(a + b);
        }
    }
}
