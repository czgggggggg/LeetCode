package other;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/3/26
 * @Description
 */
public class Other0002 {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        //归并排序
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    //归并排序
    public static void sort(int[] arr){
        int n = arr.length;
        int[] tmp = new int[n];//辅助数组，在这里创建可以避免递归中重复创建。
        sort(arr, 0, n - 1, tmp);
    }

    //分
    public static void sort(int[] arr, int left, int right, int[] tmp){
        if(left < right){//边界
            //先分
            int mid = (left  + right) / 2;
            sort(arr, left, mid, tmp);
            sort(arr, mid + 1, right, tmp);
            //后和
            merge(arr,left,mid,right,tmp);
        }
    }

    //治
    public static void merge(int[] arr, int left, int mid, int right, int[] tmp){
        int i = left;//左指针
        int j = mid + 1;//右指针
        int t = 0;//辅助数组指针

        //合并
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j])//此处的等号体现了归并排序是稳定排序
                tmp[t++] = arr[i++];
            else
                tmp[t++] = arr[j++];
        }
        while(i <= mid)
            tmp[t++] = arr[i++];
        while(j <= right)
            tmp[t++] = arr[j++];

        //将tmp数组中的元素转移到arr中
        t = 0;
        while(left <= right)
            arr[left++] = tmp[t++];
    }
}
