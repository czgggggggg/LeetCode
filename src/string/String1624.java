package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/13
 * @Description
 */
public class String1624 {
    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
        System.out.println(maxLengthBetweenEqualCharacters("cabbac"));
        System.out.println(maxLengthBetweenEqualCharacters("a"));
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for(int i = 0; i < s.length(); i++){
            for(int j = s.length() - 1; j >= 0; j--){
                if(s.charAt(i) == s.charAt(j)){
                    if(max < j - i)
                        max = j - i - 1;
                    break;
                }
            }
        }
        return max;
    }
}
