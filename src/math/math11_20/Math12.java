package math.math11_20;

/**
 * @Author czgggggggg
 * @Date 2021/6/25
 * @Description 66. 加一
 */
public class Math12 {
    public static void main(String[] args) {
//        int[] digits = {9,8,9,9};//9900
//        int[] digits = {9,9,9,9};//10000
        int[] digits = {1,2,0,8,9,0,9};//1208910
        int[] result = plusOne(digits);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + ",");
        }
        System.out.println();
    }
    public static int[] plusOne(int[] digits) {
        int add = 1;//进位数
        int tmp;
        for(int i = digits.length - 1; i >= 0; i--){
//            System.out.println("digits[i] = " + digits[i]);
            tmp = digits[i] + add;
            digits[i] = tmp % 10;
//            System.out.println("digits[i] = " + digits[i]);
            add = tmp / 10;
//            System.out.println("add = " + add);
        }
        if(add == 1){
            int result[] = new int[digits.length + 1];
            result[0] = 1;
            for(int i = 1; i < result.length - 1; i++){
                result[i] = digits[i - 1];
            }
            return result;
        }else{
            int result[] = new int[digits.length];
            for(int i = 0; i < result.length; i++){
                result[i] = digits[i];
            }
            return result;
        }
    }
}
