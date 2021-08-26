package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/26
 * @Description
 */
public class Array888 {
    public static void main(String[] args) {
        int[] aliceSizes1 = {1,1};
        int[] bobSizes1 = {2,2};
        int[] ans1 = fairCandySwap(aliceSizes1,bobSizes1);
        System.out.println("[" + ans1[0] + "," + ans1[1] + "]");
        int[] aliceSizes2 = {1,2};
        int[] bobSizes2 = {2,3};
        int[] ans2 = fairCandySwap(aliceSizes2,bobSizes2);
        System.out.println("[" + ans2[0] + "," + ans2[1] + "]");
        int[] aliceSizes3 = {2};
        int[] bobSizes3 = {1,3};
        int[] ans3 = fairCandySwap(aliceSizes3,bobSizes3);
        System.out.println("[" + ans3[0] + "," + ans3[1] + "]");
        int[] aliceSizes4 = {1,2,5};
        int[] bobSizes4 = {2,4};
        int[] ans4 = fairCandySwap(aliceSizes4,bobSizes4);
        System.out.println("[" + ans4[0] + "," + ans4[1] + "]");

    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < aliceSizes.length; i++)
            sum1 += aliceSizes[i];
        for(int i = 0; i < bobSizes.length; i++)
            sum2 += bobSizes[i];
        int num = sum1 - sum2;
        if(num < 0){
            num = -num;
            num /= 2;
            for(int i = 0; i < aliceSizes.length; i++){
                for(int j = 0; j < bobSizes.length; j++){
                    if(bobSizes[j] - aliceSizes[i] == num){
                        return new int[] {aliceSizes[i],bobSizes[j]};
                    }
                }
            }
        }else if(num > 0){
            num /= 2;
            for(int i = 0; i < aliceSizes.length; i++) {
                for (int j = 0; j < bobSizes.length; j++) {
                    if(aliceSizes[i] - bobSizes[j] == num){
                        return new int[] {aliceSizes[i], bobSizes[j]};
                    }
                }
            }
        }
        return new int[]{};//一定不会执行到这里
    }
}
//输入：A = [1,2,5], B = [2,4]
//输出：[5,4]
//