package xiecheng;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/24
 * @Description
 */
public class Test0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        char ch;

        ch = '0';
        int sum1 = 0;//代价
        for(int i = 0; i < n; i++){
            if(ch != str.charAt(i)){
                sum1 += (i + 1);
            }
            if(ch == '0')
                ch = '1';
            else
                ch = '0';
        }

        ch = '1';
        int sum2 = 0;//代价
        for(int i = 0; i < n; i++){
            if(ch != str.charAt(i)){
                sum2 += (i + 1);
            }
            if(ch == '0')
                ch = '1';
            else
                ch = '0';
        }

        System.out.println(sum1 + "---" + sum2);//8
        System.out.println(Math.min(sum1, sum2));//7
    }
}
