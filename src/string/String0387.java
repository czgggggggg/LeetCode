package string;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String0387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar("aabbccd"));
    }
    public static int firstUniqChar(String s) {
        int[] count_arr = new int[26];
        Arrays.fill(count_arr,0);

        for(int i = 0; i < s.length(); i++){
            count_arr[s.charAt(i) - 97]++;
        }

        for(int i = 0; i < s.length(); i++){
            if(count_arr[s.charAt(i) - 97] == 1)
                return i;
        }

        return -1;
    }
}
