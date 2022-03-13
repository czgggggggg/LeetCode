package acmtest;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/13
 * @Description
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum;
        while(sc.hasNextInt()){
            n = sc.nextInt();
            sum = 0;
            while(n-- > 0){
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
//4 1 2 3 4
//5 1 2 3 4 5

//10
//15