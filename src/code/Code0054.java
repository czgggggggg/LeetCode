package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/1/30
 * @Description
 */
public class Code0054 {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        List<Integer> list = spiralOrder(matrix);
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1 2 3 6 9 8 7 4 5

//        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        List<Integer> list = spiralOrder(matrix);
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }
        //1 2 3 4 8 12 11 10 9 5 6 7

        int[][] matrix = {{1}};
        List<Integer> list = spiralOrder(matrix);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        //1
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        int i = 0, j = 0;
        int t = 0;//方向变量
        int k = 0;//轮次

        while(true){
            if(t % 4 == 0){//向右
                if(j == n - k){
                    j--;
                    i++;
                    t++;
                }else{
                    list.add(matrix[i][j]);
                    count++;
                    j++;
                }
            }else if(t % 4 == 1){//向下
                if(i == m - k){
                    i--;
                    j--;
                    t++;
                }else{
                    list.add(matrix[i][j]);
                    count++;
                    i++;
                }
            }else if(t % 4 == 2){//向左
                if(j == k - 1){
                    j++;
                    i--;
                    t++;
                    //!!!
                    k++;//轮次加一
                }else{
                    list.add(matrix[i][j]);
                    count++;
                    j--;
                }
            }else if(t % 4 == 3){//向上
                if(i == k - 1){
                    i++;
                    j++;
                    t++;
                }else{
                    list.add(matrix[i][j]);
                    count++;
                    i--;
                }
            }

            if(count == m * n)
                break;
        }

        return list;
    }
}
//0 1 2    k = 0
//3 0 1 2  k = 1
//3 0 1 2  k = 2