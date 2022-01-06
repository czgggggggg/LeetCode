package code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/1/6
 * @Description
 */
public class Code0791 {
    public static void main(String[] args) {
//        String order = "cba";
//        String s = "abcd";
//        System.out.println(customSortString(order,s));//cbad
//        String order = "cba";
//        String s = "abcabcd";
//        System.out.println(customSortString(order,s));//ccbbaad
//        String order = "cba";
//        String s = "abcabcdefabc";
//        System.out.println(customSortString(order,s));//cccbbbaaadef
        String order = "acb";
        String s = "abcabcdefabc";
        System.out.println(customSortString(order,s));//aaacccbbbdef
    }
    public static String customSortString(String order, String s) {
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 97]++;
        }

        HashSet<Character> set = new HashSet<>();//不在order中的字符的集合
        for(int i = 0; i < 26; i++)
            set.add((char) (97 + i));

        char ch;
        int count;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < order.length(); i++){
            ch = order.charAt(i);
            count = arr[ch - 97];
            while (count-- > 0){
                sb.append(ch);
            }
            set.remove(ch);//set中去除已经在order中存在的字符
        }

        Iterator<Character> iterator = set.iterator();
        while(iterator.hasNext()){
            ch = iterator.next();
            count = arr[ch - 97];
            while (count-- > 0){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
