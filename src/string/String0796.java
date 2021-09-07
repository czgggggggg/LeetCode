package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class String0796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","abcde"));
        System.out.println(rotateString("abcde","eabcd"));
        System.out.println(rotateString("abcde","deabc"));
        System.out.println(rotateString("abcde","cdeab"));
        System.out.println(rotateString("abcde","bcdea"));
        System.out.println(rotateString("abcde","abced"));
    }
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        if(s.equals(goal))
            return true;

        boolean flag;
        for(int k = 1; k < s.length(); k++){
            flag = true;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != goal.charAt((i + k) % goal.length())){
                    flag = false;
                    break;
                }
            }
            if(flag){
//                System.out.println("test---k---" + k);
                return true;//有一个k满足，即成立。
            }
        }

        return false;
    }
}
