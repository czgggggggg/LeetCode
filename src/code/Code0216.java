package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/2/21
 * @Description
 */
public class Code0216 {
    public static void main(String[] args) {
//        List<List<Integer>> lists = combinationSum3(3, 9);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while(iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while(iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //1 2 6
        //1 3 5
        //2 3 4

//        List<List<Integer>> lists = combinationSum3(3, 7);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while(iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while(iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //1 2 4

//        List<List<Integer>> lists = combinationSum3(3, 0);
//        Iterator<List<Integer>> iterator = lists.iterator();
//        while(iterator.hasNext()){
//            List<Integer> next = iterator.next();
//            Iterator<Integer> iterator1 = next.iterator();
//            while(iterator1.hasNext()){
//                System.out.print(iterator1.next() + " ");
//            }
//            System.out.println();
//        }
        //

        List<List<Integer>> lists = combinationSum3(0, 3);
        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
        //
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        int preNum = 0;
        int count = 0;
        dfs(k,n,sum,preNum,count,res,list);

        return res;
    }

    public static void dfs(int k, int n, int sum, int preNum, int count, List<List<Integer>> res, List<Integer> list){
        for(int i = preNum + 1; i <= 9; i++){
            preNum = i;
            sum += i;
            count++;
            list.add(i);
            if(count < k){
                dfs(k,n,sum,preNum,count,res,list);
                sum -= i;
                count--;
                list.remove(list.size() - 1);
            }else if(count == k){
                if(sum == n){
                    res.add(new ArrayList<>(list));
                    list.remove(list.size() - 1);
                    return;
                }else{
                    sum -= i;
                    count--;
                    list.remove(list.size() - 1);
                }
            }else{//count > k
                list.remove(list.size() - 1);
                return;
            }
        }
    }
}
