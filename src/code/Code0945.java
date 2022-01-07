package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/1/7
 * @Description
 */
public class Code0945 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2};
        System.out.println(minIncrementForUnique(nums1));//1
        int[] nums2 = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums2));//6
    }
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int pre = nums[0];
        int move = 0;
        for(int i = 1; i < nums.length; i++){
//            if(pre == nums[i]){
//                nums[i] = pre + 1;
//                move++;
//            }else if(pre > nums[i]){
//                nums[i] = pre + 1;
//                move += (pre - nums[i] + 1);
//            }
            //代码简化
            if(pre >= nums[i]){
                move += (pre - nums[i] + 1);
                nums[i] = pre + 1;
            }
            //pre < nums[i]不做处理
            pre = nums[i];
        }
        return move;
    }
}
//3,2,1,2,1,7
//1,1,2,2,3,7
//1,2,3,4,5,7