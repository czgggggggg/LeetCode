package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/2/19
 * @Description
 */
public class Code0078 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3};
//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] nums = {-10,-2,0,4,10};
//        int[] nums = {10,2,-10,0,-4};
        List<List<Integer>> res = subsets(nums);
        Iterator<List<Integer>> iterator = res.iterator();
        while(iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        res.add(new ArrayList<>());//空集

        int size = 1;
        for(int i = 0; i < n; i++){//size = 1的子集
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            res.add(list);
            subsets(nums, list, res, size, n);
        }

        return res;
    }

    public static void subsets(int[] nums, List<Integer> list, List<List<Integer>> res, int size, int n){
        if(size == n)
            return;
        Integer lastNum = list.get(size - 1);
        for(int i = 0; i < n; i++){
            if(nums[i] > lastNum){
                List<Integer> list2 = new ArrayList<>(list);
                list2.add(nums[i]);
                res.add(list2);
                size++;
                subsets(nums, list2, res, size, n);
                size--;
            }
        }
    }
}
