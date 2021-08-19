package math.math61_70;

/**
 * @Author czgggggggg
 * @Date 2021/8/19
 * @Description
 */
public class Math70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int a = 1, b = 2;
        int tmp;
        n -= 2;
        while(n-- != 0){
            tmp = b;
            b = a + b;
            a = tmp;
        }
        return b;

//        if(n == 1)
//            return 1;
//        if(n == 2)
//            return 2;
//        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
