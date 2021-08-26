package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/26
 * @Description
 */
public class Array896 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3};
        System.out.println(isMonotonic(nums1));
        int[] nums2 = {6,5,4,4};
        System.out.println(isMonotonic(nums2));
        int[] nums3 = {1,3,2};
        System.out.println(isMonotonic(nums3));
        int[] nums4 = {1,2,4,5};
        System.out.println(isMonotonic(nums4));
        int[] nums5 = {1,1,1};
        System.out.println(isMonotonic(nums5));
        int[] nums6 = {1};
        System.out.println(isMonotonic(nums6));
    }
    public static boolean isMonotonic(int[] nums) {
        if(nums.length == 1)
            return true;
        int tag1 = 0;
        int tag2 = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]){//纯单调递增
                tag1 = 1;
                if(tag2 == 1)//之前递减过，再递增就不满足递增的条件
                    return false;

            }else if(nums[i] > nums[i + 1]){//纯单调递减
                tag2 = 1;
                if(tag1 == 1)//之前递增过，再递减就不满足递减的条件
                    return false;
            }
            //nums[i] == nums[i + 1]的情况不用管，跳过
        }
        return true;
    }
}
