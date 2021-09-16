package string;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2021/9/16
 * @Description
 */
public class String1974 {
    public static void main(String[] args) {
        System.out.println(minTimeToType("abc"));
        System.out.println(minTimeToType("bza"));
        System.out.println(minTimeToType("zjpc"));
        System.out.println(minTimeToType("a"));
        System.out.println(minTimeToType("b"));
    }
    public static int minTimeToType(String word) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i = 97; i <= 123; i++){
            hashMap.put((char)(i),i - 97);//a->0 b->1 c->2 z->25
        }

        int result = 0;
        char ch1,ch2;
        int num1,num2;
        ch1 = word.charAt(0);
        num1 = hashMap.get(ch1);
        result += (num1 - 0 < 0 + 26 - num1 ? num1 - 0 : 0 + 26 - num1);
        for(int i = 1; i < word.length(); i++){
            ch1 = word.charAt(i);
            ch2 = word.charAt(i - 1);
            num1 = hashMap.get(ch1);
            num2 = hashMap.get(ch2);
            if(num1 < num2){
                result += (num2 - num1 < num1 + 26 - num2 ? num2 - num1 : num1 + 26 - num2);
            }else {
                result += (num1 - num2 < num2 + 26 - num1 ? num1 - num2 : num2 + 26 - num1);
            }
        }

        return result + word.length();
    }
}
