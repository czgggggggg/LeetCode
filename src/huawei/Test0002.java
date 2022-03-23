package huawei;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/23
 * @Description
 */
public class Test0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder tlv = new StringBuilder(str);
        int n = sc.nextInt();
        int[] tag = new int[n];
        int[][] res = new int[n][2];

        int i = 0;
        while(i < n){
            tag[i] = sc.nextInt();
            i++;
        }

        int cur = 0;
        i = 0;
        int cur_tag;
        int cur_len;
        while(i < n){
             cur_tag = Integer.parseInt(tlv.substring(cur,cur+2),16);
             cur += 2;
             //匹配成功
             if(cur_tag == tag[i]){
                 cur_len = Integer.parseInt(tlv.substring(cur,cur+2),16);
                 cur += 2;

                 res[i][0] = cur_len;
                 res[i][1] = cur / 2;
                 cur += cur_len * 2;
             }else{//匹配失败
                 res[i][0] = 0;
                 res[i][1] = 0;
                 cur_len = Integer.parseInt(tlv.substring(cur,cur+2),16);
                 cur += 2;
                 cur += cur_len * 2;
             }
             i++;
        }

        for(int t = 0; t < n - 1; t++)
            System.out.println(res[t][0] + " " + res[t][1]);
        if(cur == tlv.length())
            System.out.println(res[n - 1][0] + " " + res[n - 1][1]);
    }
}
//0F04ABABABAB
//1
//15
//4 2

//0F04ABABABAB1001FF
//2
//15
//17
//4 2
//0 0

//0F04ABABABAB0F04ABABABAB
//2
//15
//15
//4 2
//4 8

//0F04ABABABAB0F04ABABABAB0F04ABABABAB
//3
//15
//17
//15
//4 2
//0 0
//4 14

//0F04ABABABAB0F04ABABABAB0F04ABABABA
//3
//15
//17
//15
//4 2
//0 0