package string;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/9/14
 * @Description
 */
public class String1704 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
        System.out.println(halvesAreAlike("MerryChristmas"));
        System.out.println(halvesAreAlike("AbCdEfGh"));
    }
    public static boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('a');
        set.add('E');
        set.add('e');
        set.add('I');
        set.add('i');
        set.add('O');
        set.add('o');
        set.add('U');
        set.add('u');

        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < s.length()/2; i++){
            if(set.contains(s.charAt(i)))
                count1++;
        }
        for(int i = s.length()/2; i < s.length(); i++){
            if(set.contains(s.charAt(i)))
                count2++;
        }

        return count1 == count2;
    }
}
