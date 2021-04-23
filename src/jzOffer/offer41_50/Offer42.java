package jzOffer.offer41_50;
/**
* @Author czgggggggg
* @Date 2021/2/21
* @Description 连续子数组的最大和
* @Since version-1.0
*/
public class Offer42 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            System.out.println(maxSum);
        }
        return maxSum;
    }
}
