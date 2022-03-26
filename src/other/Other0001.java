package other;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/3/26
 * @Description
 */
public class Other0001 {
    public static void main(String[] args) {
        int[] arr = {9,6,8,7,0,1,10,4,2};//[0, 1, 2, 4, 6, 7, 8, 9, 10]
        int n = arr.length;

        //开始位置：下标最大的非叶子节点的下标
        int start = n / 2 - 1;

        //构建最大堆
        for(int i = start; i >= 0; i--){
            //调整堆结构
            heap(arr, n, i);
        }

        for(int i = n - 1; i > 0; i--){
            //交换堆顶元素和末尾元素
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            //调整堆结构
            heap(arr, i, 0);
        }

        System.out.println(Arrays.toString(arr));
    }

    //调整堆结构
    public static void heap(int[] arr , int size, int index){
        //左孩子
        int leftNode = 2 * index + 1;
        //右孩子
        int rightNode = 2 * index + 2;

        //最大值的下标初始为index
        int max = index;

        //寻找最大值所在的节点
        if(leftNode < size && arr[leftNode] > arr[max])
            max = leftNode;
        if(rightNode < size && arr[rightNode] > arr[max])
            max = rightNode;

        //交换节点
        if(max != index){
            int tmp = arr[index];
            arr[index] = arr[max];
            arr[max] = tmp;
            //继续向下调整堆结构（因为上面的节点交换可能再次导致下层堆结构改变）
            heap(arr, size, max);
        }
    }
}
