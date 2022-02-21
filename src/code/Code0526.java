package code;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author czgggggggg
 * @Date 2022/2/21
 * @Description
 */
public class Code0526 {
    public static void main(String[] args) {
        System.out.println(countArrangement(1));//1
        System.out.println(countArrangement(2));//2
        System.out.println(countArrangement(3));//3
        System.out.println(countArrangement(4));//8
        System.out.println(countArrangement(5));//10
        System.out.println(countArrangement(10));//700
        System.out.println(countArrangement(15));//24679
    }
    public static int countArrangement(int n) {
        int res = 0;
        int curSize = 0;
        HashSet<Integer> set = new HashSet<>();

        res = dfs(res,curSize,n,set);

        return res;
    }
    public static int dfs(int res, int curSize, int n, HashSet<Integer> set){
        if(curSize == n){
            res++;
            return res;
        }

        curSize++;
        for(int i = 1; i <= n; i++){
            if(!set.contains(i)){
                if(i % curSize == 0 || curSize % i == 0){
                    set.add(i);
                    res = dfs(res,curSize,n,set);
                    set.remove(i);
                }
            }
        }

        return res;
    }
}
