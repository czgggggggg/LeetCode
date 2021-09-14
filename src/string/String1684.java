package string;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1684 {
    public static void main(String[] args) {
        String[] words1 = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings("ab",words1));
        String[] words2 = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings("abc",words2));
        String[] words3 = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings("cad",words3));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> charSet = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++){
            charSet.add(allowed.charAt(i));
        }

        int result = 0;
        boolean flag;
        for(int i = 0; i < words.length; i++){
            flag = true;
            for(int j = 0; j < words[i].length(); j++){
                if(!charSet.contains(words[i].charAt(j))){
                    flag = false;
                    break;
                }
            }
            if(flag)
                result++;
        }

        return result;
    }
}
