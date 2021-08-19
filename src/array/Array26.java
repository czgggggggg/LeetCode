package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/19
 * @Description
 */
public class Array26 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums2));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 1)
            return nums.length;
        int a = 0, b = 0;
        while(b + 1 <= nums.length - 1){
            if(nums[b] != nums[b + 1]){
                nums[a] = nums[b];
                a++;
            }
            b++;
        }
        //数组的最后一个元素要单独处理
        nums[a] = nums[b];
        return a + 1;
    }
}
// [0,0,1,1,1,2,2,3,3,4]
// [0,1,2,3]
// [0,0,1,1,1,2,2,3,3,4,4]
// [0,1,2,3]
// [2,3]
// [2]
// [2,2]
// []