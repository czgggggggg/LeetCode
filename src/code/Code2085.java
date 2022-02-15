package code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/2/15
 * @Description
 */
public class Code2085 {
    public static void main(String[] args) {
//        String[] words1 = {"leetcode","is","amazing","as","is"};
//        String[] words2 = {"amazing","leetcode","is"};
//        System.out.println(countWords(words1,words2));//2

//        String[] words1 = {"b","bb","bbb"};
//        String[] words2 = {"a","aa","aaa"};
//        System.out.println(countWords(words1,words2));//0

        String[] words1 = {"a","ab"};
        String[] words2 = {"a","a","a","ab"};
        System.out.println(countWords(words1,words2));//1
    }
    public static int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashSet<String> set1 = new HashSet<>();

        for(String str : words1){
            if(!map1.keySet().contains(str))
                map1.put(str, 1);
            else
                map1.put(str, map1.get(str) + 1);
        }
        for(String str : words2){
            if(!map2.keySet().contains(str))
                map2.put(str, 1);
            else
                map2.put(str, map2.get(str) + 1);
        }

        String next;

        Iterator<String> iterator1 = map1.keySet().iterator();
        while(iterator1.hasNext()){
            next = iterator1.next();
            if(map1.get(next) == 1)
                set1.add(next);
        }

        int count = 0;
        //有点多此一举，完全没必要遍历map2
        Iterator<String> iterator2 = map2.keySet().iterator();
        while(iterator2.hasNext()){
            next = iterator2.next();
            if(map2.get(next) == 1 && set1.contains(next))
                count++;
        }

        return count;
    }
}
