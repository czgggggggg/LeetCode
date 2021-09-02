package array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2021/9/2
 * @Description
 */
public class Array1331 {
    public static void main(String[] args) {
        int[] arr1 = {40,10,20,30};
        int[] result1 = arrayRankTransform(arr1);
        for(int x : result1)
            System.out.print(x + " ");
        System.out.println();
        int[] arr2 = {100,100,100};
        int[] result2 = arrayRankTransform(arr2);
        for(int x : result2)
            System.out.print(x + " ");
        System.out.println();
        int[] arr3 = {37,12,28,9,100,56,80,5,12};
        int[] result3 = arrayRankTransform(arr3);
        for(int x : result3)
            System.out.print(x + " ");
        System.out.println();
        int[] arr4 = {};
        int[] result4 = arrayRankTransform(arr4);
        for(int x : result4)
            System.out.print(x + " ");
        System.out.println();
        int[] arr5 = {1};
        int[] result5 = arrayRankTransform(arr5);
        for(int x : result5)
            System.out.print(x + " ");
    }
    public static int[] arrayRankTransform(int[] arr) {
        int[] tmpArr = new int[arr.length];
        for(int i = 0; i < tmpArr.length; i++)
            tmpArr[i] = arr[i];
        Arrays.sort(tmpArr);

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int count = 1;
        for(int i = 0; i < tmpArr.length; i++){
            if(hashMap.get(tmpArr[i]) == null){
                hashMap.put(tmpArr[i], count++);
            }
        }

        for(int i = 0; i < arr.length; i++){
            tmpArr[i] = hashMap.get(arr[i]);
        }

        return tmpArr;
    }
}
