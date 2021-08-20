package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int tmp;
        if(nums.length >= 2){
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] == 0) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] != 0) {
//                        System.out.println(nums[i] + "---" + nums[j]);
                            tmp = nums[i];
                            nums[i] = nums[j];
                            nums[j] = tmp;
                            break;//注意此处要退出。
                        }
                    }
                }
            }
//            for(int i = 0; i < nums.length ;i++){
//                System.out.print(nums[i] + " ");
//            }
//            System.out.println();
        }
    }
}
//思路：双指针
//[0,1,0,3,12]
//[1,0,0,3,12]
//[1,3,0,0,12]
//[1,3,12,0,0]
