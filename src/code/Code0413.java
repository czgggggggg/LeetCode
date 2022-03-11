package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/11
 * @Description
 */
public class Code0413 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        System.out.println(numberOfArithmeticSlices(nums1));//3
        int[] nums2 = {1};
        System.out.println(numberOfArithmeticSlices(nums2));//0
        int[] nums3 = {1,3,5,6,8,10,12,13,14};
        System.out.println(numberOfArithmeticSlices(nums3));//5
        int[] nums4 = {1,3,5,6,8,10,12,13};
        System.out.println(numberOfArithmeticSlices(nums4));//4
    }

    public static int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n < 3)
            return 0;

        int res = 0;
        int count = 2;
        int diff = nums[1] - nums[0];
        for(int i = 2; i < n; i++){
            if(nums[i] - nums[i - 1] == diff){
                count++;
            }else{
                res += func(count);
                //重新初始化diff和count
                diff = nums[i] - nums[i - 1];
                count = 2;
            }
        }
        if(nums[n - 1] - nums[n - 2] == nums[n - 2] - nums[n - 3]){
            res += func(count);
        }

        return res;
    }

    public static int func(int n){
        int count = 0;
        for(int i = 1; i <= n - 2; i++){
            count += i;
        }
        return count;
    }
}
