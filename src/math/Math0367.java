package math;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/17
 * @Description
 */
public class Math0367 {
    public static void main(String[] args) {
//        System.out.println(345 * 345);
//        System.out.println(Math.sqrt(119025));
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(2));
        System.out.println(isPerfectSquare(3));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(5));
        System.out.println(isPerfectSquare(14));
        System.out.println(isPerfectSquare(16));
    }
    public static boolean isPerfectSquare(int num) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 1; i < 46341; i++){
            hashSet.add(i * i);
        }
        if(hashSet.contains(num))
            return true;
        return false;
    }
}
