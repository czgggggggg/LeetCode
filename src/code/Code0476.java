package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/22
 * @Description
 */
public class Code0476 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));//2
        System.out.println(findComplement(1));//0
        System.out.println(findComplement(15));//0
        System.out.println(findComplement(10));//5
    }
    public static int findComplement(int num) {
        //num = 0 不用处理
        int tmp1 = num;
        int tmp2 = 0;
        int r = 1;
        while(num != 0){
            num /= 2;
            tmp2 += r;
            r *= 2;
        }

        return tmp1 ^ tmp2;
    }
}
