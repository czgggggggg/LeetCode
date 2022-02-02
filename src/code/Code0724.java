package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code0724 {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums1));
        //3
        int[] nums2 = {1, 2, 3};
        System.out.println(pivotIndex(nums2));
        //-1
        int[] nums3 = {2, 1, -1};
        System.out.println(pivotIndex(nums3));
        //0
        int[] nums4 = {1};
        System.out.println(pivotIndex(nums4));
        //0
    }
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] left_sums = new int[n];
        int[] rigit_sums = new int[n];

        int left_sum = 0;
        int right_sum = 0;
        for(int i = 0; i < n; i++){
            left_sums[i] = left_sum;
            left_sum += nums[i];
        }
        for(int i = n - 1; i >= 0; i--){
            rigit_sums[i] = right_sum;
            right_sum += nums[i];
        }

        for(int i = 0; i < n; i++){
            if(left_sums[i] == rigit_sums[i])
                return i;
        }

        return -1;
    }
}
