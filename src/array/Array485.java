package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array485 {
    public static void main(String[] args) {
//        int[] nums = {1,1,0,1,1,1};//3
//        int[] nums = {1,1,0,1,1,1,0};//3
//        int[] nums = {0,1,1,1,0,1,0};//3
//        int[] nums = {1,1,1,1,0,1,0};//4
        int[] nums = {0};//4

        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = 0;//第一次提交错在这里，不应该是int max = Integer.MIN_VALUE;

        if(nums[0] == 1)//注意
            sum++;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 1){//[0,1
                sum++;
            }
            else if(nums[i] == 0 && nums[i - 1] == 1){//[0,1,0  //注意
                max = Math.max(max, sum);
                sum = 0;
            }
            else{//[0,1,0,0
                continue;
            }
        }

        if(nums[nums.length - 1] == 1){
            max = Math.max(max, sum);
        }

        return max;
    }
}
