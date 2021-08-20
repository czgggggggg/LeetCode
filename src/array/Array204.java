package array;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
        System.out.println(countPrimes(0));
        System.out.println(countPrimes(1));
    }
    public static int countPrimes(int n) {
        if(n <= 2)//0 1 2
            return 0;
        else{
            int[] isPrime = new int[n];
            Arrays.fill(isPrime, 1);
            isPrime[0] = 0;
            isPrime[1] = 0;
            for(int i = 2; i < isPrime.length; i++){
                if(isPrime[i] == 1){
                    if((long)i*i < n){
                        for(int j=i*i; j<n; j+=i){
                            isPrime[j] = 0;
                        }
                    }
                }
            }
            int count = 0;
            for(int i = 0; i < isPrime.length; i++){
                if(isPrime[i] == 1)
                    count++;
            }
            return count;
        }
    }
}
