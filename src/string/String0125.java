package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/5
 * @Description
 */
public class String0125 {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));
        String s2 = "race a car";
        System.out.println(isPalindrome(s2));
        String s3= "";
        System.out.println(isPalindrome(s3));
        String s4= ",./";
        System.out.println(isPalindrome(s4));
        String s5= "a";
        System.out.println(isPalindrome(s5));
        String s6= "./,/./,.,/.,/,/.,/.,48/.,/.,.,....4";
        System.out.println(isPalindrome(s6));

//        char ch1 = '0';
//        char ch2 = '9';
//        char ch3 = 'a';
//        char ch4 = 'z';
//        System.out.println((int)ch1);
//        System.out.println((int)ch2);
//        System.out.println((int)ch3);
//        System.out.println((int)ch4);
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String newStr ="";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122)){
                newStr += ch;
            }
        }

        if(newStr.length() == 0)
            return true;

        for(int i = 0; i < newStr.length()/2; i++){
            if(newStr.charAt(i) != newStr.charAt(newStr.length() - i - 1)){
                return false;
            }
        }

        return true;
    }
}
