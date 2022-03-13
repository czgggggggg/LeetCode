package alibaba;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/2
 * @Description
 */
public class Code2_0001 {

    //v0.2...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[][] nums = new int[n][k];
        int[][] diff = new int[n][k - 1];
        for(int i = 0; i < n; i++){
            nums[i][0] = sc.nextInt();
            for(int j = 1; j < k; j++){
                nums[i][j] = sc.nextInt();
                diff[i][j - 1] = nums[i][j] - nums[i][j - 1];
            }
        }

        int count = 0;
        boolean tag;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                tag = true;
                for(int t = 0; t < k - 1; t++){
                    if(diff[i][t] + diff[j][t] != 0){
                        tag = false;
                        break;
                    }
                }
                if(tag)
                    count++;
            }
        }

        System.out.println(count);
    }

    //v0.1 超时，过了3/10的样例
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n, k;
//        n = sc.nextInt();
//        k = sc.nextInt();
//        int[][] nums = new int[n][k];
//        int[][] diff = new int[n][k - 1];
//        for(int i = 0; i < n; i++){
//            nums[i][0] = sc.nextInt();
//            for(int j = 1; j < k; j++){
//                nums[i][j] = sc.nextInt();
//                diff[i][j - 1] = nums[i][j] - nums[i][j - 1];
//            }
//        }
//
//        int count = 0;
//        boolean tag;
//        for(int i = 0; i < n; i++){
//            for(int j = i + 1; j < n; j++){
//                tag = true;
//                for(int t = 0; t < k - 1; t++){
//                    if(diff[i][t] + diff[j][t] != 0){
//                        tag = false;
//                        break;
//                    }
//                }
//                if(tag)
//                    count++;
//            }
//        }
//
//        System.out.println(count);
//    }
}
