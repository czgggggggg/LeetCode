package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/2/28
 * @Description
 */
public class Code0047 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3};
        int[] nums = {1,1,2};
        List<List<Integer>> res = permuteUnique(nums);
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
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        boolean[] visited = new boolean[n];
        Arrays.fill(visited,false);

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            list.add(nums[i]);
            visited[i] = true;
            dfs(nums,res,list,n,visited,set);
            list.remove(list.size() - 1);
            visited[i] = false;
        }

        return res;
    }
    public static void dfs(int[] nums, List<List<Integer>> res, List<Integer> list, int n, boolean[] visited, HashSet<String> set){
        if(list.size() == n){
            if(!set.contains(list.toString())){
                res.add(new ArrayList<>(list));
                set.add(list.toString());
            }
            return;
        }

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                list.add(nums[i]);
                visited[i] = true;
                dfs(nums,res,list,n,visited,set);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }
}
