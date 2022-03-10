package acmtest;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/8
 * @Description
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int i = 0;
        while (i < n){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            System.out.println(arr[i][0] + arr[i][1]);
            i++;
        }
    }
}

