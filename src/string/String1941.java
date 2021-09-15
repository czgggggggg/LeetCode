package string;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2021/9/15
 * @Description
 */
public class String1941 {
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbc"));
        System.out.println(areOccurrencesEqual("aaabb"));
        System.out.println(areOccurrencesEqual("abcabcabca"));
        System.out.println(areOccurrencesEqual("abcabcabc"));
    }
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(hashMap.keySet().contains(ch)){
                hashMap.put(ch,hashMap.get(ch) + 1);
            }else{
                hashMap.put(ch,1);
            }
        }

        Iterator<Integer> iterator = hashMap.values().iterator();
        int first = iterator.next();
        while(iterator.hasNext()){
            if(iterator.next() != first)
                return false;
        }

        return true;
    }
}
