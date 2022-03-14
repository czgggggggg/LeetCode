//package alibaba;
//
//import java.util.Scanner;
//
///**
// * @Author czgggggggg
// * @Date 2022/3/14
// * @Description
// */
//public class Code2_0004 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        //暴力解法
//        int tmp;
//        boolean tag = true;
//        if(a == b ){
//            tag = false;
//            System.out.println(Math.min(A,B) + " " + Math.min(A,B));
//        }else if(a > b){
//            while(B > 0){
//                if((B * a) % b == 0 && (B * a) / b <= A){
//                    System.out.println(((B * a) / b) + " " + B);
//                    tag = false;
//                    break;
//                }
//                B--;
//            }
//        }else{//a < b
//            while(A > 0){
//                if((A * b) % a == 0 && (A * b) / a <= B){
//                    System.out.println(A + " " + ((A * b) / a));
//                    tag = false;
//                    break;
//                }
//                A--;
//            }
//        }
//
//        if(tag)
//            System.out.println(0 + " " + 0);
//    }
//
//    //返回a、b的最大公约数
////    public static int func(int a, int b){
////        int r;
////        if(a == b)
////            return 1;
////        else if(a > b){
////            while()
////        }
////    }
//}
//
//
////1000 500 3 1
////999 333
//
////500 1000 1 3
////333 999
//
////1000 500 4 2
////1000 500
//
////1 1 2 1
////0 0