package code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author czgggggggg
 * @Date 2022/1/1
 * @Description
 */
public class Code1512 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums1));//4
        int[] nums2 = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums2));//6
        int[] nums3 = {1,2,3};
        System.out.println(numIdenticalPairs(nums3));//0
    }
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int tmp;
        for(int i = 0; i < nums.length; i++){
            if(!hashMap.keySet().contains(nums[i])){
                hashMap.put(nums[i],1);
            }else{
                tmp = hashMap.get(nums[i]);
                hashMap.put(nums[i],++tmp);
            }
        }

        int res = 0;
        Integer next;
        Integer n;
        Set<Integer> integers = hashMap.keySet();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            next = iterator.next();
            n = hashMap.get(next);
            res += (n * (n - 1)) / 2;
        }

        return res;
    }
}
//1 -> 0
//2 -> 0 + 1
//3 -> 0 + 1 + 2
//4 -> 0 + 1 + 2 +3
//n -> n(n - 1)/2