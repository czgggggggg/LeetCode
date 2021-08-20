package array;
import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array121 {
    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices1));
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices2));
    }
    public static int maxProfit(int[] prices) {
        int[] arr = new int[prices.length];
        arr[0] = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > min){
                arr[i] = prices[i] - min;
            }else{
                min = prices[i];
                arr[i] = 0;
            }
        }
//        System.out.println("---test---");
//        for(int i = 0; i < prices.length; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println("\n---test---");
        Arrays.sort(arr);
        return arr[prices.length - 1];
    }
}
//[7,1,5,3,6,4]
//[7]           ->  0
//[7,1]         ->  1 - min([7])          if(1 - min([7])) < 0 -> 0
//[7,1,5]       ->  5 - min([7,1])
//[7,1,5,3]     ->  3 - min([7,1,5])
//[7,1,5,3,6]   ->  6 - min([7,1,5,3])
//[7,1,5,3,6,4] ->  4 - min([7,1,5,3,6])
