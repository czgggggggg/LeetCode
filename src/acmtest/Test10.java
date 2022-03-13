package acmtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/13
 * @Description
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            String[] strs = s.split(",");
            Arrays.sort(strs);
            for (int i = 0; i < strs.length - 1; i++) {
                System.out.print(strs[i] + ",");
            }
            System.out.println(strs[strs.length - 1]);
        }
    }
}
//a,c,bb
//f,dddd
//nowcoder

//a,bb,c
//dddd,f
//nowcoder