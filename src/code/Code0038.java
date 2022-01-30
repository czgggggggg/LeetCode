package code;

import java.util.HashMap;

/**
 * @Author czgggggggg
 * @Date 2022/1/30
 * @Description
 */
public class Code0038 {
    public static void main(String[] args) {
//        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
//                          {'6','.','.','1','9','5','.','.','.'},
//                          {'.','9','8','.','.','.','.','6','.'},
//                          {'8','.','.','.','6','.','.','.','3'},
//                          {'4','.','.','8','.','3','.','.','1'},
//                          {'7','.','.','.','2','.','.','.','6'},
//                          {'.','6','.','.','.','.','2','8','.'},
//                          {'.','.','.','4','1','9','.','.','5'},
//                          {'.','.','.','.','8','.','.','7','9'}};
//        System.out.println(isValidSudoku(board));
        //true

        char[][] board = {{'8','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
        //false
    }

    public static boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 9; i++){
            map.clear();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(!map.keySet().contains(board[i][j]))
                        map.put(board[i][j], 1);
                    else{
                        if(map.get(board[i][j]) == 1){
                            return false;
                        }
                    }
                }
            }
        }

        for(int j = 0; j < 9; j++){
            map.clear();
            for(int i = 0; i < 9; i++){
                if(board[i][j] != '.'){
                    if(!map.keySet().contains(board[i][j]))
                        map.put(board[i][j], 1);
                    else{
                        if(map.get(board[i][j]) == 1){
                            return false;
                        }
                    }
                }
            }
        }

        int[][] tmp = {{0,0},{0,3},{0,6},{3,0},{3,3},{3,6},{6,0},{6,3},{6,6}};
        for(int t = 0; t < 9; t++){
            map.clear();
            for(int i = tmp[t][0]; i < tmp[t][0] + 3; i++){
                for(int j = tmp[t][1]; j < tmp[t][1] + 3; j++){
                    if(board[i][j] != '.'){
                        if(!map.keySet().contains(board[i][j]))
                            map.put(board[i][j], 1);
                        else{
                            if(map.get(board[i][j]) == 1){
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
