package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Code0089 {
    public static void main(String[] args) {
        List<Integer> res = grayCode(4);
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //0 1
        //0 1 3 2
        //0 1 3 2 6 7 5 4
        //0 1 3 2 6 7 5 4 12 13 15 14 10 11 9 8
    }
    public static List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for(int i = 1; i <= n; i++){
            int m = res.size();
            for(int j = m - 1; j >= 0; j--){
                res.add(res.get(j) | 1 << (i - 1));
            }
        }
        return res;
    }
}
