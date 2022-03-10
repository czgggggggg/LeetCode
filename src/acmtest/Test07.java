package acmtest;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/8
 * @Description
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true){
            sum += sc.nextInt();

            if(sc.hasNextLine()){
                System.out.println(sum);
                sum = 0;
            }
        }
    }
}
