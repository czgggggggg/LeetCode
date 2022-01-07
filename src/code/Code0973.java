package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/1/7
 * @Description
 */
public class Code0973 {
    public static void main(String[] args) {
//        int[][] points = {{1,3},{-2,2}};
//        int[][] res = kClosest(points, 1);
//        for(int i = 0; i < res.length; i++){
//            System.out.println(res[i][0] + " " + res[i][1]);
//        }

        int[][] points = {{3,3},{5,-1},{-2,4}};
        int[][] res = kClosest(points, 2);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int[] tmp = new int[n];
        for(int i = 0; i < n; i++)
            tmp[i] = points[i][0] * points[i][0] + points[i][1] * points[i][1];//没有必要开平方
        Arrays.sort(tmp);

        int num = tmp[k - 1];

        int[][] res = new int[k][2];
        k = 0;
        for(int i = 0; i < n; i++){
            if(points[i][0] * points[i][0] + points[i][1] * points[i][1] <= num){
                res[k][0] = points[i][0];
                res[k][1] = points[i][1];
                k++;
            }
        }

        return res;
    }
}
