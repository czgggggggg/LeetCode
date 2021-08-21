package array;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2021/8/21
 * @Description
 */
public class Array500 {
    public static void main(String[] args) {
//        String[] words1 = {"Hello","Alaska","Dad","Peace"};
//        String[] words1 = {"omk"};
        String[] words1 = {"adsdf","sfd"};
        String[] results1 = findWords(words1);
        for(String result1 : results1){
            System.out.print(result1 + " ");
        }
        System.out.println();
    }

    public static String[] findWords(String[] words) {
        Character[] chars1 = {'Q', 'q', 'W', 'w', 'E', 'e', 'R', 'r', 'T', 't', 'Y', 'y', 'U', 'u', 'I', 'i', 'O', 'o', 'P', 'p'};
        Character[] chars2 = {'A', 'a', 'S', 's', 'D', 'd', 'F', 'f', 'G', 'g', 'H', 'h', 'J', 'j', 'K', 'k', 'L', 'l'};
        Character[] chars3 = {'Z', 'z', 'X', 'x', 'C', 'c', 'V', 'v', 'B', 'b', 'N', 'n', 'M', 'm'};
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> set3 = new HashSet<>();
        set1.addAll(Arrays.asList(chars1));
        set2.addAll(Arrays.asList(chars2));
        set3.addAll(Arrays.asList(chars3));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int tag1 = 0, tag2 = 0, tag3 = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (set1.contains(words[i].charAt(j))) {
                    tag1 = 1;
                } else if (set2.contains(words[i].charAt(j))) {
                    tag2 = 1;
                } else if (set3.contains(words[i].charAt(j))) {
                    tag3 = 1;
                }
            }
            int count = 0;
            if (tag1 == 1)
                count++;
            if (tag2 == 1)
                count++;
            if (tag3 == 1)
                count++;
            if (count == 1) {
                list.add(words[i]);
            }
        }
        String[] strings = new String[list.size()];
        int i = 0;
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            strings[i++] = iterator.next();
        }
        return strings;
    }
}
