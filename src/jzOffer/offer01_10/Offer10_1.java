package jzOffer.offer01_10;

/**
* @Author czgggggggg
* @Date 2021/2/9
* @Description 斐波那契数列。
* 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
* 这道题要采用非递归的方式计算.
* 对于这样进行取模的原理我还不是很懂.
*/
public class Offer10_1 {
    public static void main(String[] args) {
//        System.out.println(fib(0));
//        System.out.println(fib(1));
//        System.out.println(fib(2));
//        System.out.println(fib(3));
//        System.out.println(fib(4));
        System.out.println(fib(5));
//        System.out.println(fib(41));
//        System.out.println(fib(42));
//        System.out.println(fib(43));
//        System.out.println(fib(44));
//        System.out.println(fib(45));
//        System.out.println(fib(46));
    }
    public static int fib(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else{
            int var1 = 0;
            int var2 = 1;
            int tmp;
            while(--n != 0){
                tmp = var2;
                var2 = (var1 + var2) % 1000000007;//只需要对var2进行取模运算.
                var1 = tmp;
            }
            return var2;
        }
    }
//    public static int fib(int n) {
//        if(n == 0)
//            return 0;
//        else if(n == 1)
//            return 1;
//        else{
//            //似乎不能用递归处理,应该是递归的深度太深,所以会报java.lang.StackOverflowError异常
//            return fib(n - 1) % 1000000007 + fib(n - 2) % 1000000007;
//        }
//    }
}
