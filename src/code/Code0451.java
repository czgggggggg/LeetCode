package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/1/6
 * @Description
 */
public class Code0451 {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));//eert
        System.out.println(frequencySort("cccaaa"));//aaaccc
        System.out.println(frequencySort("Aabb"));//bbAa
        System.out.println(frequencySort("eeee"));//eeee
        System.out.println(frequencySort("aaabbbbcceeeffggkkkkkkkkkkkkkuuuuuuuutttttttttttttttttttttttttttttttttttttp"));
    }
    public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        Character ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(!map.keySet().contains(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch) + 1);
            }
        }

        ArrayList<Character>[] arrayLists = new ArrayList[s.length() + 1];
        for(int i = 0; i < s.length() + 1; i++){
            arrayLists[i] = new ArrayList<Character>();
        }
        Iterator<Character> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Character next = iterator.next();
            Integer integer = map.get(next);
            arrayLists[integer].add(next);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = s.length(); i >= 0; i--){
            for(Character c : arrayLists[i]){
                for(int t = 0; t < i; t++){
                    stringBuilder.append(c);
                }
            }
        }

        String res = stringBuilder.toString();
        return res;
    }
}
