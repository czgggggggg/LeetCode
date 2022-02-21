package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/21
 * @Description
 */
public class Code0461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));//2
        System.out.println(hammingDistance(3,1));//1
        System.out.println(hammingDistance(0,0));//0
        System.out.println(hammingDistance(15,0));//4
        System.out.println(hammingDistance(16,0));//1
    }
    public static int hammingDistance(int x, int y) {
        int res = 0;
        int i, j;

        while(x != 0 || y != 0){
            i = x % 2;
            x /= 2;
            j = y % 2;
            y /= 2;
            if(i != j)
                res++;
        }

        return res;
    }

    //官方题解，移位运算
//    public static int hammingDistance(int x, int y) {
//        int s = x ^ y, ret = 0;
//        while (s != 0) {
//            ret += s & 1;
//            s >>= 1;//>>= 左边得是变量
//        }
//        return ret;
//    }
}
