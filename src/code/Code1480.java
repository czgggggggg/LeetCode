package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code1480 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] res1 = runningSum(nums1);
        for(int res : res1)
            System.out.print(res + " ");
        System.out.println();
        //1 3 6 10

        int[] nums2 = {1,1,1,1,1};
        int[] res2 = runningSum(nums2);
        for(int res : res2)
            System.out.print(res + " ");
        System.out.println();
        //1 2 3 4 5

        int[] nums3 = {3,1,2,10,1};
        int[] res3 = runningSum(nums3);
        for(int res : res3)
            System.out.print(res + " ");
        System.out.println();
        //3 4 6 16 17

        int[] nums4 = {0};
        int[] res4 = runningSum(nums4);
        for(int res : res4)
            System.out.print(res + " ");
        System.out.println();
        //0
    }

    //v0.2 优化
    public static int[] runningSum(int[] nums) {
        int n = nums.length;

        for(int i = 1; i < n; i++){
            nums[i] += nums[i - 1];
        }

        return nums;
    }

    //v0.1
//    public static int[] runningSum(int[] nums) {
//        int n = nums.length;
//        int sum = 0;
//
//        for(int i = 0; i < n; i++){
//            sum += nums[i];
//            nums[i] = sum;
//        }
//
//        return nums;
//    }
}
