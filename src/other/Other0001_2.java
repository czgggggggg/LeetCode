package other;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/4/17
 * @Description
 */
public class Other0001_2 {
    public static void main(String[] args) {
//        int[] arr = {9,6,8,7,0,1,10,4,2};
        int[] arr = {5,8,6,8,4,4,6,4,5};
        int n = arr.length;

        int start = n / 2 - 1;
        //构建大顶堆
        for(int i = start; i >= 0; i--){
            heap(arr, n, i);
        }

        int tmp;
        for(int i = n - 1; i > 0; i--){
            tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heap(arr, i, 0);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void heap(int[] arr, int size, int index){
        int leftNode = 2 * index + 1;
        int rightNode = 2 * index + 2;

        int max = index;
        if(leftNode < size && arr[leftNode] > arr[max])
            max = leftNode;
        if(rightNode < size && arr[rightNode] > arr[max])
            max = rightNode;

        if(max != index){
            int tmp = arr[max];
            arr[max] = arr[index];
            arr[index] = tmp;
            heap(arr, size, max);
        }

//        int max = index;
//        int tmp;
//        if(rightNode < size && arr[leftNode] > arr[rightNode]){
//            if(arr[max] < arr[leftNode]){
//                tmp = arr[max];
//                arr[max] = arr[leftNode];
//                arr[leftNode] = tmp;
//                max = leftNode;
//            }
//        }else{
//            if(rightNode < size && arr[max] < arr[rightNode]){
//                tmp = arr[max];
//                arr[max] = arr[rightNode];
//                arr[rightNode] = tmp;
//                max = rightNode;
//            }
//        }
//
//        if(max != index){
//            heap(arr,size,max);
//        }
    }
}
