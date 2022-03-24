package code;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author czgggggggg
 * @Date 2022/3/24
 * @Description
 */
public class Code0076 {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));//BANC
        System.out.println(minWindow("a","a"));//a
        System.out.println(minWindow("a","aa"));//
        System.out.println(minWindow("ADOBECODEBANNC","ABC"));//BANNC
        System.out.println(minWindow("ADOBECODEBANCC","ABC"));//BANC
        System.out.println(minWindow("cabwefgewcwaefgcf","cae"));//cwae
    }

    //v0.1
    public static String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        HashMap<Character,Integer> map = new HashMap<>();

        //将t中的字符及对应的数目存放到map中
        char ch;
        for(int i = 0; i < n; i++){
            ch = t.charAt(i);
            if(!map.keySet().contains(ch)){
                map.put(ch,1);
            }else{
                map.put(ch, map.get(ch)+1);
            }
        }

        //保存s中是t中字符的字符的下标
        int pos = 0;
        int count = 0;
        for(int i = 0; i < m; i++){
            ch = s.charAt(i);
            if(map.keySet().contains(ch)){
                count++;
            }
        }
        int[] index = new int[count];
        pos = 0;
        for(int i = 0; i < m; i++){
            ch = s.charAt(i);
            if(map.keySet().contains(ch)){
                index[pos++] = i;
            }
        }

        //寻找最小子串（双指针思想）
        int i = 0, j = 0;
        int min = Integer.MAX_VALUE;//最小子串的长度
        int min_i = -1, min_j = -1;//最小子串的首尾字符在s中的下标
        HashMap<Character, Integer> map2 = new HashMap<>();//子串对应的map
        while(j < count){
            if(!map2.keySet().contains(s.charAt(index[j]))){
                map2.put(s.charAt(index[j]),1);
            }else{
                map2.put(s.charAt(index[j]),map2.get(s.charAt(index[j]))+1);
            }
            if(!lower(map2,map)){
                break;//此时i=0,j为第一个匹配子串的最后一个字符在index数组中的下标。
            }
            j++;
        }
        if(lower(map2,map)){
            return "";
        }
        while(i < count && j < count){
            if(!lower(map2,map)){//匹配
//                System.out.println("test: " + min_i + "---" + min_j);
                if(min > index[j] - index[i] + 1){
                    min_i = index[i];
                    min_j = index[j];
                    min = min_j - min_i + 1;
//                    System.out.println(min_i + "---" + min_j);
                }
                map2.put(s.charAt(index[i]),map2.get(s.charAt(index[i])) - 1);
                i++;
            }else{//不匹配
                j++;
                if(j < count){
                    map2.put(s.charAt(index[j]),map2.get(s.charAt(index[j])) + 1);
                }
            }
        }

        return s.substring(min_i, min_j + 1);
    }

    //判断map1是否小于map2
    public static boolean lower(HashMap<Character,Integer> map1, HashMap<Character,Integer> map2){
        if(map1.keySet().size() < map2.keySet().size())
            return true;
        else{
            Iterator<Character> iterator = map2.keySet().iterator();
            while(iterator.hasNext()){
                Character ch = iterator.next();
                if(map1.get(ch) < map2.get(ch))
                    return true;
            }
        }

        return false;
    }
}

//通过测试用例：206 / 266
//输入："cabwefgewcwaefgcf" "cae"
//输出："aefgc"
//预期结果："cwae"