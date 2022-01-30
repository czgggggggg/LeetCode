package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/30
 * @Description
 */
public class Code0566 {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2},{3,4}};
        int r1 = 1, c1 = 4;
        int[][] res1 = matrixReshape(mat1,r1,c1);
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(res1[i][j] + " ");
            }
            System.out.println();
        }
        //1 2 3 4

        int[][] mat2 = {{1,2},{3,4}};
        int r2 = 2, c2 = 4;
        int[][] res2 = matrixReshape(mat2,r2,c2);
//        for(int i = 0; i < r2; i++){
//            for(int j = 0; j < c2; j++){
//                System.out.print(res1[i][j] + " ");
//            }
//            System.out.println();
//        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(res2[i][j] + " ");
            }
            System.out.println();
        }
        //1 2
        //3 4


    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if(m * n != r * c)
            return mat;

        int[][] res = new int[r][c];
        int res_i = 0, res_j = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(res_j < c){
                    res[res_i][res_j] = mat[i][j];
                }else{
                    //调整到下一行的第一个位置
                    res_j = 0;
                    res_i++;
                    res[res_i][res_j] = mat[i][j];
                }
                res_j++;
            }
        }

        return res;
    }
}

//官方题解
//class Solution {
//    public int[][] matrixReshape(int[][] nums, int r, int c) {
//        int m = nums.length;
//        int n = nums[0].length;
//        if (m * n != r * c) {
//            return nums;
//        }
//
//        int[][] ans = new int[r][c];
//        for (int x = 0; x < m * n; ++x) {
//            ans[x / c][x % c] = nums[x / n][x % n];
//        }
//        return ans;
//    }
//}