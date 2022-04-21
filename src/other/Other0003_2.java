package other;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/4/17
 * @Description
 */
public class Other0003_2 {
    public static void main(String[] args) {
//        int[] arr = {6,9,3,2,7,8,4,1,0,5};//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//        int[] arr = {9,6,8,7,0,1,10,4,2};
        int[] arr = {5,8,6,8,4,4,6,4,5};
        int n = arr.length;
        quickSort(arr,0,n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            dealPivot(arr, left, right);
            int pivot = right - 1;

            int i = left;
            int j = pivot;
            while(true){
                while(arr[++i] < arr[pivot]){

                }
                while(j > left && arr[--j] > arr[pivot]){

                }
                if(i < j){
                    swap(arr,i,j);
                }else{
                    break;
                }
            }

            if(i < pivot){
                swap(arr, i, pivot);
            }
            quickSort(arr,left,i-1);
            quickSort(arr,i+1,right);
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
