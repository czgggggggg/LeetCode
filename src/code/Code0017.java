package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/1/11
 * @Description
 */
public class Code0017 {
    public static void main(String[] args) {
//        List<String> list = letterCombinations("23");
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }//ad ae af bd be bf cd ce cf

        List<String> list = letterCombinations("");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }//

//        List<String> list = letterCombinations("2");
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }//a b c
    }
    public static List<String> letterCombinations(String digits) {
        HashMap<Character, HashSet<Character>> numToChars = new HashMap<>();
        HashSet<Character> set_2 = new HashSet<>();
        set_2.add('a');
        set_2.add('b');
        set_2.add('c');
        numToChars.put('2',set_2);
        HashSet<Character> set_3 = new HashSet<>();
        set_3.add('d');
        set_3.add('e');
        set_3.add('f');
        numToChars.put('3',set_3);
        HashSet<Character> set_4 = new HashSet<>();
        set_4.add('g');
        set_4.add('h');
        set_4.add('i');
        numToChars.put('4',set_4);
        HashSet<Character> set_5 = new HashSet<>();
        set_5.add('j');
        set_5.add('k');
        set_5.add('l');
        numToChars.put('5',set_5);
        HashSet<Character> set_6 = new HashSet<>();
        set_6.add('m');
        set_6.add('n');
        set_6.add('o');
        numToChars.put('6',set_6);
        HashSet<Character> set_7 = new HashSet<>();
        set_7.add('p');
        set_7.add('q');
        set_7.add('r');
        set_7.add('s');
        numToChars.put('7',set_7);
        HashSet<Character> set_8 = new HashSet<>();
        set_8.add('t');
        set_8.add('u');
        set_8.add('v');
        numToChars.put('8',set_8);
        HashSet<Character> set_9 = new HashSet<>();
        set_9.add('w');
        set_9.add('x');
        set_9.add('y');
        set_9.add('z');
        numToChars.put('9',set_9);

        List<String> res = new ArrayList<>();
        char ch;
//        for(int i = 0; i < digits.length(); i++){
//            ch = digits.charAt(i);
//            HashSet<Character> set = numToChars.get(ch);
//            System.out.println(set.size());
//        }
        StringBuilder sb = new StringBuilder();
        int size = 0;
        int n = digits.length();
        if(n == 0)
            return res;

        dfs(res,size, digits,numToChars,sb,n);

        return res;
    }
    public static void dfs(List<String> res, int size, String digits, HashMap<Character, HashSet<Character>> numToChars,StringBuilder sb,int n){
        if(size == n){
            res.add(sb.toString());
            return;
        }

        char ch = digits.charAt(size);
        HashSet<Character> set = numToChars.get(ch);
        Iterator<Character> iterator = set.iterator();
        while(iterator.hasNext()){
            Character next = iterator.next();
            sb.append(next);
            size++;
            dfs(res,size, digits,numToChars,sb,n);
            sb.deleteCharAt(sb.length() - 1);
            size--;
        }
    }
}
