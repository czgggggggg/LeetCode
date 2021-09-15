package string;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2021/9/15
 * @Description
 */
public class String1880 {
    public static void main(String[] args) {
        System.out.println(isSumEqual("acb","cba","cdb"));
        System.out.println(isSumEqual("aaa","a","aab"));
        System.out.println(isSumEqual("aaa","a","aaaa"));
    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('a',0);
        hashMap.put('b',1);
        hashMap.put('c',2);
        hashMap.put('d',3);
        hashMap.put('e',4);
        hashMap.put('f',5);
        hashMap.put('g',6);
        hashMap.put('h',7);
        hashMap.put('i',8);
        hashMap.put('j',9);

        int firstNum = 0, secondNum = 0, targetNum = 0;
        int tmp = 1;
        for(int i = firstWord.length() - 1; i >= 0; i--){
            firstNum += (hashMap.get(firstWord.charAt(i)) * tmp);
            tmp *= 10;
        }
        tmp = 1;
        for(int i = secondWord.length() - 1; i >= 0; i--){
            secondNum += (hashMap.get(secondWord.charAt(i)) * tmp);
            tmp *= 10;
        }
        tmp = 1;
        for(int i = targetWord.length() - 1; i >= 0; i--){
            targetNum += (hashMap.get(targetWord.charAt(i)) * tmp);
            tmp *= 10;
        }

//        System.out.println(firstNum + "---" + secondNum + "---" + targetNum);
        return firstNum + secondNum == targetNum;
    }
}
