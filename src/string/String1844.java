package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1844 {
    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
        System.out.println(replaceDigits("a1b2c3d4e"));
        System.out.println(replaceDigits("y1"));
        System.out.println(replaceDigits("y"));
        System.out.println(replaceDigits("x2y1"));
    }
    public static String replaceDigits(String s) {
        String result = "";

        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(i % 2 == 0){
                result += ch;
            }else{
                result += ((char)(s.charAt(i - 1) + (ch - 48)));
            }
        }

        return result;
    }
}
