package array;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/8/23
 * @Description
 */
public class Array561 {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};  //4
//        int[] nums = {6,2,6,5,1,2};  //9
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }
}
//1,2,3,4,6,9,14,50,51,100