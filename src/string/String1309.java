package string;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2021/9/10
 * @Description
 */
public class String1309 {
    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));//jkab
        System.out.println(freqAlphabets("1326#"));//acz
        System.out.println(freqAlphabets("25#"));//y
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));//abcdefghijklmnopqrstuvwxyz
        System.out.println(freqAlphabets("1"));//a
        System.out.println(freqAlphabets("12"));//ab
    }
    public static String freqAlphabets(String s) {
        HashMap<Character,Character> hashMap1 = new HashMap<>();
        HashMap<String,Character> hashMap2 = new HashMap<>();
        hashMap1.put('1','a');
        hashMap1.put('2','b');
        hashMap1.put('3','c');
        hashMap1.put('4','d');
        hashMap1.put('5','e');
        hashMap1.put('6','f');
        hashMap1.put('7','g');
        hashMap1.put('8','h');
        hashMap1.put('9','i');
        hashMap2.put("10#",'j');
        hashMap2.put("11#",'k');
        hashMap2.put("12#",'l');
        hashMap2.put("13#",'m');
        hashMap2.put("14#",'n');
        hashMap2.put("15#",'o');
        hashMap2.put("16#",'p');
        hashMap2.put("17#",'q');
        hashMap2.put("18#",'r');
        hashMap2.put("19#",'s');
        hashMap2.put("20#",'t');
        hashMap2.put("21#",'u');
        hashMap2.put("22#",'v');
        hashMap2.put("23#",'w');
        hashMap2.put("24#",'x');
        hashMap2.put("25#",'y');
        hashMap2.put("26#",'z');

        String newStr = "";
        for(int i = 0; i < s.length(); i++){
            if(i + 1 < s.length() && i + 2 < s.length()){
                if(s.charAt(i + 2) == '#'){
                    newStr += hashMap2.get("" + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2));
                    i += 2;
                }else{
                    newStr += hashMap1.get(s.charAt(i));
                }
            }else{
                newStr += hashMap1.get(s.charAt(i));
            }
        }

        return newStr;
    }
}
