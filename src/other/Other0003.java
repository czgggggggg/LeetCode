package other;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/3/26
 * @Description
 */
public class Other0003 {
    public static void main(String[] args) {
        int[] arr = {6,9,3,2,7,8,4,1,0,5};//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    //快速排序
    public static void quickSort(int[] arr, int left, int right){
        if(left < right){//边界条件
            //先处理枢纽点
            dealPivot(arr,left,right);
            int pivot = right - 1;

            int i = left;
            int j = right - 1;
            while(true){
                while(arr[++i] < arr[pivot]){

                }
                while(j > left && arr[--j] > arr[pivot]){

                }
                if(i < j)
                    swap(arr, i, j);
                else
                    break;
            }

            if(i < pivot){
                swap(arr, i, pivot);
            }

            //注意此时i是枢纽点
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }

    //处理枢纽点
    public static void dealPivot(int[] arr, int left, int right){
        int mid = (left + right) / 2;
        //确保arr[left] <= arr[mid] <= arr[right]
        if(arr[left] > arr[mid])
            swap(arr, left, mid);
        if(arr[left] > arr[right])
            swap(arr, left, right);
        if(arr[mid] > arr[right])
            swap(arr, mid, right);

        //将枢纽点至于当前处理序列的倒数第二个位置
        swap(arr, mid, right - 1);
    }

    //元素交换
    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
