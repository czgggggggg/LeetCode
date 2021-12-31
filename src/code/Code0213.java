package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/12/20
 * @Description
 */
public class Code0213 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        System.out.println(rob(nums1));//4
        int[] nums2 = {2,7,9,3,1};
        System.out.println(rob(nums2));//11
        int[] nums3 = {1,2,1,2};
        System.out.println(rob(nums3));//4
        int[] nums4 = {2,3,2};
        System.out.println(rob(nums4));//3
        int[] nums5 = {1,2,3,1};
        System.out.println(rob(nums5));//4
        int[] nums6 = {2,1,1,2};
        System.out.println(rob(nums6));//3
    }
    public static int rob(int[] nums) {
        int len = nums.length;
        if(len == 1)
            return nums[0];
        if(len == 2)
            return Math.max(nums[0],nums[1]);
        if(len == 3){//增加改边界条件
            return Math.max(nums[0],Math.max(nums[1],nums[2]));
        }

        //增加辅助数组
        boolean[] hasFirst = new boolean[len];//记录是否包含第一个元素的数组
        Arrays.fill(hasFirst,false);
        hasFirst[0] = true;
        if(nums[0] > nums[1])
            hasFirst[1] = true;
        if(nums[0] > nums[1] && nums[0] > nums[2])
            hasFirst[2] = true;

        boolean hasLast = false;//记录是否包含最后一个元素的数组

        int[] max_Sum = new int[len];
        max_Sum[0] = nums[0];
        max_Sum[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < len; i++){
            max_Sum[i] = Math.max(max_Sum[i - 1], max_Sum[i - 2] + nums[i]);
            //
            if(max_Sum[i - 1] >= max_Sum[i - 2] + nums[i])
                hasFirst[i] = hasFirst[i - 1];
            if(max_Sum[i - 1] < max_Sum[i - 2] + nums[i])
                hasFirst[i] = hasFirst[i - 2];
        }
        if(max_Sum[len - 2] < max_Sum[len - 3] + nums[len - 1])
            hasLast = true;

        //注意不要忘了hasLast==true这个条件，因为max_Sum[len - 1]不一定包含最后一个元素。
        if(hasFirst[len - 1] && hasLast){
            System.out.println("!!!");
            return max_Sum[len - 1] - Math.min(nums[0],nums[len - 1]);
        }

        return max_Sum[len - 1];
    }

}
