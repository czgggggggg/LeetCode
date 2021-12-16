package code;

/**
 * @Author czgggggggg
 * @Date 2021/12/16
 * @Description
 */
public class Code0064 {
    public static void main(String[] args) {
        int[][] grid1 = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid1));

        int[][] grid2 = {{1,2,3},{4,5,6}};
        System.out.println(minPathSum(grid2));

        int[][] grid3 = {{0}};
        System.out.println(minPathSum(grid3));
    }
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int min_paths[][] = new int[m][n];

        //边界计算
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += grid[0][i];
            min_paths[0][i] = sum;
        }
        sum = 0;
        for(int i = 0; i < m; i++){
            sum += grid[i][0];
            min_paths[i][0] = sum;
        }

        //计算
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                min_paths[i][j] = Math.min(min_paths[i - 1][j],min_paths[i][j - 1]);
                min_paths[i][j] += grid[i][j];
            }
        }

        return min_paths[m - 1][n - 1];
    }
}
