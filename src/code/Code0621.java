package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author chaizhigang
 * @Date 2022/8/21
 */
public class Code0621 {
    public static void main(String[] args) {
        char[] task1 = {'A','A','A','A','A','A','B','C','D','E','F','G'};
        int n1 = 2;
        System.out.println(leastInterval(task1, n1));
    }

    //v0.3 再写一次
    public static int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        ArrayList<Integer> nextTime = new ArrayList<>();//下一次最早执行时间
        ArrayList<Integer> rest = new ArrayList<>();//剩余个数
        for(Map.Entry<Character, Integer> entry : set){
            nextTime.add(1);
            rest.add(entry.getValue());
        }

        int time = 0;
        int min_time;//最小时间
        int m = set.size();
        int best;
        for(int i = 0; i < tasks.length; i++){
            time++;
            min_time = Integer.MAX_VALUE;
            for(int j = 0; j < m; j++){
                if(rest.get(j) != 0){
                    min_time = Math.min(min_time, nextTime.get(j));
                }
            }
            time = Math.max(time, min_time);
//            time = min_time;

            best = -1;
            //找到要执行的任务（最小时间 小于等于 当前时间 且 剩余次数最大）
            for(int j = 0; j < m; j++){
                if(rest.get(j) != 0 && nextTime.get(j) <= time){//可以执行
                    if(best == -1 || rest.get(best) < rest.get(j)){
                        best = j;
                    }
                }
            }
            nextTime.set(best, time + n + 1);
            rest.set(best, rest.get(best) - 1);
        }

        return time;
    }

    //v0.2 官方题解
//    public static int leastInterval(char[] tasks, int n) {
//        Map<Character, Integer> freq = new HashMap<Character, Integer>();
//        for (char ch : tasks) {
//            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
//        }
//
//        // 任务总数
//        int m = freq.size();
//        List<Integer> nextValid = new ArrayList<Integer>();
//        List<Integer> rest = new ArrayList<Integer>();
//        Set<Map.Entry<Character, Integer>> entrySet = freq.entrySet();
//        for (Map.Entry<Character, Integer> entry : entrySet) {
//            int value = entry.getValue();
//            nextValid.add(1);
//            rest.add(value);
//        }
//
//        int time = 0;
//        for (int i = 0; i < tasks.length; ++i) {
//            ++time;
//            int minNextValid = Integer.MAX_VALUE;
//            for (int j = 0; j < m; ++j) {
//                if (rest.get(j) != 0) {
//                    minNextValid = Math.min(minNextValid, nextValid.get(j));
//                }
//            }
//            time = Math.max(time, minNextValid);
//            int best = -1;
//            for (int j = 0; j < m; ++j) {
//                if (rest.get(j) != 0 && nextValid.get(j) <= time) {
//                    if (best == -1 || rest.get(j) > rest.get(best)) {
//                        best = j;
//                    }
//                }
//            }
//            nextValid.set(best, time + n + 1);
//            rest.set(best, rest.get(best) - 1);
//        }
//
//        return time;
//    }

    //v0.1 一开始废弃的思路
//    public static int leastInterval(char[] tasks, int n) {
//        int len = tasks.length;
//        int[] arr = new int[26];
//        for (int i = 0; i < len; i++){
//            arr[tasks[i] - 65]++;
//        }
//
//        List<CharCount> charCounts = new ArrayList<>();
//        for(int i = 0; i < 26; i++){
//            charCounts.add(new CharCount((char)(i + 65), arr[i]));
//        }
//        charCounts = charCounts.stream().sorted(new Comparator<CharCount>() {
//            @Override
//            public int compare(CharCount o1, CharCount o2) {
//                return o2.count - o1.count;
//            }
//        }).collect(Collectors.toList());
//
//        int result = 0;
//        Iterator<CharCount> iterator;
//        int count = 0;
//        while (charCounts.get(0).count != 0){
//            iterator = charCounts.iterator();
//            while (count < n){
//
//            }
//
//        }
//
//        Iterator<CharCount> iterator = charCounts.iterator();
//        while (iterator.hasNext()){
//            CharCount next = iterator.next();
//            System.out.print(next.ch + " " + next.count);
//            System.out.println();
//        }
//
//        return 0;
//    }
}
//class CharCount{
//    char ch;
//    int count;
//    CharCount(char ch, int count){
//        this.ch = ch;
//        this.count = count;
//    }
//}