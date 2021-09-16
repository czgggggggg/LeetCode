package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/16
 * @Description
 */
public class String1967 {
    public static void main(String[] args) {
        String[] patterns1 = {"a","abc","bc","d"};
        String word1 = "abc";
        System.out.println(numOfStrings(patterns1,word1));
        String[] patterns2 = {"a","b","c"};
        String word2 = "aaaaabbbbb";
        System.out.println(numOfStrings(patterns2,word2));
        String[] patterns3 = {"a","a","a"};
        String word3 = "ab";
        System.out.println(numOfStrings(patterns3,word3));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int result = 0;
        for(int i = 0; i < patterns.length; i++){
            if(word.contains(patterns[i]))
                result++;
        }
        return result;
    }
}
