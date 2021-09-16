package interview;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/16
 * @Description
 */
public class Interview01_01 {
    public static void main(String[] args) {
        System.out.println(isUnique("leetcode"));
        System.out.println(isUnique("abc"));
        System.out.println(isUnique(""));
    }
    public static boolean isUnique(String astr) {
        HashSet<Character> hashSet = new HashSet<>();
        for(int i = 0; i < astr.length(); i++){
            hashSet.add(astr.charAt(i));
        }

        return hashSet.size() == astr.length();
    }
}
