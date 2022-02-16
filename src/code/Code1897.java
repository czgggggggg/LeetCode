package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/2/16
 * @Description
 */
public class Code1897 {
    public static void main(String[] args) {
        String[] words1 = {"abc","aabc","bc"};
        System.out.println(makeEqual(words1));//ture

        String[] words2 = {"ab","a"};
        System.out.println(makeEqual(words2));//false

        String[] words3 = {"a","a"};
        System.out.println(makeEqual(words3));//ture

        String[] words4 = {"b","a"};
        System.out.println(makeEqual(words4));//false
    }
    public static boolean makeEqual(String[] words) {
        int n = words.length;

        int[] count = new int[26];
        Arrays.fill(count,0);
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                count[word.charAt(i) - 97]++;
            }
        }

        for(int i = 0; i < 26; i++){
            if(count[i] % n != 0)
                return false;
        }

        return true;
    }
}
