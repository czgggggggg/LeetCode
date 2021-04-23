package jzOffer.offer01_10;

/**
* @Author czgggggggg
* @Date 2021/1/17
* @Description 数组中重复的数字
*/
public class Offer03 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};//2
        //int[] nums = {1, 2, 2};//2
        System.out.println(findRepeatNumber(nums));
    }
    public static int findRepeatNumber(int[] nums) {
        int n = nums.length;
        int[] tags = new int[n];
        for(int i = 0; i < n; i++){
            tags[i] = 0;
        }
        for(int i = 0; i < n; i++){
            if(tags[nums[i]] != 0){//此时nums[i]在数组中的个数已经为1，再加一为2，即元素重复
                return nums[i];
            }
            else{
                tags[nums[i]]++;
            }
        }
        return -1;
    }
}
