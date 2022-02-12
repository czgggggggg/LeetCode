package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/2/12
 * @Description
 */
public class Code1394 {
    public static void main(String[] args) {
        int[] arr1 = {2,2,3,4};
        System.out.println(findLucky(arr1));//2

        int[] arr2 = {1,2,2,3,3,3};
        System.out.println(findLucky(arr2));//3

        int[] arr3 = {2,2,2,3,3};
        System.out.println(findLucky(arr3));//-1

        int[] arr4 = {5};
        System.out.println(findLucky(arr4));//-1

        int[] arr5 = {7,7,7,7,7,7,7};
        System.out.println(findLucky(arr5));//7

    }
    public static int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(!map.keySet().contains(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        Integer num;
        Integer count;
        int max = -1;
        while(iterator.hasNext()){
            num = iterator.next();
            count = map.get(num);
            if(count == num){
                if(max < num){
                    max = num;
                }
            }
        }

        return max;
    }
}
