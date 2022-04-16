package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/15
 * @Description
 */
public class Code0695_2 {
    static int m, n;
    static int area;
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
        m = grid.length;
        n = grid[0].length;

        int res = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    area = 0;
                    dfs(grid,i,j);
                    res = Math.max(res, area);
                }
            }
        }

        return res;
    }

    public static void dfs(int[][] grid, int x, int y){
        if(x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != 1)
            return;

        grid[x][y] = 2;
        area++;
        dfs(grid, x - 1, y);
        dfs(grid, x + 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x, y + 1);
    }
}
