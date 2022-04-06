package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/4/6
 * @Description
 */
public class Test0005 {
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> temp = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,M;
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        List<List<Integer>> graph = new ArrayList<>(N);

        for(int i = 0; i < N; i++){
            graph.add(new ArrayList<>());
        }

        int[] inDegree = new int[N];
        for(int i = 0; i < N; i++){
            String str = sc.nextLine();
//            int size = sc.nextInt();
            String[] split = str.split(",");
            int size = Integer.valueOf(split[0]);

            for(int j = 0; j < size; j++){
//                int head = sc.nextInt();
                int head = Integer.valueOf(split[j + 1]);
                List<Integer> edges = graph.get(head);
                edges.add(i);
            }
            inDegree[i] = size;
        }

        for(int i = 0; i < N; i++){
            if(inDegree[i] == 0){
                temp.add(i);
                dfs(graph, i, M);
                temp.remove(temp.size() - 1);
            }
        }

        if(result.size() == 0){
            System.out.println(-1);
        }else{
            for(int i = 0; i < result.get(0).size() - 1; i++){
                System.out.print(result.get(0).get(i) + ",");
            }
            System.out.println(result.get(0).get(result.get(0).size() - 1));
        }
    }

    public static void dfs(List<List<Integer>> graph, int start, int target){
        for(int v : graph.get(start)){
            if(v == target){
                result.add(new ArrayList<>(temp));
            }else{
                temp.add(v);
                dfs(graph,v,target);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
//4
//2
//0
//1,0
//1,1
//2,0,1