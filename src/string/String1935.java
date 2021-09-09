package string;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/9
 * @Description
 */
public class String1935 {
    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world","ad"));//1
        System.out.println(canBeTypedWords("leet code","lt"));//1
        System.out.println(canBeTypedWords("leet code","e"));//0
        System.out.println(canBeTypedWords("a","abcdefghijklmnopqrstuvwxyz"));//0
        System.out.println(canBeTypedWords("a",""));//1
        System.out.println(canBeTypedWords("a b c d e f g h i j k l m n o p q r s t u v w x y z","abcdefghijklmnopqrstuvwxyz"));//0
        System.out.println(canBeTypedWords("a b c d e f g h i j k l m n o p q r s t u v w x y","abcdefghijklmnopqrstuvwxyz"));//0
        System.out.println(canBeTypedWords("a b c d e f g h i j k l m n o p q r s t u v w x y z","abcdefghijklmnopqrstuvwxy"));//1
        System.out.println(canBeTypedWords("a b c d e f g h i j k l m n o p q r s t u v w x y z",""));//26
    }
    public static int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> hashSet = new HashSet<>();
        for(int i = 0; i < brokenLetters.length(); i++)
            hashSet.add(brokenLetters.charAt(i));

        String[] strs = text.split(" ");
        int count = 0;
        boolean flag;
        for(int i = 0; i < strs.length; i++){
            flag = true;
            for (int j = 0; j < strs[i].length(); j++){
                if(hashSet.contains(strs[i].charAt(j))){
                    flag = false;
                    break;
                }
            }
            if(flag)
                count++;
        }

        return count;
    }
}
