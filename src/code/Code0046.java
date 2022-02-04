package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/2/4
 * @Description
 */
public class Code0046 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3};
//        List<List<Integer>> res = permute(nums);
//        Iterator<List<Integer>> iterator = res.iterator();
//        while (iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while (iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
//        //1 2 3
//        //1 3 2
//        //2 1 3
//        //2 3 1
//        //3 2 1
//        //3 1 2

        int[] nums = {0,1};
        List<List<Integer>> res = permute(nums);
        Iterator<List<Integer>> iterator = res.iterator();
        while (iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while (iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
        //0 1
        //1 0

//        int[] nums = {1};
//        List<List<Integer>> res = permute(nums);
//        Iterator<List<Integer>> iterator = res.iterator();
//        while (iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while (iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
//        //1
    }
    public static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        for(int num : nums)
            list.add(num);

        dfs(res, list, n , 0);

        return res;
    }
    public static void dfs(List<List<Integer>> res, List<Integer> list, int n, int first){
        if(first == n)
            res.add(new ArrayList<>(list));

        for(int i = first; i < n; i++){
            Collections.swap(list, first, i);//前进
            dfs(res ,list, n, first + 1);
            Collections.swap(list, first, i);//回退
        }
    }
}
//1 2 3

//1 2 3
//1 3 2
//2 1 3
//2 3 1
//3 1 2
//3 2 1