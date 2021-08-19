package math.math61_70;

/**
 * @Author czgggggggg
 * @Date 2021/8/19
 * @Description
 */
public class Math69 {
    public static void main(String[] args) {
        System.out.println("0--" + mySqrt(0));
        System.out.println("1--" + mySqrt(1));
        System.out.println("2--" + mySqrt(2));
        System.out.println("3--" + mySqrt(3));
        System.out.println("4--" + mySqrt(4));
        System.out.println("5--" + mySqrt(5));
        System.out.println("6--" + mySqrt(6));
        System.out.println("7--" + mySqrt(7));
        System.out.println("8--" + mySqrt(8));
        System.out.println("9--" + mySqrt(9));
        System.out.println("10--" + mySqrt(10));
        System.out.println("24--" + mySqrt(24));
        System.out.println("25--" + mySqrt(25));
        System.out.println("99--" + mySqrt(99));
        System.out.println("100--" + mySqrt(100));
        System.out.println("101--" + mySqrt(101));
        System.out.println("2147395599--" + mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        int low = 0;
        int high = x;
//        int mid = (low + high) / 2;
        int mid = low + (high - low) / 2;  //小心溢出
        while(mid != low){
            if((long)mid * mid > x){  //小心溢出
                high = mid - 1;
            }
            else{
                low = mid;
            }
//            mid = (low + high) / 2;
            mid = low + (high - low) / 2;  //小心溢出
        }
        if(low * low <= x && (low + 1) * (low + 1) > x){
            return low;
        }
        else{
            return low + 1;
        }
    }
}
//[0,9] 4*4>9
//[0,3] 1*1<9
//[1,3] 2*2<9
//[2,3] 2*2<9  2 -> 3

//[0,8] 4*4>8
//[0,3] 1*1<8
//[1,3] 2*2<8
//[2,3] 2*2<8  (low+high)/2==low   2 -> 2
//[2,3]
