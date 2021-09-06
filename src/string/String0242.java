package string;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String0242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
        System.out.println(isAnagram("a","b"));
        System.out.println(isAnagram("a","a"));
        System.out.println(isAnagram("ab","a"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] count_arr1 = new int[26];
        int[] count_arr2 = new int[26];
        Arrays.fill(count_arr1,0);
        Arrays.fill(count_arr2,0);

        for(int i = 0; i < s.length(); i++){
            count_arr1[s.charAt(i) - 97]++;
            count_arr2[t.charAt(i) - 97]++;
        }

        for(int i = 0; i < count_arr1.length; i++){
            if(count_arr1[i] != count_arr2[i])
                return false;
        }

        return true;
    }
}
