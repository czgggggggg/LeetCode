package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/1/5
 * @Description
 */
public class Code0229 {
    public static void main(String[] args) {
//        int[] nums = {3,2,3};
        int[] nums = {1};
//        int[] nums = {1,1,1,3,3,2,2,2};
        List<Integer> list = majorityElement(nums);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    //22.77%、52.50%
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.keySet().contains(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }

        for(int num : map.keySet()){
            if(map.get(num) > n / 3){
                ans.add(num);
            }
        }

        return ans;
    }
}
//⌊ n/3 ⌋
//1 -> 0 -> 1
//2 -> 0 -> 1
//3 -> 1 -> 2
//4 -> 1 -> 2
//5 -> 1 -> 2
//6 -> 2 -> 3