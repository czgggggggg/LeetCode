package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/13
 * @Description
 */
public class String1662 {
    public static void main(String[] args) {
        String[] word1_1 = {"ab", "c"};
        String[] word2_1 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1_1,word2_1));
        String[] word1_2 = {"a", "cb"};
        String[] word2_2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1_2,word2_2));
        String[] word1_3 = {"abc", "d", "defg"};
        String[] word2_3 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1_3,word2_3));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for(String str : word1)
            str1 += str;
        for(String str : word2)
            str2 += str;

        return str1.equals(str2);
    }
}
