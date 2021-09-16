package math.math61_70;

/**
 * @Author czgggggggg
 * @Date 2021/9/16
 * @Description
 */
public class Math0263 {
    public static void main(String[] args) {
        System.out.println(isUgly(6));
        System.out.println(isUgly(8));
        System.out.println(isUgly(14));
        System.out.println(isUgly(1));

        System.out.println(isUgly(1));
        System.out.println(isUgly(2));
        System.out.println(isUgly(3));
        System.out.println(isUgly(4));
        System.out.println(isUgly(5));
        System.out.println(isUgly(6));
        System.out.println(isUgly(7));
        System.out.println(isUgly(8));
        System.out.println(isUgly(9));
        System.out.println(isUgly(10));
    }
    public static boolean isUgly(int n) {
        if(n <= 0)
            return false;

        while(n != 1){
            if(n % 2 == 0)
                n /= 2;
            else if(n % 3 == 0)
                n /= 3;
            else if(n % 5 == 0)
                n /= 5;
            else
                return false;
        }
        return true;
    }
}
