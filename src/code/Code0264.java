package code;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/1/2
 * @Description
 */
public class Code0264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
        System.out.println(nthUglyNumber(1));
        System.out.println(nthUglyNumber(81));
        System.out.println(nthUglyNumber(1690));
    }
    public static int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) {
                p2++;
            }
            if (dp[i] == num3) {
                p3++;
            }
            if (dp[i] == num5) {
                p5++;
            }
        }
        return dp[n];
    }






    //v0.1 超出时间限制
//    public static int nthUglyNumber(int n) {
//        HashSet<Integer> set = new HashSet<>();
//        HashSet<Integer> tmp = new HashSet<>();
//
//        if(n == 1)
//            return 1;
//
//        int num = 2;//从2开始计算
//        int curTh = 1;//当前已经遍历完的数中的最后一个数在丑数中的序号  //从1开始
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(5);
//        while(curTh < n){
//            if(set.contains(num)){
////                for(Integer integer : set){
////                    if(integer >= num){
////                        set.add(num * integer);
////                    }
////                }
//                Iterator<Integer> iterator = set.iterator();
//                tmp.clear();
//                while(iterator.hasNext()){
//                    Integer next = iterator.next();
////                    if(next >= num){
////                        set.add(num * next);
////                        System.out.println("test---" + num + "---" + next + "---" + (num * next));
//                        tmp.add(num * next);
////                    }
//                }
//                set.addAll(tmp);
//
//                curTh++;//当前的num在丑数中的序号为curTh+1
//            }
//            num++;//继续遍历下一个数
//        }
//        return num - 1;//注意要减一
//    }
}
