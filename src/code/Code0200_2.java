package code;

/**
 * @Author czgggggggg
 * @Date 2022/4/15
 * @Description
 */
public class Code0200_2 {
    public static int m, n;

    public static void main(String[] args) {
        char[][] grid1 = {{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        System.out.println(numIslands(grid1));
        //1

        char[][] grid2 = {{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        System.out.println(numIslands(grid2));
        //3

        char[][] grid3 = {{'1'}};
        System.out.println(numIslands(grid3));
        //1
    }

    public static int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;

        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void dfs(char[][] grid, int x, int y){
        if(x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != '1')
            return;

        grid[x][y] = '2';
        dfs(grid,x - 1, y);
        dfs(grid,x + 1, y);
        dfs(grid,x, y - 1);
        dfs(grid,x, y + 1);
    }
}
