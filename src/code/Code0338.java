package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/22
 * @Description
 */
public class Code0338 {
    public static void main(String[] args) {
        int[] res = countBits(5);
        for(int num : res)
            System.out.print(num + " ");
        System.out.println();//0 1 1 2 1 2
    }

    public static int[] countBits(int n) {
        int[] res = new int[n + 1];

        for(int i = 0; i <= n; i++){
            res[i] = hammingWeight(i);
        }

        return res;
    }

    //Code0191的代码
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
