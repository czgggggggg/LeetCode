package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array766 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix1));
        int[][] matrix2 = {{1,2},{2,2}};
        System.out.println(isToeplitzMatrix(matrix2));
        int[][] matrix3 = {{1}};
        System.out.println(isToeplitzMatrix(matrix3));
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int number;
        int i, j;

        for(j = n - 2; j >= 0; j--){
            i = 0;
            number = matrix[i][j];
            int tmpj = j;
            while(++i < m && ++tmpj < n){
                if(matrix[i][tmpj] != number)
                    return false;
            }
        }
        for(i = 1; i < m - 1; i++){
            j = 0;
            number = matrix[i][j];
            int tmpi = i;
            while(++tmpi < m && ++j < n){
                if(matrix[tmpi][j] != number){
                    return false;
                }

            }
        }

        return true;
    }
}
