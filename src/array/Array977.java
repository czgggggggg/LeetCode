package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/27
 * @Description
 */
public class Array977 {
    public static void main(String[] args) {
        int[] nums1 = {-4,-1,0,3,10};
        int[] ans1 = sortedSquares(nums1);
        for(int i = 0; i < ans1.length; i++){
            System.out.print(ans1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {-7,-3,2,3,11};
        int[] ans2 = sortedSquares(nums2);
        for(int i = 0; i < ans2.length; i++){
            System.out.print(ans2[i] + " ");
        }
        System.out.println();

        int[] nums3 = {-7};
        int[] ans3 = sortedSquares(nums3);
        for(int i = 0; i < ans3.length; i++){
            System.out.print(ans3[i] + " ");
        }
        System.out.println();
    }
    public static int[] sortedSquares(int[] nums) {
        int min_abs = Integer.MAX_VALUE;
        int min_index = -1;
        //遍历一次数组，找到绝对值最小的数在数组中的下标
        for(int i = 0; i < nums.length; i++){
            if(min_abs > Math.abs(nums[i])){
                min_abs = Math.abs(nums[i]);
                min_index = i;
            }
        }

        int[] ans = new int[nums.length];
        ans[0] = nums[min_index] * nums[min_index];
        int count = 1;
        int i = min_index - 1;
        int j = min_index + 1;
        while(i >= 0 && j <= nums.length - 1){
            if(Math.abs(nums[i]) <= Math.abs(nums[j])){
                ans[count++] = nums[i] * nums[i];
                i--;
            }else if(Math.abs(nums[i]) > Math.abs(nums[j])){
                ans[count++] = nums[j] * nums[j];
                j++;
            }
        }
        while(i >= 0){
            ans[count++] = nums[i] * nums[i];
            i--;
        }
        while(j <= nums.length - 1){
            ans[count++] = nums[j] * nums[j];
            j++;
        }

        return ans;
    }
}
