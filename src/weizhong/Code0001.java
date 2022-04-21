package weizhong;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/20
 * @Description
 */
public class Code0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        long max = 0;
        if(n == 1){
            int diff = arr1[0] - arr2[0];
            if(diff < 0){
                max = 1 - diff;
            }
            System.out.println(max);
        }else{
            long[] arr3 = new long[n];
            arr3[0] = arr1[0] - arr2[0];

            if(arr3[0] < 0){
                max = 1 - arr3[0];
            }

            for(int i = 1; i < n; i++){
                arr3[i] = arr1[i] - arr2[i] + arr3[i - 1];
            }

            for(int i = 0; i < n; i++){
//            System.out.print(arr3[i] + " ");
                if(arr3[i] < 0){
                    long tmp = arr3[i] * (-1);
                    long count;
                    if(tmp % (i + 1) == 0){
                        count = tmp / (i + 1);
                    }else{
                        count = tmp / (i + 1) + 1;
                    }
                    max = Math.max(max, count);
                }
            }
            System.out.println(max);
        }
    }
}
//3
//1 2 3
//2 4 2

//3
//6 5 4
//3 2 1

//2
//1   100
//100 0