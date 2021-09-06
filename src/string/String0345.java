package string;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String0345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));//holle
        System.out.println(reverseVowels("leetcode"));//leotcede
        System.out.println(reverseVowels("e"));
        System.out.println(reverseVowels("AaEeI"));
        System.out.println(reverseVowels("AaEeIi"));
    }
    public static String reverseVowels(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList('A','a','E','e','I','i','O','o','U','u'));

        char[] chars = new char[s.length()];
        s.getChars(0,s.length(),chars,0);

        int i = 0;
        int j = s.length() - 1;
        char tmp;
        while(i < j){
            if(!hashSet.contains(chars[i]))
                i++;
            if(!hashSet.contains(chars[j]))
                j--;
            if(hashSet.contains(chars[i]) && hashSet.contains(chars[j])){
                tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            }
        }

        String result = "";
        for(char ch : chars)
            result += ch;

        return result;
    }
}
