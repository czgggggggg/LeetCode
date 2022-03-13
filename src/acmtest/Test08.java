package acmtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/13
 * @Description
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n其实不需要
        sc.nextLine();
        String s = sc.nextLine();
        String[] strs = s.split(" ");
        Arrays.sort(strs);
        for(int i = 0; i < strs.length; i++){
            System.out.print(strs[i] + " ");//
        }
    }
}
