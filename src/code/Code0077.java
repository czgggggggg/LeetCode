package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/2/20
 * @Description
 */
public class Code0077 {
    public static void main(String[] args) {
//        List<List<Integer>> res = combine(4, 2);
//        Iterator<List<Integer>> iterator = res.iterator();
//        while(iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while(iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //1 2
        //1 3
        //1 4
        //2 3
        //2 4
        //3 4

//        List<List<Integer>> res = combine(1, 1);
//        Iterator<List<Integer>> iterator = res.iterator();
//        while(iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while(iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //1

        List<List<Integer>> res = combine(5, 3);
        Iterator<List<Integer>> iterator = res.iterator();
        while(iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
        //1 2 3
        //1 2 4
        //1 2 5
        //1 3 4
        //1 3 5
        //1 4 5
        //2 3 4
        //2 3 5
        //2 4 5
        //3 4 5
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int size = 0;
        int preNum = 0;
        dfs(res, list, size, preNum, n, k);

        return res;
    }
    public static void dfs(List<List<Integer>> res, List<Integer> list, int size, int preNum, int n, int k){
        if(size == k){
            ArrayList<Integer> tmp = new ArrayList<>(list);
            res.add(tmp);
            return;
        }

        for(int i = preNum + 1; i <= n; i++){
            list.add(i);
            size++;
            dfs(res, list, size, i, n, k);
            list.remove(list.size() - 1);
            size--;
        }
    }
}
