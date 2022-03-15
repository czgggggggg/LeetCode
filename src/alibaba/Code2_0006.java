package alibaba;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/14
 * @Description
 */
public class Code2_0006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int tmp1 = 0, tmp2 = 0;
        //----------------------------//
        int[] arr2 = new int[n];
        int count = 0;
        for(int i = 0; i < n/2; i++){
            arr2[count++] = arr[i];
            arr2[count++] = arr[n - 1 - i];
        }
        if(n % 2 == 1)
            arr2[count] = arr[n/2];

        for(int i = 1; i < n; i++){
            tmp1 += Math.abs(arr2[i] - arr2[i - 1]);
        }
        tmp1 += Math.abs(arr2[0] - arr2[n - 1]);
        //----------------------------//
        int[] arr3 = new int[n];
        count = 0;
        for(int i = 0; i < n/2; i++){
            arr3[count++] = arr[n - 1 - i];
            arr3[count++] = arr[i];
        }
        if(n % 2 == 1)
            arr3[count] = arr[n/2];

        for(int i = 1; i < n; i++){
            tmp2 += Math.abs(arr3[i] - arr3[i - 1]);
        }
        tmp2 += Math.abs(arr3[0] - arr3[n - 1]);
        //----------------------------//

        if(tmp1 >= tmp2){
            System.out.println(tmp1);
            for(int i = 0; i< n; i++)
                System.out.print(arr2[i] + " ");
            System.out.println();
        }else{
            System.out.println(tmp2);
            for(int i = 0; i< n; i++)
                System.out.print(arr3[i] + " ");
        }

    }
}
