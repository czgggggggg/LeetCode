package weizhong;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/20
 * @Description
 */
public class Code0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String temp = sc.next();
        char x = temp.charAt(0);
        String str = sc.next();

        long res = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = i; j < n; j++){
                if(str.charAt(i) == x){
                    count++;
                    if(count == k){
                        res++;
                    }else if(count > k){
                        break;
                    }
                }
            }
        }

        System.out.println(res);
    }
}
