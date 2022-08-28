package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @Author chaizhigang
 * @Date 2022/8/21
 */
public class Code0438 {
    public static void main(String[] args) {
//        String s = "cbaebabacd";
//        String p = "abc";
        String s = "ababababab";
        String p = "ab";
//        String s = "baa";
//        String p = "aa";
        List<Integer> result = findAnagrams(s, p);
        Iterator<Integer> iterator = result.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        List<Integer> result = new ArrayList<>();
        if(sLen < pLen){
            return result;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> pMap = new HashMap<>();
        for(int i = 0; i < pLen; i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
        }

        boolean tag;
        for(int i = 0; i <= sLen - pLen; i++){
            tag = true;
            Iterator<Character> iterator = pMap.keySet().iterator();
            while (iterator.hasNext()){
                Character ch = iterator.next();
                if(!sMap.keySet().contains(ch) || sMap.get(ch).intValue() != pMap.get(ch).intValue()){
                    tag = false;
                    break;
                }
            }
            if(tag){
                result.add(i);
            }
            if(sMap.get(s.charAt(i)) == 1){
                sMap.remove(s.charAt(i));
            }else{
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) - 1);
            }
            if(i + pLen < sLen){
                sMap.put(s.charAt(i + pLen), sMap.getOrDefault(s.charAt(i + pLen), 0) + 1);
            }
        }
        return result;
    }
}
