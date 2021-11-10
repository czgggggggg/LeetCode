package random;

/**
 * @Author czgggggggg
 * @Date 2021/11/10
 * @Description
 */
public class Random0509 {
    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }
//    public static int fib(int n) {
//        if(n == 0)
//            return 0;
//        if(n == 1)
//            return 1;
//        return fib(n - 1) + fib(n - 2);
//    }
    public static int fib(int n) {
        if(n < 2)
            return n;
        int p = 0,q = 1,r = 1;
        for(int i = 2; i <= n; i++){
            r = p + q;
            p = q;
            q = r;
        }
        return r;
    }
    //0 1 1 2 3 5 7
}
