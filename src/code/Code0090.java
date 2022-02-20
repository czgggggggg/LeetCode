package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/2/20
 * @Description
 */
public class Code0090 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3};
        int[] nums = {1,2,2};
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
        HashSet<String> set = new HashSet<>();

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        res.add(new ArrayList<>());//空集

        int size = 1;
        for(int i = 0; i < n; i++){//size = 1的子集
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            if(!set.contains(list.toString())){
                res.add(list);
                set.add(list.toString());
            }
//            subsets(nums, list, res, size, n);
            subsets(nums, list, res, size, n, i, set);
        }

        return res;
    }

    //Code0090
    public static void subsets(int[] nums, List<Integer> list, List<List<Integer>> res, int size, int n, int preIndex, HashSet<String> set){
        if(size == n)
            return;
        for(int i = preIndex + 1; i < n; i++){
            List<Integer> list2 = new ArrayList<>(list);
            list2.add(nums[i]);
            if(!set.contains(list2.toString())){
                res.add(list2);
                set.add(list2.toString());
            }
            size++;
            subsets(nums, list2, res, size, n, i, set);
            size--;
        }
    }

    //Code0078优化
//    public static void subsets(int[] nums, List<Integer> list, List<List<Integer>> res, int size, int n, int preIndex){
//        if(size == n)
//            return;
//        for(int i = preIndex + 1; i < n; i++){
//            List<Integer> list2 = new ArrayList<>(list);
//            list2.add(nums[i]);
//            res.add(list2);
//            size++;
//            subsets(nums, list2, res, size, n, i);
//            size--;
//        }
//    }

    //Code0078
//    public static void subsets(int[] nums, List<Integer> list, List<List<Integer>> res, int size, int n){
//        if(size == n)
//            return;
//        Integer lastNum = list.get(size - 1);
//        for(int i = 0; i < n; i++){
//            if(nums[i] > lastNum){
//                List<Integer> list2 = new ArrayList<>(list);
//                list2.add(nums[i]);
//                res.add(list2);
//                size++;
//                subsets(nums, list2, res, size, n);
//                size--;
//            }
//        }
//    }
}
