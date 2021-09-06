package string;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class String0520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));//true
        System.out.println(detectCapitalUse("FlaG"));//false
        System.out.println(detectCapitalUse("leetcode"));//true
        System.out.println(detectCapitalUse("Google"));//true
        System.out.println(detectCapitalUse("a"));//true
        System.out.println(detectCapitalUse("A"));//true
        System.out.println(detectCapitalUse("aA"));//false
        System.out.println(detectCapitalUse("Aa"));//true
    }
    public static boolean detectCapitalUse(String word) {
//        int lower_count = 0;
        int upper_count = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
//            if(ch >= 'a' && ch <= 'z')
//                lower_count++
            if(ch >= 'A' && ch <= 'Z')
                upper_count++;
        }

        if(upper_count > 1){//有多个大写字母
            if(upper_count == word.length())
                return true;
            else
                return false;
        }else if(upper_count == 1){//有一个大写字母
            if(word.length() > 1){//长度大于1的字符串
                if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
                    return true;//首字母大写
                else
                    return false;//首字母非大写
            }else{
                return true;//字符串只有一个大写字母
            }
        }

        return true;//剩余的就是没有大写字母的情况（长度大于等于1）
    }
}
