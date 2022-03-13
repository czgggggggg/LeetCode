package acmtest;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/13
 * @Description
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        int t;
        while(n-- > 0){
            sum = 0;
            t = sc.nextInt();
            while(t-- > 0){
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
//2
//4 1 2 3 4
//5 1 2 3 4 5

//10
//15
