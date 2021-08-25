package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array883 {
    public static void main(String[] args) {
        int[][] grid1 = {{2}};
        System.out.println(projectionArea(grid1));
        int[][] grid2 = {{1,2},{3,4}};
        System.out.println(projectionArea(grid2));
        int[][] grid3 = {{1,0},{0,2}};
        System.out.println(projectionArea(grid3));
        int[][] grid4 = {{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(projectionArea(grid4));
        int[][] grid5 = {{2,2,2},{2,1,2},{2,2,2}};
        System.out.println(projectionArea(grid5));
    }
    public static int projectionArea(int[][] grid) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0)
                    sum1++;//xy面
            }
        }

        int max;
        for(int i = 0; i < grid.length; i++){
            max = 0;
            for(int j = 0; j < grid[0].length; j++){
                if(max < grid[i][j])
                    max = grid[i][j];
            }
            sum2 += max;
        }
        for(int j = 0; j < grid[0].length; j++){
            max = 0;
            for(int i = 0; i < grid.length; i++){
                if(max < grid[i][j])
                    max = grid[i][j];
            }
            sum3 += max;
        }

        return sum1 + sum2 + sum3;
    }
}
