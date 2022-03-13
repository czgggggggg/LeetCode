package acmtest;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/13
 * @Description
 */
public class Test04 {
    public static void main(String[] args) {
        int sum;
        int n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            sum = 0;
            n = sc.nextInt();

            if(n == 0)
                break;

            while(n-- > 0){
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
//4 1 2 3 4
//5 1 2 3 4 5
//0

//10
//15