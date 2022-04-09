package meituan;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/9
 * @Description
 */
public class Code0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] starts = new int[m];
        int[] ends = new int[m];

        for(int i = 0; i < m; i++){
            starts[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            ends[i] = sc.nextInt();
        }

        int[][] gra = new int[n+1][n+1];

        for(int i = 0; i < m; i++){
            gra[starts[i]][ends[i]] = 1;
            gra[ends[i]][starts[i]] = 1;
        }

        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            System.out.println(gra[u][v] == 1 ? "Yes" : "No");
        }
    }
}
//4 5
//1 2 1 3 1
//2 1 3 2 4
//4
//1 2
//2 4
//2 3
//1 4

//Yes
//No
//Yes
//Yes