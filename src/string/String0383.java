package string;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String0383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));
        System.out.println(canConstruct("abcde","abcd"));
        System.out.println(canConstruct("abcdee","abcde"));
        System.out.println(canConstruct("abcdee","abcdeee"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count_arr1 = new int[26];
        int[] count_arr2 = new int[26];
        Arrays.fill(count_arr1,0);
        Arrays.fill(count_arr2,0);

        for(int i = 0; i < ransomNote.length(); i++){
            count_arr1[ransomNote.charAt(i) - 97]++;
        }
        for(int i = 0; i < magazine.length(); i++){
            count_arr2[magazine.charAt(i) - 97]++;
        }

        for(int i = 0; i < 26; i++){
            if(count_arr1[i] > count_arr2[i])
                return false;
        }

        return true;
    }
}
