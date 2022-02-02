package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code0200 {
    static int m, n;

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
        int count = 0;//岛屿的数量

        m = grid.length;
        n = grid[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //发现独立的岛屿
                if(grid[i][j] == '1'){
                    dfs(grid, i ,j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void dfs(char[][] grid, int x, int y){
        //边界处理
        if(x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != '1')//grid[x][y]不为1，则可能为0（水）或者2（已经遍历过的陆地）
            return;
        //既不越界，又是陆地
        grid[x][y] = '2';
        dfs(grid, x, y - 1);
        dfs(grid, x, y + 1);
        dfs(grid, x - 1, y);
        dfs(grid, x + 1, y);
    }
}
