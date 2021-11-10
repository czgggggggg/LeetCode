package random;

/**
 * @Author czgggggggg
 * @Date 2021/11/10
 * @Description
 */
public class Random1137 {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
        System.out.println(tribonacci(25));
    }
    public static int tribonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        int o = 0, p = 1, q = 1, r = 2;
        for(int i = 3; i <= n; i++){
            r = o + p + q;
            o = p;
            p = q;
            q = r;
        }
        return r;
    }
}
