package code;

import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2022/1/11
 * @Description
 */
public class Code0073 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        HashSet<String> hashSet = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    hashSet.add(i + "-" + j);
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0 && hashSet.contains(i + "-" + j)){
                    for(int p = 0; p < m; p++){
                        matrix[p][j] = 0;//列
                    }
                    for(int q = 0; q < n; q++){
                        matrix[i][q] = 0;//行
                    }
                }
            }
        }

//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
