package array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/8/30
 * @Description
 */
public class Array1122 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};//2 2 2 1 4 3 3 9 6 7 19
        int[] arr2 = {2,1,4,3,9,6};
//        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19,13,15,14};//2 2 2 1 4 3 3 9 6 7 13 14 15 19
//        int[] arr2 = {2,1,4,3,9,6};
        int[] result = relativeSortArray(arr1,arr2);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int count = 0;

        //第一步，arr1在arr2中出现的元素的处理
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr1.length; j++){
                if(arr1[j] == arr2[i]){
                    result[count++] = arr1[j];
                }
            }
        }

        //第二步，arr1在arr2中没有出现的元素的处理
        int tmp = count;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }
        for(int i = 0; i < arr1.length; i++){
            if(!set.contains(arr1[i])){
                result[count++] = arr1[i];
            }
        }
        Arrays.sort(result,tmp,result.length);

        return result;
    }
}
