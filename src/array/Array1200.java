package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/9/5
 * @Description
 */
public class Array1200 {
    public static void main(String[] args) {
        int[] arr1 = {4,2,1,3};//4,2,1,3    //1,3,6,10,15   //3,8,-10,23,19,-4,-14,27
        List<List<Integer>> lists = minimumAbsDifference(arr1);
        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                Integer next1 = iterator1.next();
                System.out.print(next1 + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] - arr[i] < min){
                min = arr[i + 1] - arr[i];
            }
        }

        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] - arr[i] == min){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i  + 1]);
                lists.add(list);
            }
        }

        return lists;
    }
}
