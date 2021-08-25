package array;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array804 {
    public static void main(String[] args) {
        String[] words1 = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words1));
        String[] words2 = {"ginsd","csacdasdc","csdc","vfa"};
        System.out.println(uniqueMorseRepresentations(words2));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] table = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        String str;
        for(String word : words){
            str = "";
            for(int i = 0; i < word.length(); i++){
                str += table[word.charAt(i) - 97];
            }
            set.add(str);
        }

        return set.size();
    }
}
//A 65
//a 97 -> 0