package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/13
 * @Description
 */
public class String1446 {
    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
        System.out.println(maxPower("triplepillooooow"));
        System.out.println(maxPower("hooraaaaaaaaaaay"));
        System.out.println(maxPower("tourist"));
        System.out.println(maxPower("a"));
        System.out.println(maxPower("aa"));
        System.out.println(maxPower("aaa"));
        System.out.println(maxPower("ab"));
        System.out.println(maxPower("abb"));
        System.out.println(maxPower("abbb"));
    }
    public static int maxPower(String s) {
        int max = 1;
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
            }
            else{
                if(count > max)
                    max = count;
                count = 1;
            }
        }
        if(count > max)
            max = count;

        return max;
    }
}
