package other;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Other0003_4 {
    public static void main(String[] args) {
        int[] nums = {4,6,8,4,6,4,5,1,9,8,9};
//        int[] nums = {6,5,4,3,2,1};
        int n = nums.length;
        quickSort(nums, 0, n - 1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quickSort(int[] nums, int left, int right){
        if(left < right){
            dealPivot(nums, left, right);
            int pivot = right - 1;
            int i = left + 1;
            int j = pivot - 1;
            while(true){
                while(i < pivot && nums[i] < nums[pivot])
                    i++;
                while(j > left && nums[j] > nums[pivot])
                    j--;
                if(i < j)
                    swap(nums, i, j);
                else
                    break;
            }
            if(i < pivot){
                swap(nums, i, pivot);
            }
            quickSort(nums,left,i - 1);
            quickSort(nums,i + 1, right);
        }
    }
    public static void dealPivot(int[] nums, int left, int right){
        int mid = (left + right) / 2;

        if(nums[left] > nums[mid])
            swap(nums,left,mid);
        if(nums[left] > nums[right])
            swap(nums,left,right);
        if(nums[mid] > nums[right])
            swap(nums, mid, right);

        swap(nums, mid, right - 1);

    }
    public static void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
