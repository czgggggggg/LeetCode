package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/11
 * @Description
 */
public class Code1822 {
    public static void main(String[] args) {
        int[] nums1 = {-1,-2,-3,-4,3,2,1};
        System.out.println(arraySign(nums1));
        int[] nums2 = {1,5,0,2,-3};
        System.out.println(arraySign(nums2));
        int[] nums3 = {-1,1,-1,1,-1};
        System.out.println(arraySign(nums3));
    }
    public static int arraySign(int[] nums) {
//        int positiveCount = 0;
        int negativeCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0)
                negativeCount++;
//            else if(nums[i] > 0)
//                positiveCount++;
            else if(nums[i] == 0)
                return 0;
        }

        if(negativeCount % 2 == 0)
            return 1;
        return -1;
    }
}
