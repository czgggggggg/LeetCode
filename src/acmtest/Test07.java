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
        int sum;

        while(sc.hasNextLine()){
            sum = 0;
            String s = sc.nextLine();
            String[] strs = s.split(" ");
            for(String str : strs){
                sum += Integer.valueOf(str);
            }
            System.out.println(sum);
        }
    }
}
//1 2 3
//4 5
//0 0 0 0 0

//6
//9
//0
