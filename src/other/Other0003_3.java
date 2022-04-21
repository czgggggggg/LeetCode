package other;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/4/20
 * @Description
 */
public class Other0003_3 {
    public static void main(String[] args) {
//        int[] arr = {6,5,4,3,2,1};
//        int[] arr = {6,8,3,5,4,4,8,3,2,1,1};
        int[] arr = {4,6,8,4,6,4,5,1,9,8,9};
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] arr, int left, int right){
        if(left < right){
            dealPivot(arr, left, right);
            int pivot = right - 1;
            int i = left + 1;
            int j = pivot - 1;
            while(true){
                while(i < pivot && arr[i] < arr[pivot])
                    i++;
                while(j > left && arr[j] > arr[pivot])
                    j--;
                if(i < j)
                    swap(arr, i, j);
                else
                    break;
            }
            if(i < pivot)
                swap(arr, i, pivot);
            quicksort(arr, left, i - 1);
            quicksort(arr, i + 1, right);
        }
    }
    public static void dealPivot(int[] arr, int left, int right){
        int mid = (left + right) / 2;

        if(arr[left] > arr[mid])
            swap(arr, left, mid);
        if(arr[left] > arr[right])
            swap(arr, left, right);
        if(arr[mid] > arr[right])
            swap(arr, mid, right);

        swap(arr, mid, right - 1);
    }
    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
