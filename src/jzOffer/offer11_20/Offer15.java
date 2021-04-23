package jzOffer.offer11_20;
/**
* @Author czgggggggg
* @Date 2021/2/14
* @Description 二进制中1的个数
* @Since version-1.0
*/
public class Offer15 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(2147483647));
//        System.out.println(hammingWeight(4294967293));
//        System.out.println(hammingWeight(00000000000000000000000000001011));
//        System.out.println(hammingWeight(00000000000000000000000000001011));
//        System.out.println(hammingWeight(11111111111111111111111111111101));
    }

    //003（没有思路，参考题解）
    //这样做的目的是，从低位到高位依次把n中的1删除掉，n被删除掉了几个1，那么n中就包含几个1。
    //n = 10101 , n - 1 = 10100 , n & (n - 1) = 10100
    //n = 10100 , n - 1 = 10011 , n & (n - 1) = 10000
    //n = 10000 , n - 1 = 01111 , n & (n - 1) = 00000
    //示例3的整数过大，但是提交能够通过。
    public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    //002 输入是十进制数，输出的是十进制数对应的二进制数中1的个数。
//    public static int hammingWeight(int n) {
//        int count = 0;
//        while(n != 0){
//            if(n % 2 == 1)
//                count++;
//            n /= 2;
//        }
//        return count;
//    }

    //001
    //输入是长度为 32 的二进制串。但是这种处理方式会造成样例数字超过int类型的范围。
    // you need to treat n as an unsigned value
    //分析：1 10 100
    //      1 / 10 = 0 , 1 % 10 = 1 , 10 / 10 = 1 , 10 % 10 = 0
//    public static int hammingWeight(int n) {
//        int count = 0;//记录二进制数中1的个数
//        while(n != 0){
//            if( n % 10 == 1)
//                count++;
//            n /= 10;
//        }
//        return count;
//    }
}
