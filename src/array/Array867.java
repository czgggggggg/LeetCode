package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array867 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans1 = transpose(matrix1);
        for(int i = 0; i < ans1.length; i++){
            for(int j = 0; j < ans1[0].length; j++){
                System.out.print(ans1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        int[][] ans2 = transpose(matrix2);
        for(int i = 0; i < ans2.length; i++){
            for(int j = 0; j < ans2[0].length; j++){
                System.out.print(ans2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        int[][] matrix3 = {{1}};
        int[][] ans3 = transpose(matrix3);
        for(int i = 0; i < ans3.length; i++){
            for(int j = 0; j < ans3[0].length; j++){
                System.out.print(ans3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
//[1,2,3]
//[4,5,6]
//--------
//[1,4]
//[2,5]
//[3,6]