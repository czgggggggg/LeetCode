package jzOffer.offer01_10;

/**
* @Author czgggggggg
* @Date 2021/1/17
* @Description 二维数组中的查找
*/
public class Offer04 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        System.out.println(findNumberIn2DArray(matrix, 5));
        System.out.println(findNumberIn2DArray(matrix, 20));
    }
    //目前的方法我感觉效率不是很高
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        //不加下面这个判断条件，会报数组越界异常：
        //java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        if((matrix.length == 0) || (matrix.length != 0 && matrix[0].length == 0)){//二维数组为空，target一定不存在。
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            if(matrix[i][0] <= target && target <= matrix[i][m - 1]){//此时target位于matrix[i]这一行，或者不存在
                for(int j = 0; j < m; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
            }
        }
        //此时二维数组遍历结束，没有找到target，target不存在。
        return false;
    }
//    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
//        int n = matrix.length;
//        int m = matrix[0].length;
//        for(int i = 0; i < n; i++){
//            if(matrix[i][m - 1] == target){//包括了所有target位于二维数组最后一列的情况
//                return true;
//            }
//            else if(matrix[i][m - 1] < target && matrix[i+1][m - 1] > target){//此时target位于matrix[i+1]这一行，或者不存在
//                for(int j = 0; j < m; j++){
//                    if(matrix[i][j] == target)
//                        return true;
//                }
//                return false;
//            }
//        }
//        //此时matrix[n - 1][m - 1] < target
//        return false;
//    }
}
