package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/6
 * @Description
 */
public class String0344 {
    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
        reverseString(new char[]{'h', 'a', 'n', 'n', 'a', 'h'});
        reverseString(new char[]{'h'});
        reverseString(new char[]{'/','8','.'});

    }
    public static void reverseString(char[] s) {
        char tmp;
        for(int i = 0; i < s.length/2; i++){
            tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }

        for(int i = 0; i < s.length; i++)
            System.out.print(s[i] + " ");
        System.out.println();
    }
}
