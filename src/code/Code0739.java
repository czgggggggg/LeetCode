package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/3/25
 * @Description
 */
public class Code0739 {
    public static void main(String[] args) {
//        int[] temperatures1 = {73,74,75,71,69,72,76,73};
//        int[] res1 = dailyTemperatures(temperatures1);
//        for(int i = 0; i < res1.length; i++)
//            System.out.print(res1[i] + " ");
//        System.out.println();
//
//        int[] temperatures2 = {30,40,50,60};
//        int[] res2 = dailyTemperatures(temperatures2);
//        for(int i = 0; i < res2.length; i++)
//            System.out.print(res2[i] + " ");
//        System.out.println();
//
//        int[] temperatures3 = {30,60,90};
//        int[] res3 = dailyTemperatures(temperatures3);
//        for(int i = 0; i < res3.length; i++)
//            System.out.print(res3[i] + " ");
//        System.out.println();

        int[] temperatures4 = {89,62,70,58,47,47,46,76,100,70};
        int[] res4 = dailyTemperatures(temperatures4);
        for(int i = 0; i < res4.length; i++)
            System.out.print(res4[i] + " ");
        System.out.println();

    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        if(n == 1)
            return new int[]{0};

        int[] res = new int[n];
        Arrays.fill(res, 0);

        //用set和list都可以，虽然温度可能会重复，但是数组索引是不会重复的。
//        HashSet<Integer> set = new HashSet<>();//存放还没有结果的索引位置
        List<Integer> list = new ArrayList<>();//存放还没有结果的索引位置

//        set.add(0);
        list.add(0);
        for(int i = 1; i < n; i++){
            if(temperatures[i - 1] < temperatures[i]){
                res[i - 1] = 1;
//                Iterator<Integer> iterator = set.iterator();
                Iterator<Integer> iterator = list.iterator();
                while(iterator.hasNext()){
                    Integer next = iterator.next();
                    if(temperatures[next] < temperatures[i]){
                        res[next] = i - next;
//                        set.remove(next);
                        iterator.remove();
                    }
                }
            }else{
//                set.add(i - 1);
                list.add(i - 1);
            }
        }

        return res;
    }
}
