package code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2022/1/21
 * @Description
 */
public class Code1370 {
    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));//abccbaabccba
        System.out.println(sortString("rat"));//art
        System.out.println(sortString("leetcode"));//cdelotee
        System.out.println(sortString("ggggggg"));//ggggggg
        System.out.println(sortString("spo"));//ops

        System.out.println(sortString("a"));//a
    }
    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        int count = 1;
        for(int i = 1; i < chars.length; i++){
            if(chars[i] != chars[i - 1]){
                count++;
            }
        }

        char[] tmp = new char[count];
        tmp[0] = chars[0];
        count = 1;
        for(int i = 1; i < chars.length; i++){
            if(chars[i] != chars[i - 1]){
                tmp[count] = chars[i];
                count++;
            }
        }

        //----------------------------------//

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : chars){
            if(!map.keySet().contains(ch)){
                map.put(ch, 1);
            }else{
                map.put(ch,map.get(ch) + 1);
            }
        }

        //----------------------------------//

        StringBuilder res = new StringBuilder();
        boolean isForward = true;//正向、反向遍历标志
        boolean isFirst = true;
        int n = tmp.length;
        int k = 0;
        while(k > 0 || isFirst){
            isFirst = false;
            k = 0;

            if(isForward){
                for(int i = 0; i < n; i++){
                    if(map.get(tmp[i]) != 0){
                        map.put(tmp[i], map.get(tmp[i]) - 1);
                        res.append(tmp[i]);
                        k++;
                    }
                }
            }else{
                for(int i = n - 1; i >= 0; i--){
                    if(map.get(tmp[i]) != 0){
                        map.put(tmp[i], map.get(tmp[i]) - 1);
                        res.append(tmp[i]);
                        k++;
                    }
                }
            }

            isForward = !isForward;//调转方向
        }

        return res.toString();
    }
}
