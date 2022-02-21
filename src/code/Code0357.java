package code;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2022/2/21
 * @Description
 */
public class Code0357 {
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(0));//1
        System.out.println(countNumbersWithUniqueDigits(1));//10
        System.out.println(countNumbersWithUniqueDigits(2));//91
        System.out.println(countNumbersWithUniqueDigits(3));//739
        System.out.println(countNumbersWithUniqueDigits(4));//5275
        System.out.println(countNumbersWithUniqueDigits(5));//32491
    }

    public static int countNumbersWithUniqueDigits(int n) {
        int res = 1;//0一定是
        int size;//数字的位数：1~n
        int curSize;//当前的位数
//        int num;
        HashSet<Integer> set = new HashSet<>();//保证每一位的数字不重复

        if(n == 0)
            return 1;
        if(n == 1)
            return 10;

        res = 10;//[0,9]
        curSize = 1;
        for(size = 2;size <= n; size++){//size: 2~n
            for(int i = 1; i <= 9; i++){
                set.add(i);
//                num = i;
//                res = dfs(res, size,curSize,set, num);
                res = dfs(res, size,curSize,set);
                set.remove(i);
            }
        }

        return res;
    }

    //v0.2  去掉num相关的代码
    public static int dfs(int res, int size, int curSize, HashSet<Integer> set){
        if(curSize == size){
            res++;
            return res;
        }

        for(int i = 0; i <= 9; i++){
            if(!set.contains(i)){
                curSize++;
                set.add(i);

                res = dfs(res, size, curSize, set);

                curSize--;
                set.remove(i);
            }
        }

        return res;
    }

    //v0.1  num多余
//    public static int dfs(int res, int size, int curSize, HashSet<Integer> set, int num){
//        if(curSize == size){
//            res++;
//            return res;
//        }
//
//        for(int i = 0; i <= 9; i++){
//            if(!set.contains(i)){
//                num = num * 10 + i;
//                curSize++;
//                set.add(i);
//
//                res = dfs(res, size, curSize, set, num);
//
//                num = (num - i) / 10;
//                curSize--;
//                set.remove(i);
//            }
//        }
//
//        return res;
//    }
}
