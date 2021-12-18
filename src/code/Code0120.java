package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/12/18
 * @Description
 */
public class Code0120 {
    public static void main(String[] args) {
//        List<List<Integer>> triangle = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(2);
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(3);
//        list2.add(4);
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(6);
//        list3.add(5);
//        list3.add(7);
//        List<Integer> list4 = new ArrayList<>();
//        list4.add(4);
//        list4.add(1);
//        list4.add(8);
//        list4.add(3);
//        triangle.add(list1);
//        triangle.add(list2);
//        triangle.add(list3);
//        triangle.add(list4);
//        System.out.println(minimumTotal(triangle));  //11

        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(-10);
        triangle.add(list1);
        System.out.println(minimumTotal(triangle));  //-10
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] min_paths = new int[n][n];

        int[][] arr = new int[n][n];

        Iterator<List<Integer>> iterator = triangle.iterator();
        int t = 0;
        while(iterator.hasNext()){
            Iterator<Integer> integerIterator = iterator.next().iterator();
            int j = 0;
            while(integerIterator.hasNext()){
                arr[t][j] = integerIterator.next();
                j++;
            }
            t++;
        }

//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        min_paths[0][0] = arr[0][0];

        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(j == 0)
                    min_paths[i][j] = min_paths[i - 1][j] + arr[i][j];
                else if(j == i)
                    min_paths[i][j] = min_paths[i - 1][j - 1] + arr[i][j];
                else
                    min_paths[i][j] = Math.min(min_paths[i - 1][j], min_paths[i - 1][j - 1]) + arr[i][j];
            }
        }

//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(min_paths[i][j] + " ");
//            }
//            System.out.println();
//        }

        int min = Integer.MAX_VALUE;
        for(int j = 0; j < n; j++){
//            System.out.println("test---" + min_paths[n - 1][j]);
            if(min > min_paths[n - 1][j])
                min = min_paths[n - 1][j];
        }

        return min;
    }
}
