package code;

/**
 * @Author czgggggggg
 * @Date 2021/12/16
 * @Description
 */
public class Code0045 {
    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        System.out.println(jump(nums1));//2
        int[] nums2 = {2,3,0,1,4};
        System.out.println(jump(nums2));//2
        int[] nums3 = {3,5,0,1,1,1,2,1,0};
        System.out.println(jump(nums3));//3
        int[] nums4 = {1,1,1,1,1};
        System.out.println(jump(nums4));//4
        int[] nums5 = {2,1,2,1,1};
        System.out.println(jump(nums5));//2

        int[] nums6 = {0};
        System.out.println(jump(nums6));//0
        int[] nums7 = {1};
        System.out.println(jump(nums7));//0

        //第一次提交未通过的样例
        int[] nums8 = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        System.out.println(jump(nums8));//2
    }
    public static int jump(int[] nums) {
        int min_index = 0;//
        int min_steps = 0;//
        int max_finished_index = -1;
        while(min_index < nums.length - 1){
            if(max_finished_index == min_index - 1){
                min_index = min_index + nums[min_index];
                min_steps++;
                max_finished_index++;
                int max = 0;
                for(int i = max_finished_index + 1; i <= min_index; i++){//第一次提交错误的判断：i < min_index
                    if(i + nums[i] > max){
//                        max = i + nums[i];
                        //第一次提交错误的地方，没有考虑i + nums[i]可能超过nums.length - 1
                        if(i + nums[i] > nums.length - 1)
                            max = nums.length - 1;
                        else
                            max = i + nums[i];
                    }
                }
                max_finished_index = min_index - 1;
                if(max > min_index){
                    min_index = max;
                    min_steps++;
                }
            }
        }
        return min_steps;
    }
}
