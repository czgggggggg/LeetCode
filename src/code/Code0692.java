package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/1/6
 * @Description
 */
public class Code0692 {
    public static void main(String[] args) {
//        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
//        List<String> res = topKFrequent(words, 2);
//        Iterator<String> iterator = res.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
//        System.out.println();

        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        List<String> res = topKFrequent(words, 4);
        Iterator<String> iterator = res.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            if(!map.keySet().contains(word)){
                map.put(word, 1);
            }else{
                map.put(word, map.get(word) + 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            if(map.get(b) != map.get(a))
                return map.get(b) - map.get(a);
            else{
                return a.compareTo(b);
            }
        });

        List<String> res = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
        while(k-- > 0){
            res.add(iterator.next());
        }

        return res;
    }
}
