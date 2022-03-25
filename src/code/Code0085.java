package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/3/25
 * @Description
 */
public class Code0085 {
    public static void main(String[] args) {
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix));
    }
    public static int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] right = new int[m][n];
        int[][] down = new int[m][n];

        //right方向
        for(int i = 0; i < m; i++){
            int j = 0;
            int k = j + 1;
            while(j < n && k < n + 1){
                if(k == n){
                    while(j < k){
                        right[i][j] = k;
                        j++;
                    }
                    break;
                }else{
                    if(matrix[i][k] == '1')
                        k++;
                    else{//matrix[i][k] == '0'
                        while(j < k){
                            right[i][j] = k;
                            j++;
                        }
                        k++;
                    }
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(right[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");

        //down方向
        for(int j = 0; j < n; j++){
            int i = 0;
            int k = i + 1;
            while(i < m && k < m + 1){
                if(k == m){
                    while(i < k){
                        down[i][j] = k;
                        i++;
                    }
                    break;
                }else{
                    if(matrix[k][j] == '1')
                        k++;
                    else{//matrix[k][j] == '0'
                        while(i < k){
                            down[i][j] = k;
                            i++;
                        }
                        k++;
                    }
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(down[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");

        //找最大面积
        int max = Integer.MIN_VALUE;
        int area;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '1'){
                    area = (right[i][j] - j) * (down[i][j] - i);
                    System.out.print(area + " ");
                    max = Math.max(max, area);
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        return max;
    }
}
