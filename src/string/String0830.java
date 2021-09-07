package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/9/7
 * @Description
 */
public class String0830 {
    public static void main(String[] args) {
//        List<List<Integer>> lists = largeGroupPositions("abbxxxxzzy");
//        List<List<Integer>> lists = largeGroupPositions("abc");
//        List<List<Integer>> lists = largeGroupPositions("abcdddeeeeaabbbcd");
//        List<List<Integer>> lists = largeGroupPositions("aba");
//        List<List<Integer>> lists = largeGroupPositions("aabbbaabbbaaa");
        List<List<Integer>> lists = largeGroupPositions("aaabaaa");
        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }

    }
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lists = new ArrayList<>();

        if(s.length() < 3)
            return lists;

        int count = 1;
        int start = 0;
        int end = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
                end = i;
            }
            if(s.charAt(i) != s.charAt(i - 1) || i == s.length() - 1){
                //第一步
                if(count >= 3){
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(end);
                    lists.add(list);
                }
                //第二步，重置
                count = 1;
                start = i;
                end = i;
            }
        }

        return lists;
    }
}
