package math;

/**
 * @Author czgggggggg
 * @Date 2021/9/16
 * @Description
 */
public class Math0258 {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(111));
        System.out.println(addDigits(1));
    }
    public static int addDigits(int num) {
        int tmp;
        while(num > 9){
            tmp = 0;
            while(num != 0){
                tmp += (num % 10);
                num /= 10;
            }
            num = tmp;
        }

        return num;
    }
}
