package xiecheng;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/24
 * @Description
 */
public class Test0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        x *= 10;
        while(x % 7 != 0){
            x++;
        }
        System.out.println(x);
    }
}
//1
//14 21 ...

//701
//7014 ...

//1000000000
//10000000003 ...

//900000000
//9000000002 ...

//2147483647