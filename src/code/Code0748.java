package code;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/2/7
 * @Description
 */
public class Code0748 {
    public static void main(String[] args) {
        String licensePlate1 = "1s3 PSt";
        String[] words1 = {"step", "steps", "stripe", "stepple"};
        System.out.println(shortestCompletingWord(licensePlate1,words1));
        //steps

        String licensePlate2 = "1s3 456";
        String[] words2 = {"looks", "pest", "stew", "show"};
        System.out.println(shortestCompletingWord(licensePlate2,words2));
        //pest

        String licensePlate3 = "1s3 456";
        String[] words3 = {"looks", "stew", "show"};
        System.out.println(shortestCompletingWord(licensePlate3,words3));
        //stew

        String licensePlate4 = "S";
        String[] words4 = {"s"};
        System.out.println(shortestCompletingWord(licensePlate4,words4));
        //s
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = licensePlate.length();
        char ch;
        for(int i = 0; i < n; i++){
            ch = licensePlate.charAt(i);
            if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
                if(ch >= 65 && ch <= 90){
                    ch += 32;
                }
                if(!map.keySet().contains(ch)){
                    map.put(ch, 1);
                }else{
                    map.put(ch, map.get(ch) + 1);
                }
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        int min = Integer.MAX_VALUE;
        String res = "";
        int n2;
        boolean tag;//word是否满足补全词条件 标记
        for(String word : words){
            tag = true;
            map2.clear();
            n2 = word.length();
            for(int i = 0; i < n2; i++){
                ch = word.charAt(i);
                if(!map2.keySet().contains(ch)){
                    map2.put(ch, 1);
                }else{
                    map2.put(ch, map2.get(ch) + 1);
                }
            }
            //licensePlate和word的比较
            Iterator<Character> iterator = map.keySet().iterator();
            while(iterator.hasNext()){
                Character next = iterator.next();
                if(!map2.keySet().contains(next)){
                    tag = false;//word不满足补全词条件
                    break;
                }else{
                    if(map2.get(next) < map.get(next)){
                        tag = false;//word不满足补全词条件
                        break;
                    }
                }
            }
            if(tag){//word满足补全词条件
                if(n2 < min){//该判断可以保证：当有多个单词都符合最短补全词的匹配条件时取 words 中 第一个 出现的那个。
                    min = n2;
                    res = word;
                }
            }
        }

        return res;
    }
}
