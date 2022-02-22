package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/22
 * @Description
 */
public class Code0191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(0));//0
        System.out.println(hammingWeight(1));//1
        System.out.println(hammingWeight(2));//1
        System.out.println(hammingWeight(3));//2
        System.out.println(hammingWeight(-1));//32

        System.out.println(hammingWeight(11));//3
        System.out.println(hammingWeight(128));//1
        System.out.println(hammingWeight(-3));//31
    }
    public static int hammingWeight(int n) {
        int count = 0;//1的个数

        for(int i = 1; i <= 32; i++){
            if(n == 0)
                break;
            if((n & 1) == 1)
                count++;
            n = n >> 1;//负数补1并无影响，因为循环最多进行32次，即最多进行32次右移
        }

        return count;
    }
}
