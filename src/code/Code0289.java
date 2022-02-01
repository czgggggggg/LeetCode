package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/1
 * @Description
 */
public class Code0289 {
    public static void main(String[] args) {
        int[][] board1 = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board1);
        //0 0 0
        //1 0 1
        //0 1 1
        //0 1 0

        int[][] board2 = {{1,1},{1,0}};
        gameOfLife(board2);
        //1 1
        //1 1

        int[][] board3 = {{1}};
        gameOfLife(board3);
        //0

    }
    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] count = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                count[i][j] = 0;//置0
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //1
                if(i - 1 >= 0){
                    if(j - 1 >= 0){
                        if(board[i - 1][j - 1] == 1)
                            count[i][j]++;
                    }
                    if(board[i - 1][j] == 1)
                        count[i][j]++;
                    if(j + 1 < n){
                        if(board[i - 1][j + 1] == 1)
                            count[i][j]++;
                    }
                }
                //2
                if(j - 1 >= 0){
                    if(board[i][j - 1] == 1)
                        count[i][j]++;
                }
                if(j + 1 < n){
                    if(board[i][j + 1] == 1)
                        count[i][j]++;
                }
                //3
                if(i + 1 < m){
                    if(j - 1 >= 0){
                        if(board[i + 1][j - 1] == 1)
                            count[i][j]++;
                    }
                    if(board[i + 1][j] == 1)
                        count[i][j]++;
                    if(j + 1 < n){
                        if(board[i + 1][j + 1] == 1)
                            count[i][j]++;
                    }
                }
            }
        }

        //测试
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(count[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(count[i][j] < 2)
                    board[i][j] = 0;
                else if(count[i][j] == 2){

                }else if(count[i][j] == 3)
                    board[i][j] = 1;
                else
                    board[i][j] = 0;
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
}
//(i-1,j-1) (i-1,j) (i-1,j+1)
//(i,j-1)   (i,j)   (i,j+1)
//(i+1,j-1) (i+1,j) (i+1,j+1)