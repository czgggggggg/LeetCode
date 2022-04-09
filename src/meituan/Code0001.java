package meituan;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/9
 * @Description
 */
public class Code0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp;
        int res = 0;

        if(n == 0)
            res++;

        while(n != 0){
            tmp = n % 10;
            n /= 10;
            if(tmp == 0 || tmp == 6 || tmp == 9)
                res++;
            else if(tmp == 8)
                res += 2;
        }
        System.out.println(res);
    }
}
//0 6 9 -> 1
//8 -> 2

//60498 -> 5