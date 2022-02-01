package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/1
 * @Description
 */
public class Code0074 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target1 = 3;
        System.out.println(searchMatrix(matrix1,target1));
        //true

        int[][] matrix2 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target2 = 13;
        System.out.println(searchMatrix(matrix2,target2));
        //false

        int[][] matrix3 = {{-10000}};
        int target3 = 10000;
        System.out.println(searchMatrix(matrix3,target3));
        //false
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int m1;
        if(m == 1){
            for(int j = 0; j < n; j++){
                if(matrix[0][j] == target)
                    return true;
            }
        }
        else{
            for(int i = 0; i < m - 1; i++){
                if(matrix[i][0] == target || matrix[i + 1][0] == target){
                    return true;
                }
                if(matrix[i][0] < target && matrix[i + 1][0] > target){
                    m1 = i;
                    for(int j = 0; j < n; j++){
                        if(matrix[m1][j] == target)
                            return true;
                    }
                    break;
                }
                if(i + 1 == m - 1 && matrix[i + 1][0] < target){
                    m1 = i + 1;
                    for(int j = 0; j < n; j++){
                        if(matrix[m1][j] == target)
                            return true;
                    }
                    break;
                }
            }
        }

        return false;
    }
}
