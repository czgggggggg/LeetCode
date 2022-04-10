package pdd;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/10
 * @Description
 */
public class Code0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] temp = new int[m + 1];

        for(int i = 0; i < n; i++){
            int index = sc.nextInt();
            temp[index] = -1;
        }
        for(int i = m; i > 0; i--){
            if(temp[i] == 0){
                temp[i] = i;
            }else{
                if(i < m){
                    temp[i] = temp[i + 1];
                }
            }
        }

        int q = sc.nextInt();
        int[] res = new int[q];
        for(int i = 0; i < q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            res[i] = temp[l] <= r ? temp[l] : -1;
        }
//        for(int i = 1; i < m; i++){
//            System.out.print(temp[i] + " ");
//        }
//        System.out.println();
        for(int i = 0; i < q; i++){
            System.out.println(res[i]);
        }
    }
}
//5 10
//3 4 6 7 8
//3
//1 1
//3 7
//6 8

//1
//5
//-1