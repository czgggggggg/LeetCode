package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/3
 * @Description
 */
public class Code1009 {
    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));//2
        System.out.println(bitwiseComplement(7));//0
        System.out.println(bitwiseComplement(10));//5
    }
    public static int bitwiseComplement(int n) {
        int highbit = 0;
        for (int i = 1; i <= 30; ++i) {
            if (n >= 1 << i) {
                highbit = i;
            } else {
                break;
            }
        }
        int mask = highbit == 30 ? 0x7fffffff : (1 << (highbit + 1)) - 1;
        return n ^ mask;
    }
}
