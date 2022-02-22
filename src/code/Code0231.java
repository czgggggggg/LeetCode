package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/22
 * @Description
 */
public class Code0231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));//false
        System.out.println(isPowerOfTwo(1));//true
        System.out.println(isPowerOfTwo(2));//true
        System.out.println(isPowerOfTwo(3));//false
        System.out.println(isPowerOfTwo(4));//true
        System.out.println(isPowerOfTwo(5));//false
        System.out.println(isPowerOfTwo(6));//false
        System.out.println(isPowerOfTwo(7));//false
        System.out.println(isPowerOfTwo(8));//true
        System.out.println(isPowerOfTwo(9));//false
        System.out.println(isPowerOfTwo(16));//true
        System.out.println(isPowerOfTwo(32));//true
        System.out.println(isPowerOfTwo(-2147483648));//false
    }
    public static boolean isPowerOfTwo(int n) {//等价于n对应的二进制数是否只包含一个1
        if(n < 0)//第一次提交错误的地方，少了对n为负数的情况的判断。
            return false;

        int count = 0;//1的个数

        for(int i = 1; i <= 32; i++){
            if(n == 0)
                break;
            if((n & 1) == 1)
               count++;
            n = n >> 1;
        }

        return count == 1;
    }
}
//执行结果：解答错误
//通过测试用例：1107 / 1108
//输入：-2147483648
//输出：true
//预期结果：false