package acmtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/13
 * @Description
 */
public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();

            String[] strs = s.split(" ");
            Arrays.sort(strs);
            for(String str : strs){
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
//a c bb
//f dddd
//nowcoder

//a bb c
//dddd f
//nowcoder