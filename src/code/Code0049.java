package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/1/4
 * @Description
 */
public class Code0049 {
    public static void main(String[] args) {
//        System.out.println(isYiweiWord("abc","cba"));//true
//        System.out.println(isYiweiWord("abcc","cbaa"));//false
//        System.out.println(isYiweiWord("abcc","cba"));//false
//        System.out.println(isYiweiWord("aabc","acba"));//true

//        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        String[] strs = {""};
        String[] strs = {"a"};

        List<List<String>> lists = groupAnagrams(strs);
        Iterator<List<String>> iterator = lists.iterator();
        while(iterator.hasNext()){
            List<String> next = iterator.next();
            Iterator<String> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        boolean flag;
        for(String str : strs){
            flag = false;
            for(List<String> list : lists){
                if(isYiweiWord(list.get(0), str)){//已检测单词中有可匹配的
                    list.add(str);
                    flag = true;
                }
            }
            if(!flag){//已检测单词中没有可匹配的
                List<String> list = new ArrayList<>();
                list.add(str);
                lists.add(list);
            }
        }
        return lists;
    }

    /**
     * 判断两个单词是否是异位词
     */
    public static boolean isYiweiWord(String word1, String word2){
        int len1 = word1.length();
        int len2 = word2.length();

        if(len1 != len2)
            return false;

//        int[] arr1 = new int[26];
//        int[] arr2 = new int[26];
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        char ch;
        for(int i = 0; i < len1; i++){
            ch = word1.charAt(i);
            if(!map1.keySet().contains(ch))
                map1.put(ch,1);
            else
                map1.put(ch,map1.get(ch) + 1);
            ch = word2.charAt(i);
            if(!map2.keySet().contains(ch))
                map2.put(ch,1);
            else
                map2.put(ch,map2.get(ch) + 1);
        }

        if(map1.keySet().size() != map2.keySet().size())
            return false;

        Character next;
        Iterator<Character> iterator = map1.keySet().iterator();
        while (iterator.hasNext()){
            next = iterator.next();
            if(!map2.keySet().contains(next))
                return false;
            if(map1.get(next) != map2.get(next))
                return false;
        }
        return true;
    }
}
