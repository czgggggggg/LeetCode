package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/15
 * @Description
 */
public class Code0221_2 {
    public static void main(String[] args) {
        char[][] matrix1 = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalSquare(matrix1));//2
        char[][] matrix2 = {{'0','0','0','0','0'},{'0','0','0','0','0'},{'0','0','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(maximalSquare(matrix2));//0
        char[][] matrix3 = {{'0','0','0','0','0'}};
        System.out.println(maximalSquare(matrix3));//0
        char[][] matrix4 = {{'0','1'},{'1','0'}};
        System.out.println(maximalSquare(matrix4));//1
        char[][] matrix5 = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalSquare(matrix5));//4 -> 2
    }
    public static int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];

        int max = 0;
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == '1'){
                dp[i][0] = 1;
                max = 1;
            }

        }
        for(int j = 0; j < n; j++){
            if(matrix[0][j] == '1'){
                dp[0][j] = 1;
                max = 1;
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == '0')
                    dp[i][j] = 0;
                else{
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }

        return max * max;
    }
}
