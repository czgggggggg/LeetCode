package alibaba;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/14
 * @Description
 */
public class Code2_0005 {

    //v0.1 过了8/10样例
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int[] x = new int[n];
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            x[i] = arr[i][0];
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(x);

        int distance = 0;
        for(int i = 0; i < n; i++){
            distance += Math.abs(x[i] - x[n / 2]);
        }

        System.out.println(distance);
    }


    //v0.1 过了6/10样例
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][2];
//        for(int i = 0; i < n; i++){
//            arr[i][0] = sc.nextInt();
//            arr[i][1] = sc.nextInt();
//        }
//
//        int[] left_count = new int[100001];//表示x=i的直线左侧（包含x=i）有left_count[i]个点
//        int[] counts = new int[100001];//x=i处有多少个点
//        Arrays.fill(counts,0);
//
//        for(int i = 0; i < n; i++){
//            counts[arr[i][0]]++;
//        }
//        int count = 0;
//        for(int i = 0; i <= 100000; i++){
//            count += counts[i];
//            left_count[i] = count;
//        }
//
//        int min_distance = Integer.MAX_VALUE;//最小距离和
//        int distance = 0;
//        //初始化，当x=0时的距离和
//        for(int i = 0; i <= 100000; i++){
//            distance += (i * counts[i]);
//        }
//        min_distance = Math.min(min_distance, distance);
//        int x = 0;
////        System.out.println("distance: " + distance);
//
//        //向右移动x=i这条直线
//        for(int i = 1; i <= 100000; i++){
//            distance += (left_count[i] - counts[i]);
//            distance -= (n - left_count[i] + counts[i]);
//            min_distance = Math.min(min_distance,distance);
////            if(min_distance == distance)
////                x = i;
//        }
//
//        System.out.println(min_distance);
////        System.out.println("x: " + x);
//    }
}
//4
//0 0
//0 50
//50 50
//50 0
//100

//2
//0 0
//100 0
//100

//3
//0 0
//100 0
//100 0
//100

//3
//0 0
//7 0
//10 0
//10