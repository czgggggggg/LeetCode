package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/2/21
 * @Description
 */
public class Code0797 {
    public static void main(String[] args) {
//        int[][] graph = {{1,2},{3},{3},{}};
//        List<List<Integer>> lists = allPathsSourceTarget(graph);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while(iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while(iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //0 1 3
        //0 2 3

        int[][] graph = {{4,3,1},{3,2,4},{3},{4},{}};
        List<List<Integer>> lists = allPathsSourceTarget(graph);
        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
        //0 4
        //0 3 4
        //0 1 3 4
        //0 1 2 3 4
        //0 1 4
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = graph.length;

        list.add(0);
        int from = 0;
        for(int j = 0; j < graph[from].length; j++){
            dfs(res,list,from,graph[from][j],n,graph);//from -> graph[from][j]
        }

        return res;
    }

    public static void dfs(List<List<Integer>> res, List<Integer> list,int from, int to, int n, int[][] graph){
        list.add(to);

        //边界
        if(to == n - 1){
            res.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }

        //递归
        from = to;
        for(int j = 0; j < graph[from].length; j++){
            if(from != graph[from][j]){
                dfs(res,list,from,graph[from][j],n,graph);
            }
        }

        list.remove(list.size() - 1);
    }
}
