//package code;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//
///**
// * @Author czgggggggg
// * @Date 2022/1/11
// * @Description
// */
//public class Code0017 {
//    public static void main(String[] args) {
//        letterCombinations("2379");
//    }
//    public static List<String> letterCombinations(String digits) {
//        HashMap<Character, HashSet<Character>> numToChars = new HashMap<>();
//        HashSet<Character> set_2 = new HashSet<>();
//        set_2.add('a');
//        set_2.add('b');
//        set_2.add('c');
//        numToChars.put('2',set_2);
//        HashSet<Character> set_3 = new HashSet<>();
//        set_3.add('d');
//        set_3.add('e');
//        set_3.add('f');
//        numToChars.put('3',set_3);
//        HashSet<Character> set_4 = new HashSet<>();
//        set_4.add('g');
//        set_4.add('h');
//        set_4.add('i');
//        numToChars.put('4',set_4);
//        HashSet<Character> set_5 = new HashSet<>();
//        set_5.add('j');
//        set_5.add('k');
//        set_5.add('l');
//        numToChars.put('5',set_5);
//        HashSet<Character> set_6 = new HashSet<>();
//        set_6.add('m');
//        set_6.add('n');
//        set_6.add('o');
//        numToChars.put('6',set_6);
//        HashSet<Character> set_7 = new HashSet<>();
//        set_7.add('p');
//        set_7.add('q');
//        set_7.add('r');
//        set_7.add('s');
//        numToChars.put('7',set_7);
//        HashSet<Character> set_8 = new HashSet<>();
//        set_8.add('t');
//        set_8.add('u');
//        set_8.add('v');
//        numToChars.put('8',set_8);
//        HashSet<Character> set_9 = new HashSet<>();
//        set_9.add('w');
//        set_9.add('x');
//        set_9.add('y');
//        set_9.add('z');
//        numToChars.put('9',set_9);
//
//        List<String> res = new ArrayList<>();
//        char ch;
//        for(int i = 0; i < digits.length(); i++){
//            ch = digits.charAt(i);
//            HashSet<Character> set = numToChars.get(ch);
//            System.out.println(set.size());
//        }
//
//        return res;
//    }
//}
