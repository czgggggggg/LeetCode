package math;

/**
 * @Author czgggggggg
 * @Date 2021/9/17
 * @Description
 */
public class Math0342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(0));
        System.out.println(isPowerOfFour(1));
        System.out.println(isPowerOfFour(2));
        System.out.println(isPowerOfFour(3));
        System.out.println(isPowerOfFour(4));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(6));
        System.out.println(isPowerOfFour(7));
        System.out.println(isPowerOfFour(8));
        System.out.println(isPowerOfFour(9));
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(32));
        System.out.println(isPowerOfFour(64));
    }
    public static boolean isPowerOfFour(int n) {
        if(n == 0 || n == 2 || n == 3)
            return false;
        while (n != 1){
            if(n % 4 != 0)
                return false;
            n /= 4;
        }
        return true;
    }
}