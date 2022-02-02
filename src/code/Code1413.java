package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code1413 {
    public static void main(String[] args) {
        int[] nums1 = {-3,2,-3,4,2};
        System.out.println(minStartValue(nums1));//5
        int[] nums2 = {1,2};
        System.out.println(minStartValue(nums2));//1
        int[] nums3 = {1,-2,-3};
        System.out.println(minStartValue(nums3));//5
        int[] nums4 = {100};
        System.out.println(minStartValue(nums4));//1
        int[] nums5 = {-100};
        System.out.println(minStartValue(nums5));//101
    }
    public static int minStartValue(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum < min){
                min = sum;
            }
        }

        if(1 - min <= 0)
            return 1;
        return 1 - min;
    }
}
