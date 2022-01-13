package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/13
 * @Description
 */
public class Code1827 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1};
        System.out.println(minOperations(nums1));//3
        int[] nums2 = {1,5,2,4,1};
        System.out.println(minOperations(nums2));//14
        int[] nums3 = {8};
        System.out.println(minOperations(nums3));//0

        int[] nums4 = {1,2,3,4,5,6,7,8,9};
        System.out.println(minOperations(nums4));
        //0
    }
    public static int minOperations(int[] nums) {
        if(nums.length == 1)
            return 0;

        int res = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                res += (nums[i - 1] - nums[i] + 1);
                nums[i] = nums[i - 1] + 1;
            }
        }

        return res;
    }
}
