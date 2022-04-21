package other;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/4/16
 * @Description
 */
public class Other0002_2 {
    static int n;
    static int[] tmp;

    public static void main(String[] args) {
        int[] nums = {4,2,7,4,9,8,6,6};
        sort(nums);
        for(int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }

    public static void sort(int[] nums){
        n = nums.length;
        tmp = new int[n];
        sort(nums, 0, n - 1);
    }

    public static void sort(int[] nums, int left, int right){
        if(left >= right)
            return;

        int mid = (left + right) / 2;
        sort(nums, left, mid);
        sort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    public static void merge(int[] nums, int left, int mid, int right){
        int t = left;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right){
            if(nums[i] <= nums[j]){
                tmp[t++] = nums[i++];
            }else{
                tmp[t++] = nums[j++];
            }
        }
        while(i <= mid)
            tmp[t++] = nums[i++];
        while(j <= right)
            tmp[t++] = nums[j++];

        for(int k = left; k <= right; k++){
            nums[k] = tmp[k];
        }
    }

}
