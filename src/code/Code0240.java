package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/1
 * @Description
 */
public class Code0240 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target1 = 5;
        System.out.println(searchMatrix(matrix1, target1));
        //true

        int[][] matrix2 = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target2 = 20;
        System.out.println(searchMatrix(matrix2, target2));
        //false

        int[][] matrix3 = {{1000000000}};
        int target3 = -1000000000;
        System.out.println(searchMatrix(matrix3, target3));
        //false
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int m_tag = 0;
        int n_tag = 0;

        //定位m_tag、n_tag
        for(int i = 1; i < m; i++){
            if(matrix[i][0] < target){
                m_tag++;
            }else if(matrix[i][0] == target){
                return true;
            }else{
                break;
            }
        }
        for(int j = 1; j < n; j++){
            if(matrix[0][j] < target){
                n_tag++;
            }else if(matrix[0][j] == target){
                return true;
            }else{
                break;
            }
        }

        //缩小范围后，暴力搜索
        for(int i = 0; i <= m_tag; i++){
            for(int j = 0; j <= n_tag; j++){
                if(matrix[i][j] == target)
                    return true;
                else if(matrix[i][j] > target){
                    break;//直接跳转到下一行进行搜索
                }
            }
        }

        return false;
    }
}
