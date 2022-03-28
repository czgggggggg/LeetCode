package wangyi;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/27
 * @Description
 */
public class Test0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, x ,y;
        a = sc.nextInt();
        b = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int count1 = 0;
        int count0 = 0;
        int count2 = 0;
        int count3 = 0;
        while(a > 0 || b > 0){
            if(x > y){
                if(a / x >= 1){
                    a -= x;
                    count1++;
                }
                if(b / x >= 1){
                    b -= x;
                    count1++;
                }
                //
                if(a / x == 0 && b / x == 0){
                    count2 = 0;
                    count3 = 0;
                    if(a > 0)
                        count2++;
                    if(b > 0)
                        count2++;
                    while(a > 0 || b > 0){
                        a -= y;
                        b -= y;
                        count3++;
                    }
                }
                count1 += Math.min(count2, count3);
            }
            else{
                while(a > 0 || b > 0){
                    a -= y;
                    b -= y;
                    count1++;
                }
            }
        }


        System.out.println(count1);
    }
}
//9 9 5 9
//1
//9 9 5 3
//4 4
//4


//------------------
//5 2 3 1
//3

//2 2
//1 1
//1 1

//2 2
//-1 2
//-1 -1

//5 2 3 2
//2

//2 2
//0 0

//9 9 5 1
//4

//4 9
//4 4
//-1 4
//-1 -1

//9 9 5 4
//3

//4 9
//4 4
//0 0


//5 9 5 1
//3

//0 9
//0 4
//0 -1