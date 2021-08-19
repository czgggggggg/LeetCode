package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/8/19
 * @Description
 */
public class Array118 {
    public static void main(String[] args) {
        List<List<Integer>> lists = generate(5);
        Iterator<List<Integer>> iterator = lists.iterator();
        while (iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                Integer next1 = iterator1.next();
                System.out.print(next1.intValue() + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        int[][] map = new int[numRows][numRows];
        map[0][0] = 1;
        List<Integer> list1 = new ArrayList<>();
        list1.add(map[0][0]);
        lists.add(list1);
        for(int i = 1; i < numRows; i++){
            map[i][0] = 1;
            map[i][i] = 1;
        }
        for(int i = 1; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j = 1; j < i; j++){
                map[i][j] = map[i - 1][j - 1] + map[i - 1][j];
                list.add(map[i][j]);
            }
            list.add(1);
            lists.add(list);
        }
        return lists;
    }
}
//[1]
//[1,1]
//[1,2,1]
//[1,3,3,1]
//[1,4,6,4,1]