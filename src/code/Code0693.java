package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/2
 * @Description
 */
public class Code0693 {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
        System.out.println(hasAlternatingBits(7));
        System.out.println(hasAlternatingBits(11));
    }
    public static boolean hasAlternatingBits(int n) {
        while (n > 0) {
            int cur = n & 1;
            int next = (n >> 1) & 1;
            if (cur == next) return false;
            n >>= 1;
        }
        return true;
    }
}
