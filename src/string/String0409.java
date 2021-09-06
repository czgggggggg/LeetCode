package string;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String0409 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));//7
        System.out.println(longestPalindrome("abccccddd"));//7
        System.out.println(longestPalindrome(""));//0
        System.out.println(longestPalindrome("abc"));//1
        System.out.println(longestPalindrome("aba"));//3
        System.out.println(longestPalindrome("aab"));//3
        System.out.println(longestPalindrome("abcdee"));//3
        System.out.println(longestPalindrome("abcdeeff"));//5
        System.out.println(longestPalindrome("ABCabc"));//1
        System.out.println(longestPalindrome("abbbccccc"));//5 -> 7
        System.out.println(longestPalindrome("abbbcccccddddddd"));//7 -> 13
        System.out.println(longestPalindrome("xyyzzzXXXXYYYYYZZZZZZ"));//19
    }
    public static int longestPalindrome(String s) {
        int[] count_arr = new int[52];
        Arrays.fill(count_arr, 0);

        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                count_arr[ch - 65]++;
            }else if(ch >= 'a' && ch <= 'z'){
                count_arr[ch - 71]++;
            }
        }

        int sum = 0;
        int odd_count = 0;
//        int max_odd_count = Integer.MIN_VALUE;
        for(int i = 0; i < 52; i++){
            if(count_arr[i] % 2 == 0)
                sum += count_arr[i];
            else{
                odd_count++;
//                if(count_arr[i] > max_odd_count)
//                    max_odd_count = count_arr[i];
                sum += ((count_arr[i] / 2) * 2);
            }
        }

        int result = 0;
        if(odd_count == 0)
            result = sum;
        else
            result = sum + 1;
//            result = sum + max_odd_count;

        return result;
    }
}
//A 65 -> 0
//Z 90 -> 25
//------------
//a 97 -> 26
//z 122 -> 51