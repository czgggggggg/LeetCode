package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/16
 * @Description
 */
public class String2000 {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
        System.out.println(reversePrefix("xyxzxe",'z'));
        System.out.println(reversePrefix("abcd",'z'));

        System.out.println(reversePrefix("abc",'c'));
        System.out.println(reversePrefix("a",'c'));
        System.out.println(reversePrefix("c",'c'));
    }
    public static String reversePrefix(String word, char ch) {
        int end = word.indexOf(ch);
        if(end == -1)
            return word;

        String result = "";
        for(int i = end; i >= 0; i--)
            result += word.charAt(i);
        result += word.substring(end + 1);

        return result;
    }
}
