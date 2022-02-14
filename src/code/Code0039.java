package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/2/14
 * @Description
 */
public class Code0039 {
    static int n;

    public static void main(String[] args) {
//        int[] candidates = {2,3,6,7};
//        int target = 7;
//        List<List<Integer>> lists = combinationSum(candidates, target);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while (iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while (iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //2 2 3
        //7

//        int[] candidates = {2,3,5};
//        int target = 8;
//        List<List<Integer>> lists = combinationSum(candidates, target);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while (iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while (iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //2 2 2 2
        //2 3 3
        //3 5

//        int[] candidates = {2};
//        int target = 1;
//        List<List<Integer>> lists = combinationSum(candidates, target);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while (iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while (iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //

//        int[] candidates = {1,2};
//        int target = 10;
//        List<List<Integer>> lists = combinationSum(candidates, target);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while (iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while (iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
//        //1 1 1 1 1 1 1 1 1 1
//        //1 1 1 1 1 1 1 1 2
//        //1 1 1 1 1 1 2 2
//        //1 1 1 1 2 2 2
//        //1 1 2 2 2 2
//        //2 2 2 2 2

        int[] candidates = {2,3,5};
        int target = 8;
        List<List<Integer>> lists = combinationSum(candidates, target);
        Iterator<List<Integer>> iterator = lists.iterator();
        while (iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while (iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);
        n = candidates.length;

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(candidates[i]);
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            combinationSum(candidates, target, i, list, set, res);
        }

        return res;
    }
    public static void combinationSum(int[] candidates, int target, int k, List<Integer> list, HashSet<Integer> set, List<List<Integer>> res){
        list.add(candidates[k]);

        target -= candidates[k];
//        if((set.contains(target) && target >= candidates[k])){
//            list.add(target);
//            res.add(new LinkedList<>(list));
//            list.remove(list.size() - 1);
//        }
        if(target == 0){
            res.add(new LinkedList<>(list));
            list.remove(list.size() - 1);
            return;
        }

        if(target < candidates[k]){
            list.remove(list.size() - 1);
            return;
        }else{
            for(int i = k; i < n; i++){
//                list.add(candidates[i]);

                combinationSum(candidates, target, i, list, set, res);

//                list.remove(list.size() - 1);
            }
            list.remove(list.size() - 1);
        }
    }
}