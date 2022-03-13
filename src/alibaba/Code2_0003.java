package alibaba;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/13
 * @Description
 */
public class Code2_0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, time;
        while(t-- > 0){
            n = sc.nextInt();
            int[] weights = new int[n];
            for(int i = 0; i < n; i++){
                weights[i] = sc.nextInt();
            }
            Arrays.sort(weights);
            time = 0;

            //v0.1
//            for(int i = 1; i < n; i++)
//                time += weights[i];
//            if(n == 1){
//                time += weights[0];
//            }else if(n >= 3){
//                time += weights[0] * (n - 2);
//            }

            //v0.2（参考题解）
            while(n >= 4){//一次循环将最重和次重的运送过河
                //方法一
                //0、1过河，1留下（0把船开回来）
                //最重的和次重的同时过河
                //1把船开回来
                //方法二
                //0和最重的过河，0回来，0和次重的过河、0回来
                time += Math.min((weights[1] + weights[0] + weights[n - 1] + weights[1]),
                        (weights[n - 1] + weights[n - 2]) + weights[0] * 2);
                n -= 2;
            }
            if(n == 3){
                time += (weights[0] + weights[1] + weights[2]);
            }else if(n == 2){
                time += weights[1];
            }else if(n == 1){
                time += weights[0];
            }


            System.out.println(time);
        }
    }
}