//package math;
//
///**
// * @Author czgggggggg
// * @Date 2021/9/17
// * @Description
// */
//public class Math0326 {
//    public static void main(String[] args) {
//        System.out.println(isPowerOfThree(0));
//        System.out.println(isPowerOfThree(1));
//        System.out.println(isPowerOfThree(2));
//        System.out.println(isPowerOfThree(3));
//        System.out.println(isPowerOfThree(4));
//        System.out.println(isPowerOfThree(5));
//        System.out.println(isPowerOfThree(6));
//        System.out.println(isPowerOfThree(7));
//
//        System.out.println(isPowerOfThree(27));
//        System.out.println(isPowerOfThree(9));
//        System.out.println(isPowerOfThree(45));
//    }
//    public static boolean isPowerOfThree(int n) {
//        if(n == 0 || n == 2)
//            return false;
//        while (n != 1){
//            if(n % 3 != 0)
//                return false;
//            n /= 3;
//        }
//        return true;
//    }
//}
