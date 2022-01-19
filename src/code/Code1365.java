package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/1/19
 * @Description
 */
public class Code1365 {
    public static void main(String[] args) {
//        int[] nums = {8,1,2,2,3};//4 0 1 1 3
//        int[] nums = {6,5,4,8};//2 1 0 3
//        int[] nums = {7,7,7,7};//0 0 0 0
        int[] nums = {0,0};//0 0
        int[] count = smallerNumbersThanCurrent(nums);
        for(int res : count)
            System.out.print(res + " ");
        System.out.println();
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        Arrays.fill(count,0);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j && nums[i] > nums[j]){
                    count[i]++;
                }
            }
        }

        return count;
    }
}
