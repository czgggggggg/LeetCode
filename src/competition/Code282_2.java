package competition;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/2/27
 * @Description
 */
public class Code282_2 {
    public static void main(String[] args) {
        System.out.println(minSteps("leetcode","coats"));
        System.out.println(minSteps("night","thing"));
    }
    public static int minSteps(String s, String t) {
        int[] count_s = new int[26];
        int[] count_t = new int[26];
        Arrays.fill(count_s,0);
        Arrays.fill(count_t,0);

        for(int i = 0; i < s.length(); i++){
            count_s[s.charAt(i) - 97]++;
        }
        for(int i = 0; i < t.length(); i++){
            count_t[t.charAt(i) - 97]++;
        }

        int res = 0;
        for(int i = 0; i < 26; i++){
            res += Math.abs(count_s[i] - count_t[i]);
        }

        return res;
    }
}
