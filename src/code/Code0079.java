package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/20
 *       2022/8/23
 * @Description
 */
public class Code0079 {
    public static void main(String[] args) {
        char[][] board1 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word1 = "ABCCED";
        System.out.println(exist(board1, word1));//true
        char[][] board2 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word2 = "SEE";
        System.out.println(exist(board2, word2));//true
        char[][] board3 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word3 = "ABCB";
        System.out.println(exist(board3, word3));//false
        char[][] board4 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word4 = "ABCCFDEE";
        System.out.println(exist(board4, word4));//true
        char[][] board5 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word5 = "ABA";
        System.out.println(exist(board5, word5));//false
        char[][] board6 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word6 = "F";
        System.out.println(exist(board6, word6));//true

    }
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] tag = new boolean[m][n];//标记是否被扫过
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
               if(dfs(board, word, tag, -1, i, j - 1, 1)){
                   return true;
               }
            }
        }

        return false;
    }

    public static boolean dfs(char[][] board, String word, boolean[][] tag, int cur, int i, int j, int k){
        cur++;
        if(cur == word.length()){
            return true;
        }
        switch (k) {
            case 1:
                j++;
                break;
            case 2:
                i++;
                break;
            case 3:
                j--;
                break;
            case 4:
                i--;
                break;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return false;
        }

        char ch = word.charAt(cur);
        if(tag[i][j] || ch != board[i][j]){
            return false;
        }else{
            tag[i][j] = true;
            //右、下、左、上
            if(dfs(board, word, tag, cur, i, j, 1)){
                return true;
            }
            if(dfs(board, word, tag, cur, i, j, 2)){
                return true;
            }
            if(dfs(board, word, tag, cur, i, j, 3)){
                return true;
            }
            if(dfs(board, word, tag, cur, i, j, 4)){
                return true;
            }
            tag[i][j] = false;
            return false;
        }
    }
}
