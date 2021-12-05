package code;

/**
 * @Author czgggggggg
 * @Date 2021/12/5
 * @Description
 */
public class Code0055 {
    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        System.out.println(canJump(nums1));
        int[] nums2 = {3,2,1,0,4};
        System.out.println(canJump(nums2));
        int[] nums3 = {2,0};
        System.out.println(canJump(nums3));
        int[] nums4 = {0,2,3};
        System.out.println(canJump(nums4));
        int[] nums5 = {1,2,3};
        System.out.println(canJump(nums5));

    }
    //采用的是广度优先遍历的思路
    public static boolean canJump(int[] nums) {
        boolean[] canReach = new boolean[nums.length];
        canReach[0] = true;
        for(int i = 0; i < nums.length - 1; i++){
            if(!canReach[i])//Error002//起点本身不可达，则退出
                break;
            for(int t = 1; t <= nums[i] ; t++){
                if(i + t >= nums.length)//Error001//防止数组越界//{2,0}  //Error003
                    break;
                canReach[i + t] = true;
            }
            if(canReach[nums.length - 1])//可以提前结束
                return true;
        }
        return canReach[nums.length - 1];
    }
}
