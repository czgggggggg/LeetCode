package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/15
 * @Description
 */
public class String1876 {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
        System.out.println(countGoodSubstrings("a"));
        System.out.println(countGoodSubstrings("ab"));
        System.out.println(countGoodSubstrings("abc"));
        System.out.println(countGoodSubstrings("aaa"));
    }
    public static int countGoodSubstrings(String s) {
        if(s.length() < 3)
            return 0;

        int count = 0;
        for(int i = 0; i < s.length() - 2; i++){
            if(s.charAt(i) != s.charAt(i + 1) && s.charAt(i + 1) != s.charAt(i + 2) && s.charAt(i) != s.charAt(i + 2))
                count++;
        }

        return count;
    }
}
