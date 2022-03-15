package alibaba;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/14
 * @Description
 */
public class Test0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //初始化
        int[][] score = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                score[i][j] = 0;
        }

        int min, max;
        //水平方向计分
        for(int i = 0; i < n; i++){
            min = m;
            max = -1;
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 1){
                    min = Math.min(min, j);
                    max = Math.max(max, j);
                }
            }
            if(max != -1){
                for(int j = 0; j < max; j++){
                    if(arr[i][j] == 0){
                        score[i][j] += 1;
                    }
                }
            }
            if(min != m){
                for(int j = min + 1; j < m; j++){
                    if(arr[i][j] == 0){
                        score[i][j] += 1;
                    }
                }
            }
        }


        //垂直方向计分
        for(int j = 0; j < m; j++){
            min = n;
            max = -1;
            for(int i = 0; i < n; i++){
                if(arr[i][j] == 1){
                    min = Math.min(min, i);
                    max = Math.max(max, i);
                }
            }
            if(max != -1){
                for(int i = 0; i < max; i++){
                    if(arr[i][j] == 0){
                        score[i][j] += 1;
                    }
                }
            }
            if(min != n){
                for(int i = min + 1; i < n; i++){
                    if(arr[i][j] == 0){
                        score[i][j] += 1;
                    }
                }
            }
        }

        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                res += score[i][j];
            }
        }

        System.out.println(res);
    }
}
//2 4
//0 1 0 0
//1 0 1 0
//9

//3 3
//1 1 1
//1 0 1
//1 1 1
//4

//3 4
//1 1 1 1
//1 0 0 1
//1 1 1 1
//8

//3 4
//1 1 1 1
//1 0 0 1
//1 1 0 1
//10

//3 4
//0 0 0 0
//0 1 1 0
//0 0 0 0
//