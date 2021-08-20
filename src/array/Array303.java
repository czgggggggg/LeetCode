package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array303 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0,2));
        System.out.println(numArray.sumRange(2,5));
        System.out.println(numArray.sumRange(0,5));
    }
    static class NumArray {
        int[] nums;
        public NumArray(int[] nums) {
            this.nums = nums;
        }
        public int sumRange(int left, int right) {
            int sum = 0;
            for(int i = left; i <= right; i++)
                sum += nums[i];
            return sum;
        }
    }
}
