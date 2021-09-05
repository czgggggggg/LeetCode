package string;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class Stirng0205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));//true
        System.out.println(isIsomorphic("foo","bar"));//false
        System.out.println(isIsomorphic("paper","title"));//true
        System.out.println(isIsomorphic("",""));//true
        System.out.println(isIsomorphic("a","b"));//true
        System.out.println(isIsomorphic("abc","aaa"));//true
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        if(s.length() == 0)
            return true;

        HashMap<Character,Character> hashMap = new HashMap<>();
        HashMap<Character,Character> hashMapReverse = new HashMap<>();//hashMap的反向HashMap

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(hashMap.get(ch) == null){
                hashMap.put(ch, t.charAt(i));
                //要求不同字符不能映射到同一个字符上。
                if(hashMapReverse.get(t.charAt(i)) == null){
                    hashMapReverse.put(t.charAt(i), ch);
                }else{
                    return false;
                }
            }else{
                if(hashMap.get(ch) != t.charAt(i))
                    return false;
            }
        }

        return true;
    }
}
//空字符串怎么算，题目没说清除。