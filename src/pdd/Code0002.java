package pdd;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/10
 * @Description
 */
public class Code0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("size: " + size);
        int[] res = new int[size];

        for(int t = 0; t < size; t++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();
            char[][] arr = new char[m][n];
            int res_step = -1;//最终最少要走的步数
            for(int i = 0; i < m; i++){
                String str = sc.nextLine();
                for(int j = 0; j < n; j++){
                    arr[i][j] = str.charAt(j);
                }
            }


            res[t] = res_step;
        }
    }
}
//2
//4 4
//K111
//1111
//1111
//111T
//2 3
//K10
//00T
