package array;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array350 {
    public static void main(String[] args) {
        int[] num1 = {4,9,5,4};
        int[] num2 = {9,4,9,8,4};
        int[] num3 = intersect(num1, num2);
        for(int x: num3){
            System.out.print(x + " ");
        }
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int i = 0; i < nums1.length; i++){
            if(map1.keySet().contains(nums1[i])){
                map1.put(nums1[i],map1.get(nums1[i]) + 1);
            }else{
                map1.put(nums1[i],1);
            }
        }

        for(int i = 0; i < nums2.length; i++){
            if(map2.keySet().contains(nums2[i])){
                map2.put(nums2[i],map2.get(nums2[i]) + 1);
            }else{
                map2.put(nums2[i],1);
            }
        }

        int count = 0;
        for(int x : map1.keySet()){
            if(map2.keySet().contains(x)){
                count += Math.min(map1.get(x), map2.get(x));
            }
        }
        int[] results = new int[count];
        int i = 0;
        for(int x : map1.keySet()){
            if(map2.keySet().contains(x)){
                count = Math.min(map1.get(x), map2.get(x));
                for(int t = i; t < i + count; t++){
                    results[t] = x;
                }
                i += count;
            }
        }

        return results;
    }
}
