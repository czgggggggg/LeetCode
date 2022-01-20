package code;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2022/1/20
 * @Description
 */
public class Code2053 {
    public static void main(String[] args) {
        String[] arr1 = {"d","b","c","b","c","a"};
        System.out.println(kthDistinct(arr1,2));
        String[] arr2 = {"aaa","aa","a"};
        System.out.println(kthDistinct(arr2,1));
        String[] arr3 = {"a","b","a"};
        System.out.println(kthDistinct(arr3,3));
        String[] arr4 = {"a"};
        System.out.println(kthDistinct(arr4,1));
    }
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String str : arr){
            if(!map.keySet().contains(str)){
                map.put(str,1);
            }else{
                map.put(str, map.get(str) + 1);
            }
        }

        int count = 0;
        String res = "";

        for(String str : arr){
            if(map.get(str) == 1){
                count++;
                if(count == k){
                    res = str;
                    break;
                }
            }
        }

        return res;
    }
}
