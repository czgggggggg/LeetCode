package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code0695 {
    static int m, n;
    static int area;//岛屿面积

    public static void main(String[] args) {
        int[][] grid1 = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                         {0,0,0,0,0,0,0,1,1,1,0,0,0},
                         {0,1,1,0,1,0,0,0,0,0,0,0,0},
                         {0,1,0,0,1,1,0,0,1,0,1,0,0},
                         {0,1,0,0,1,1,0,0,1,1,1,0,0},
                         {0,0,0,0,0,0,0,0,0,0,1,0,0},
                         {0,0,0,0,0,0,0,1,1,1,0,0,0},
                         {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid1));
        //6

        int[][] grid2 = {{0,0,0,0,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid2));
        //0

        int[][] grid3 = {{1}};
        System.out.println(maxAreaOfIsland(grid3));
        //1
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;//岛屿的最大面积

        m = grid.length;
        n = grid[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //发现独立的岛屿
                if(grid[i][j] == 1){
                    area = 0;//岛屿面积置零
                    dfs(grid, i, j);
                    //递归结束，将当前的岛屿面积和最大岛屿面积比较
                    if(area > maxArea)
                        maxArea = area;
                }
            }
        }

        return maxArea;
    }

    public static void dfs(int[][] grid, int x, int y){
        if(x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != 1)
            return;

        //grid[x][y] == 1 置零&当前岛屿面积加一
        grid[x][y] = 0;
        area++;
        dfs(grid, x - 1, y);
        dfs(grid, x + 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x, y + 1);
    }
}
