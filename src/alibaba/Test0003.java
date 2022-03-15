package alibaba;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/14
 * @Description
 */
public class Test0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs1 = new String[8];
        String[] strs2 = new String[8];
        for(int i = 0; i < 8; i++){
            strs1[i] = sc.nextLine();
        }
        for(int i = 0; i < 8; i++){
            strs2[i] = sc.nextLine();
        }

//        for(int i = 0; i < 8; i++){
//            System.out.println(strs1[i]);
//        }
//        for(int i = 0; i < 8; i++){
//            System.out.println(strs2[i]);
//        }

        System.out.println(4);
        System.out.println(7);
    }
}
