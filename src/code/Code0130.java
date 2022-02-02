package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code0130 {
    static int m, n;
    public static void main(String[] args) {
        char[][] board1 = {{'X','X','X','X'},
                          {'X','O','O','X'},
                          {'X','X','O','X'},
                          {'X','O','X','X'}};
        solve(board1);
        //X X X X
        //X X X X
        //X X X X
        //X O X X

        char[][] board2 = {{'X'}};
        solve(board2);
        //X

        char[][] board3 = {{'O','X','X','O'},
                           {'X','O','O','X'},
                           {'X','X','O','O'},
                           {'X','O','X','X'}};
        solve(board3);
        //O X X O
        //X O O X
        //X X O O
        //X O X X

        char[][] board4 = {{'O','O','O','O'},
                           {'O','O','O','O'},
                           {'O','O','O','O'},
                           {'O','O','O','O'}};
        solve(board4);
        //O O O O
        //O O O O
        //O O O O
        //O O O O
    }
    public static void solve(char[][] board) {
        m = board.length;
        n = board[0].length;

        //从矩阵的所有边界出发
        //首尾行
        for(int j = 0; j < n; j++){
            dfs(board, 0, j);
            dfs(board, m - 1, j);
        }
        //首尾列
        for(int i = 1; i < m - 1; i++){
            dfs(board, i,0);
            dfs(board, i, n - 1);
        }

        //最后的处理
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'A')
                    board[i][j] = 'O';
                else if(board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }

        //测试
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
    }
    public static void dfs(char[][] board, int x, int y){
        //边界处理
        if(x < 0 || x >= m || y < 0 || y >= n || board[x][y] != 'O')
            return;

        //标记为已遍历（是边界的O，或者是和边界的O直接间接相邻的O）
        board[x][y] = 'A';
        dfs(board, x - 1, y);
        dfs(board, x + 1, y);
        dfs(board, x, y - 1);
        dfs(board, x, y + 1);
    }
}
