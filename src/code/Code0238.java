package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code0238 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] res1 = productExceptSelf(nums1);
        for(int num : res1){
            System.out.print(num + " ");
        }
        System.out.println();
        //24 12 8 6

        int[] nums2 = {-1,1,0,-3,3};
        int[] res2 = productExceptSelf(nums2);
        for(int num : res2){
            System.out.print(num + " ");
        }
        System.out.println();
        //0 0 9 0 0

        int[] nums3 = {1,2};
        int[] res3 = productExceptSelf(nums3);
        for(int num : res3){
            System.out.print(num + " ");
        }
        System.out.println();
        //2 1
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] product_left = new int[n];
        int[] product_right = new int[n];
        product_left[0] = 1;
        product_right[n - 1] = 1;

        for(int i = 1; i < n; i++){
            product_left[i] = product_left[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--){
            product_right[i] = product_right[i + 1] * nums[i + 1];
        }

        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = product_left[i] * product_right[i];
        }

        return res;
    }
}
