package wangyi;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/27
 * @Description
 */
public class Test0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int i = 0;

        int even = 2;//偶数
        while(even <= n){
            arr[i++] = even;
            even += 2;
        }

        int odd = 1;//奇数
        while(odd <= n){
            arr[i++] = odd;
            odd += 2;
        }

        for(int t = 0; t < n; t++){
            System.out.print(arr[t] + " ");
        }
    }
}
//4
//2 4 3 1

