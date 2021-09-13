package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/13
 * @Description
 */
public class String1455 {
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger","burg"));
        System.out.println(isPrefixOfWord("this problem is an easy problem","pro"));
        System.out.println(isPrefixOfWord("i am tired","you"));
        System.out.println(isPrefixOfWord("i use triple pillow","pill"));
        System.out.println(isPrefixOfWord("hello from the other side","they"));
    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] strs = sentence.split(" ");
        for(int i = 0; i < strs.length; i++){
            if(strs[i].startsWith(searchWord))
                return i + 1;
        }

        return -1;
    }
}
