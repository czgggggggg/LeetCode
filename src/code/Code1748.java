package code;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/1/25
 * @Description
 */
public class Code1748 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,2};
        System.out.println(sumOfUnique(nums1));
        int[] nums2 = {1,1,1,1,1};
        System.out.println(sumOfUnique(nums2));
        int[] nums3 = {1,2,3,4,5};
        System.out.println(sumOfUnique(nums3));
        int[] nums4 = {1};
        System.out.println(sumOfUnique(nums4));
    }
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(!map.keySet().contains(num))
                map.put(num,1);
            else
                map.put(num, map.get(num) + 1);
        }

        int res = 0;
        int tmp;
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            tmp = iterator.next();
            if(map.get(tmp) == 1)
                res += tmp;
        }

        return res;
    }
}
