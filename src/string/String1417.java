package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/11
 * @Description
 */
public class String1417 {
    public static void main(String[] args) {
        System.out.println(reformat("a0b1c2"));
        System.out.println(reformat("leetcode"));
        System.out.println(reformat("1229857369"));
        System.out.println(reformat("covid2019"));
        System.out.println(reformat("ab123"));

        System.out.println(reformat("1a1a1"));
        System.out.println(reformat("1a1a11"));
        System.out.println(reformat("1a1aa"));
        System.out.println(reformat("1a1aaa"));

        System.out.println(reformat("a"));
        System.out.println(reformat("aa"));
    }
    public static String reformat(String s) {
        if(s.length() == 1)
            return s;

        String resultStr = "";

        int letter_count = 0;
        int digit_count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 97 && s.charAt(i) <= 123)
                letter_count++;
            else
                digit_count++;
        }

        if(letter_count >= (digit_count + 2) || digit_count >= (letter_count + 2))
            return "";

        int letter_pre = 0;
        int digit_pre = 0;
        if(letter_count >= digit_count){
            while(letter_pre < s.length() && digit_pre < s.length()){
//                System.out.println("test1");
                //先字母
                while(!(s.charAt(letter_pre) >= 97 && s.charAt(letter_pre) <= 123) && letter_pre < s.length()){
                    letter_pre++;
                    if(letter_pre >= s.length())
                        break;
                }
                if(letter_pre < s.length()){
                    resultStr += s.charAt(letter_pre);
//                    System.out.println("test2---letter_pre---" + letter_pre);
                    letter_pre++;
                }
                //后数字
                while(s.charAt(digit_pre) >= 97 && s.charAt(digit_pre) <= 123 && digit_pre < s.length()){
                    digit_pre++;
                    if(digit_pre >= s.length())
                        break;
                }
                if(digit_pre < s.length()){
                    resultStr += s.charAt(digit_pre);
//                    System.out.println("test2---digit_pre---" + digit_pre);
                    digit_pre++;
                }
            }
            if(letter_pre < s.length()){
                //字母可能有多余
                while(!(s.charAt(letter_pre) >= 97 && s.charAt(letter_pre) <= 123) && letter_pre < s.length()){
                    letter_pre++;
                    if(letter_pre >= s.length())
                        break;
                }
                if(letter_pre < s.length()){
                    resultStr += s.charAt(letter_pre);
//                System.out.println("test3---letter_pre---" + letter_pre);
                    letter_pre++;
                }
            }
        }else{
            while(letter_pre < s.length() && digit_pre < s.length()){
                //先数字
                while(s.charAt(digit_pre) >= 97 && s.charAt(digit_pre) <= 123 && digit_pre < s.length()){
                    digit_pre++;
                    if(digit_pre >= s.length())
                        break;
                }
                if(digit_pre < s.length()){
                    resultStr += s.charAt(digit_pre);
                    digit_pre++;
                }
                //后字母
                while(!(s.charAt(letter_pre) >= 97 && s.charAt(letter_pre) <= 123) && letter_pre < s.length()){
                    letter_pre++;
                    if(letter_pre >= s.length())
                        break;
                }
                if(letter_pre < s.length()){
                    resultStr += s.charAt(letter_pre);
                    letter_pre++;
                }
            }
            if(digit_pre < s.length()){
                //数字有多余
                while(s.charAt(digit_pre) >= 97 && s.charAt(digit_pre) <= 123 && digit_pre < s.length()){
                    digit_pre++;
                    if(digit_pre >= s.length())
                        break;
                }
                if(digit_pre < s.length()){
                    resultStr += s.charAt(digit_pre);
                    digit_pre++;
                }
            }
        }

        return resultStr;
    }
}
