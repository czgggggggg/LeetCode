package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/2/21
 * @Description
 */
public class Code0784 {
    public static void main(String[] args) {
//        List<String> list = letterCasePermutation("a1b2");
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
//        System.out.println();
        //a1b2 a1B2 A1b2 A1B2

//        List<String> list = letterCasePermutation("3z4");
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
//        System.out.println();
        //3z4 3Z4

        List<String> list = letterCasePermutation("z");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //z Z
    }
    public static List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        int preIndex = -1;
        StringBuilder sb = new StringBuilder();

        dfs(res,preIndex,sb,s);

        return res;
    }
    public static void dfs(List<String> res, int preIndex, StringBuilder sb, String s){
        if(preIndex == s.length() - 1){
            res.add(sb.toString());
            return;
        }

        char ch;

        ch = s.charAt(preIndex + 1);

        sb.append(ch);
        preIndex++;
        dfs(res,preIndex,sb,s);
        sb.deleteCharAt(sb.length() - 1);
        preIndex--;

        if(ch >= 65 && ch <= 90){//A~Z
            ch += 32;
            sb.append(ch);
            preIndex++;
            dfs(res,preIndex,sb,s);
            sb.deleteCharAt(sb.length() - 1);
            preIndex--;
        }else if(ch >= 97 && ch <= 122){//a~z
            ch -= 32;
            sb.append(ch);
            preIndex++;
            dfs(res,preIndex,sb,s);
            sb.deleteCharAt(sb.length() - 1);
            preIndex--;
        }
    }
}
