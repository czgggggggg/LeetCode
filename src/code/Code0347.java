package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/1/6
 * @Description
 */
public class Code0347 {
    public static void main(String[] args) {
//        int[] nums = {1,1,1,2,2,3};
//        int[] res = topKFrequent(nums, 2);//1 2
//        int[] nums = {1};
//        int[] res = topKFrequent(nums, 1);//1
        int[] nums = {3,3,4,4,3,3,6,6,6,6,5,5,5,1,2,2};
        int[] res = topKFrequent(nums, 3);//3 6 5
        for(int num : res)
            System.out.print(num + " ");
        System.out.println();
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num;
        for(int i = 0; i < nums.length; i++){
            num = nums[i];
            if(!map.keySet().contains(num))
                map.put(num,1);
            else
                map.put(num, map.get(num) + 1);
        }

        //将map.keySet()转化为ArrayList
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        Iterator<Integer> iterator = list.iterator();
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = iterator.next();
        }

        return res;
    }
}
