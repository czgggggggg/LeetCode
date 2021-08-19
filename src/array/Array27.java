package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/19
 * @Description
 */
public class Array27 {
    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println(removeElement(nums1, val1));
        System.out.println(removeElement(nums2, val2));
    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;
        int a = 0, b = 0;
        while(b <= nums.length - 1){
            if(nums[b] != val){
                nums[a++] = nums[b];
            }
            b++;
        }
        return a;
    }
}
