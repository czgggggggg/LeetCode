package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array674 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,4,7};//3
        System.out.println(findLengthOfLCIS(nums1));
        int[] nums2 = {2,2,2,2,2};//1
        System.out.println(findLengthOfLCIS(nums2));
        int[] nums3 = {};//0
        System.out.println(findLengthOfLCIS(nums3));
        int[] nums4 = {1};//1
        System.out.println(findLengthOfLCIS(nums4));
        int[] nums5 = {1,2,5,3,4,5,6,7,6,5};//5
        System.out.println(findLengthOfLCIS(nums5));
        int[] nums6 = {1,2,3};//3
        System.out.println(findLengthOfLCIS(nums6));
    }
    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;
        int final_max = 1;
        int current_max = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                current_max++;
            }
            else{
                final_max = Math.max(final_max,current_max);
                current_max = 1;
            }
        }
        final_max = Math.max(final_max,current_max);
        return final_max;
    }
}
//nums = [1,3,5,4,7]  [1,3,5]  3
//[1,2,5,3,4,5,6,7,6,5]  [3,4,5,6,7]  5