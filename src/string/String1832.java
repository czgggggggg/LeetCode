package string;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1832 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }
    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++){
            set.add(sentence.charAt(i));
            if(set.size() == 26)
                return true;
        }
        return false;
    }
}
