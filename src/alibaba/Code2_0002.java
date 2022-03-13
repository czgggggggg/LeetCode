package alibaba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @Author czgggggggg
 * @Date 2022/3/13
 * @Description
 */
public class Code2_0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int preNum = 0;
        int count = 0;

        res = dfs(n, m, res, list, preNum, count);

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
    public static List<List<Integer>> dfs(int n, int m, List<List<Integer>> res, List<Integer> list, int preNum, int count){
//        System.out.println("test");
        if(count == m){
//            System.out.println("count: " + count + ", n: " + n);
            res.add(new ArrayList<>(list));
            return res;
        }

        for(int i = preNum + 1; i <= n; i++){
            list.add(i);
            count++;
            res = dfs(n, m, res, list, i, count);
            list.remove(list.size() - 1);
            count--;
        }

        return res;
    }
}
