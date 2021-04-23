package jzOffer.offer11_20;
/**
* @Author czgggggggg
* @Date 2021/2/9
* @Description 矩阵中的路径
* @Since version-1.0
*/
public class Offer12 {
//    public static void main(String[] args) {
//        char[][] board = {{'A', 'B', 'C', 'E'},{'S', 'F', 'C', 'S'},{'A', 'D', 'E', 'E'}};
//        String word = "ABCCED";
//        System.out.println(exist(board, word));
//    }
//    //分析:
//    //board = [["A","B","C","E"],
//    //         ["S","F","C","S"],
//    //         ["A","D","E","E"]], word = "ABCCED"
//    //board = [["a","b"],
//    //         ["c","d"]], word = "abcd"
//    //采用DFS
//    //按照右下左上的顺序依次查找
//    public static boolean exist(char[][] board, String word) {
//        int n = board.length;
//        int m = board[0].length;
//        char start_char = word.charAt(0);//获取word的起始字符
//        boolean tag[][] = new boolean[n][m];//标记数组,标记board中的每个元素是否已经包含在当前的路径中
//        for(int i = 0; i < n; i++){//标记数组的初始化
//            for(int j = 0; j < m; j++){
//                tag[i][j] = false;
//            }
//        }
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                if(board[i][j] == start_char){//在board中找到起始点(要遍历所有的起始点,直到找到存在指定路径的起始点为止)
//                    tag[i][j] = true;
//                    board[i][j + 1]
//                    board[i + 1][j]
//                    board[i ][j - 1]
//                    board[i - 1][j]
//                }
//            }
//        }
//        return true;
//    }
}
