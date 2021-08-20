package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array122 {
    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices1));
        int[] prices2 = {1,2,3,4,5};
        System.out.println(maxProfit(prices2));
        int[] prices3 = {7,6,4,3,1};
        System.out.println(maxProfit(prices3));
    }
    public static int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1])
                sum += (prices[i] - prices[i - 1]);
        }
        return sum;
    }
}
//[7,1,5,3,6,4] -> [1,5]、[3,6] -> 4+3=7
//[7]
//[7,1]
//[7,1,5]
//[7,1,5,3]
//[7,1,5,3,6]
//[7,1,5,3,6,4]
//---------------------------------------
//7  --
//6          --
//5      --
//4            --
//3        --
//2
//1    --
//0
//---------------------------------------


