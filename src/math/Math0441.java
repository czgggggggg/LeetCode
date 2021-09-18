package math;

/**
 * @Author czgggggggg
 * @Date 2021/9/17
 * @Description
 */
public class Math0441 {
    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);//2147483647
//        int n = 5;
//        System.out.println(Math.sqrt(2*n + (double)1/4) - (double)3/2);
//        System.out.println(Math.sqrt(2*n + (double)1/4) - (double)1/2);

//        System.out.println(arrangeCoins(5));
//        System.out.println(arrangeCoins(8));
//        System.out.println(arrangeCoins(5049));//99
//        System.out.println(arrangeCoins(5050));//100
//        System.out.println(arrangeCoins(5051));//100
//        System.out.println(arrangeCoins(0));
//        System.out.println(arrangeCoins(1));
//        System.out.println(arrangeCoins(2));
//        System.out.println(arrangeCoins(3));
        System.out.println(arrangeCoins(1804289383));
    }
    public static int arrangeCoins(int n) {
        return (int)(Math.sqrt((long)2*n + (double)1/4) - (double)1/2);
    }
}
//1+2+3+...+m = (m)*(m + 1)/2