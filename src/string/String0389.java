package string;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String0389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
        System.out.println(findTheDifference("","y"));
        System.out.println(findTheDifference("a","aa"));
        System.out.println(findTheDifference("ae","aea"));
    }
    public static char findTheDifference(String s, String t) {
        char ans = ' ';//

        int[] count_arr1 = new int[26];
        int[] count_arr2 = new int[26];
        Arrays.fill(count_arr1,0);
        Arrays.fill(count_arr2,0);

        for(int i = 0; i < s.length(); i++){
            count_arr1[s.charAt(i) - 97]++;
        }
        for(int i = 0; i < t.length(); i++){
            count_arr2[t.charAt(i) - 97]++;
        }

        for(int i = 0; i < 26; i++){
            if(count_arr1[i] == count_arr2[i] - 1){
                ans = (char)(i + 97);
            }
        }

        return ans;
    }
}
