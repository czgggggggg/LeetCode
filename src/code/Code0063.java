package code;

/**
 * @Author czgggggggg
 * @Date 2021/12/16
 * @Description
 */
public class Code0063 {
    public static void main(String[] args) {
        int[][] obstacleGrid1 = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid1));//2

        int[][] obstacleGrid2 = {{0,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid2));//1

        int[][] obstacleGrid3 = {{1,0},{0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid3));//0

        int[][] obstacleGrid4 = {{0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid4));//1
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] paths = new int[m][n];

        //边界处理
        for(int i = 0; i < m; i++){
            if(obstacleGrid[i][0] == 1){
                for(int t = i; t < m; t++)
                    paths[i][0] = 0;
                break;
            }
            paths[i][0] = 1;
        }
        for(int j = 0; j < n; j++){
            if(obstacleGrid[0][j] == 1){
                for(int t = j; t < n; t++)
                    paths[0][j] = 0;
                break;
            }
            paths[0][j] = 1;
        }

        //障碍物
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1)
                    paths[i][j] = 0;
            }
        }

        //计算
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] != 1){
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                }
            }
        }

        return paths[m - 1][n - 1];
    }
}
