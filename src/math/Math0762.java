package math;

/**
 * @Author czgggggggg
 * @Date 2021/9/19
 * @Description
 */
public class Math0762 {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6,10));
        System.out.println(countPrimeSetBits(10,15));
        System.out.println(countPrimeSetBits(990000,1000000));
    }
    public static int countPrimeSetBits(int left, int right) {
        int[] isPrim = {0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0};//2,3,5,7,11,13,17,19  //质数数组标记
        int count;
        int result = 0;
        int tmp;
        for(int i = left; i <= right; i++){
            tmp = i;
            count = 0;
            while(tmp != 0){
                if(tmp % 2 == 1)
                    count++;
                tmp /= 2;
            }
//            System.out.println("test---i---" + i);
//            System.out.println("test---count---" + count);
            if(isPrim[count - 1] == 1)
                result++;
        }
        return result;
    }
}
//10^6 < 2^20 - 1