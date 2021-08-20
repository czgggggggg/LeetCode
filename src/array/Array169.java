package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array169 {
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
        for(int i = 1; i < nums.length; i++){ //第一次提交错误的地方
            if(nums[i] != tmp){  //第一次提交错误的地方
                count--;
                if(count == -1){
                    tmp = nums[i];
                    count = 1;
                }
            }else{
                count++;  //第二次提交错误的地方
            }
        }
        return tmp;
    }
}
//[2,2,1,1,1,2,2]

//[1,1,3,1,3,2,2]  //要注意题目说 假设数组是非空的，并且给定的数组总是存在多数元素。 //如果没有这个前提，上面的方法得到的结果将会是错误的。
//[2,3,2,3,2,3,2,3,2,3,1,1,1]

//[1,2,1,3,1,4,1,5,1,6,2,2,2] -> 2//但是不满足存在多数元素的条件
//[1,2,1,3,1,4,1,5,1,6,2,2,2,1,1,1,1]

//[1,2,3,4,5,6,7,8,9,9,9] -> 9////但是不满足存在多数元素的条件
//