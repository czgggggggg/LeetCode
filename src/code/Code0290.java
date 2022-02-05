package code;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author czgggggggg
 * @Date 2022/2/5
 * @Description
 */
public class Code0290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        if(pattern.length()!=ss.length)
            return false;
        int n = pattern.length();
        //Map<String,Integer> maps = new HashMap<String,Integer>(n);
        Map<Character,String> map = new HashMap<Character,String>(n);
        for(int i=0; i<n;i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(ss[i])){
                    return false;
                }
            }else{
                if(map.containsValue(ss[i]))
                    return false;
                map.put(pattern.charAt(i),ss[i]);
            }
        }
        return true;
    }
}
