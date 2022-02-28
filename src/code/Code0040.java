package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/2/28
 * @Description
 */
public class Code0040 {
    public static void main(String[] args) {
//        int[] candidates = {10,1,2,7,6,1,5};
//        int target = 8;
//        List<List<Integer>> lists = combinationSum2(candidates, target);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while(iterator.hasNext()){
//            List<Integer> list = iterator.next();
//            Iterator<Integer> iterator1 = list.iterator();
//            while(iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //1 1 6
        //1 2 5
        //1 7
        //2 6

//        int[] candidates = {2,5,2,1,2};
//        int target = 5;
//        List<List<Integer>> lists = combinationSum2(candidates, target);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while(iterator.hasNext()){
//            List<Integer> list = iterator.next();
//            Iterator<Integer> iterator1 = list.iterator();
//            while(iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //1 2 2
        //5

//        int[] candidates = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
//        int target = 30;
//        List<List<Integer>> lists = combinationSum2(candidates, target);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while(iterator.hasNext()){
//            List<Integer> list = iterator.next();
//            Iterator<Integer> iterator1 = list.iterator();
//            while(iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }

//        int[] candidates = {1,1,1,1,1,2};
        int[] candidates = {1,2,2,2,3,4};
        int target = 7;
        List<List<Integer>> lists = combinationSum2(candidates, target);
        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext()){
            List<Integer> list = iterator.next();
            Iterator<Integer> iterator1 = list.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
        //

    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = candidates.length;
        HashSet<String> set = new HashSet<>();

        Arrays.sort(candidates);

        for(int i = 0; i < n; i++){
            dfs(candidates,target,res,list,n,set,i);
        }

        return res;
    }
    public static void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> list, int n, HashSet<String> set, int index){
        list.add(candidates[index]);

        target -= candidates[index];
        if(target == 0){
            if(!set.contains(list.toString())){
                res.add(new ArrayList<>(list));
                set.add(list.toString());
            }
        }else if(target > 0){
//            for(int i = index; i < n; i++){
            for(int i = index + 1; i < n; i++){
                if(i > index + 1 && candidates[i] == candidates[i - 1]){
                    continue;
                }else{
                    dfs(candidates,target,res,list,n,set,i);
                }
            }
        }else{

        }

        list.remove(list.size() - 1);
    }
}
