package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/26
 * @Description
 */
public class Array908 {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int k1 = 0;
        System.out.println(smallestRangeI(nums1,k1));
        int[] nums2 = {0,10};
        int k2 = 2;
        System.out.println(smallestRangeI(nums2,k2));
        int[] nums3 = {1,3,6};
        int k3 = 3;
        System.out.println(smallestRangeI(nums3,k3));
        int[] nums4 = {1,3,100};
        int k4 = 3;
        System.out.println(smallestRangeI(nums4,k4));
    }
    public static int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        }

        int ans;
        if(max - min <= 2 * k)
            ans = 0;
        else
            ans = max - min - 2 * k;
        return ans;
    }
}
