package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code1893 {
    public static void main(String[] args) {
        int[][] ranges1 = {{1,2},{3,4},{5,6}};
        System.out.println(isCovered(ranges1, 2, 5));
        //true

        int[][] ranges2 = {{1,10},{10,20}};
        System.out.println(isCovered(ranges2, 21, 21));
        //false

        int[][] ranges3 = {{1,1}};
        System.out.println(isCovered(ranges3, 1, 1));
        //true
    }
    public static boolean isCovered(int[][] ranges, int left, int right) {
        int n = ranges.length;
        int[] tmp = new int[right - left + 1];//0 -> left    ...  right - left -> right
        Arrays.fill(tmp, 0);

        for(int i = 0; i < n; i++){
            if(ranges[i][0] < left && ranges[i][1] > right){
                for(int j = left; j <= right; j++)
                    tmp[j - left] = 1;
            }else if(ranges[i][0] < left && ranges[i][1] >= left && ranges[i][1] <= right){
                for(int j = left; j <= ranges[i][1]; j++)
                    tmp[j - left] = 1;
            }else if(ranges[i][0] >= left && ranges[i][0] <= right && ranges[i][1] > right){
                for(int j = ranges[i][0]; j <= right; j++)
                    tmp[j - left] = 1;
            }else if(ranges[i][0] >= left && ranges[i][1] <= right){
                for(int j = ranges[i][0]; j <= ranges[i][1]; j++)
                    tmp[j - left] = 1;
            }
        }

        //测试
//        for(int i = 0; i < right - left + 1; i++){
//            System.out.print(tmp[i] + " ");
//        }
//        System.out.println();

        for(int i = 0; i < right - left + 1; i++){
            if(tmp[i] == 0)
                return false;
        }

        return true;
    }
}
//[[1,2],[3,4],[5,6]]
//
//[[1,10],[10,20]]
//0 1 2 .... 8 9 10 11 12 ... 19 20 21.............. 51
//  1               -1
//               1                  -1
//[[1,10],[11,20]]
//0 1 2 .... 8 9 10 11 12 ... 19 20 21.............. 51
//  1               -1
//                  1               -1
//[[1,10],[12,20]]
//0 1 2 .... 8 9 10 11 12 ... 19 20 21.............. 51
//  1               -1
//                     1            -1