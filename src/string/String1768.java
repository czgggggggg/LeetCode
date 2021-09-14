package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1768 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
        System.out.println(mergeAlternately("ab","pqrs"));
        System.out.println(mergeAlternately("abcd","pq"));
    }
    public static String mergeAlternately(String word1, String word2) {
        String result = "";

        int i = 0;
        int j = 0;
        while(i < word1.length() && j < word2.length()){
            result += word1.charAt(i++);
            result += word2.charAt(j++);
        }
        while(i < word1.length())
            result += word1.charAt(i++);
        while(j < word2.length())
            result += word2.charAt(j++);

        return result;
    }
}
