package array;

/**
 * @Author czgggggggg
 * @Date 2022/4/15
 * @Description
 */
public class Array169_2 {
    public static void main(String[] args) {
        int[] nums1 = {3,2,3};
        System.out.println(majorityElement(nums1));
        int[] nums2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums2));
        int[] nums3 = {6,5,5};
        System.out.println(majorityElement(nums3));
        int[] nums4 = {6,6,6,7,7};
        System.out.println(majorityElement(nums4));
    }
    public static int majorityElement(int[] nums) {
        int tmp = nums[0];
        int count = 1;
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(count != 0){
                if(tmp == nums[i])
                    count++;
                else
                    count--;
            }else{
                tmp = nums[i];
                count++;
            }
        }

        return tmp;
    }
}
