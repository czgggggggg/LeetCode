package acmtest;

import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/13
 * @Description
 */
public class Test11 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s;
//        while(sc.hasNextLine()){
//            s = sc.nextLine();
//            String[] split = s.split(" ");
//            System.out.println(Integer.valueOf(split[0]) + Integer.valueOf(split[1]));
//        }

//        Scanner sc = new Scanner(System.in);
//        int a, b;
//        while(sc.hasNextInt()){
//            a = sc.nextInt();
//            if(sc.hasNextInt()){
//                b = sc.nextInt();
//                System.out.println(a + b);
//            }else{
//                break;
//            }
//        }

        Scanner sc = new Scanner(System.in);
        String s;
        while(sc.hasNextLine()){
            s = sc.nextLine();
            String[] split = s.split(" ");
            System.out.println(Long.valueOf(split[0]) + Long.valueOf(split[1]));
        }
    }
}
