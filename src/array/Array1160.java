package array;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/8/27
 * @Description
 */
public class Array1160 {
    public static void main(String[] args) {
        String[] words1 = {"cat","bt","hat","tree"};
        String chars1 = "atach";
        System.out.println(countCharacters(words1,chars1));
        String[] words2 = {"hello","world","leetcode"};
        String chars2 = "welldonehoneyr";
        System.out.println(countCharacters(words2,chars2));
        String[] words3 = {"a"};
        String chars3 = "b";
        System.out.println(countCharacters(words3,chars3));
    }
    public static int countCharacters(String[] words, String chars) {
        int[] char_num = new int[26];
        Arrays.fill(char_num,0);
        for(int i = 0; i < chars.length(); i++){
            char_num[chars.charAt(i) - 97]++;
        }

        int ans = 0;
        int[] word_char_num = new int[26];
        boolean flag;
        for(int i = 0; i < words.length; i++){
            flag = true;
            Arrays.fill(word_char_num,0);
            for(int j = 0; j < words[i].length(); j++){
                word_char_num[words[i].charAt(j) - 97]++;
            }
            for(int j = 0; j < 26; j++){
//                System.out.println((char)(j + 97) + "---" + word_char_num[j]);
                if(word_char_num[j] > char_num[j]){
                    flag = false;//不满足条件的单词
                    break;
                }
            }
            if(flag){//满足条件的单词的长度加进ans中
                ans += words[i].length();
            }
//            System.out.println("---------------------");
        }

//        for(int i = 0; i < 26; i++){
//            System.out.println((char)(i + 97) + "---" + char_num[i]);
//        }

        return ans;
    }
}
