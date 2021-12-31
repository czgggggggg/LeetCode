package code;

/**
 * @Author czgggggggg
 * @Date 2021/12/31
 * @Description  最大正方形
 */
public class Code0221 {
    public static void main(String[] args) {
        char[][] matrix1 = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalSquare(matrix1));//2
        char[][] matrix2 = {{'0','0','0','0','0'},{'0','0','0','0','0'},{'0','0','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(maximalSquare(matrix2));//0
        char[][] matrix3 = {{'0','0','0','0','0'}};
        System.out.println(maximalSquare(matrix3));//0
        char[][] matrix4 = {{'0','1'},{'1','0'}};
        System.out.println(maximalSquare(matrix4));//1
        char[][] matrix5 = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(maximalSquare(matrix5));//4 -> 2

        //[["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
    }
    public static int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] tmp = new int[m][n];

        int t = Math.max(m,n);//最大正方形可能的最大边长

        //初始化
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                tmp[i][j] = 0;
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '1')
                    tmp[i][j] = 1;//此时以i,j为左上角的最大正方形的边长为1。
            }
        }

        boolean flag;
        for(int k = 2; k <= t; k++){
            for(int i = 0; i < m - k + 1; i++){// i + k - 1 < m
                for(int j = 0; j < n - k + 1; j++){
                    //验证
                    flag = true;
                    if(tmp[i][j] == k - 1){//下一步可能为k
                        for(int p = i; p <= i + k - 1; p++){
                            if(matrix[p][j + k - 1] == '0'){
                                flag = false;
                                break;
                            }
                        }
                        for(int q = j; q <= j + k - 1; q++){
                            if(matrix[i + k - 1][q] == '0'){
                                flag = false;
                                break;
                            }
                        }
                        if(flag)
                        {
                            tmp[i][j] = k;
                        }
                    }
                }
            }
        }

        int max = 0;//最大正方形的边长
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                max = Math.max(max,tmp[i][j]);
            }
        }

        return max*max;//第一次提交错误的地方，返回的应该是最大正方形的面积，而非边长！
    }

//    public static int maximalSquare(char[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        short[][] tmp = new short[m][n];
//
//        int t = Math.max(m,n);//最大正方形可能的最大边长
//
//        //初始化
//        Arrays.fill(tmp,0);
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                if(matrix[i][j] == 1)
//                    tmp[i][j] = 1;//此时以i,j为左上角的最大正方形的边长为1。
//            }
//        }
//
//        for(int k = 2; k <= t; k++){
//            for(int i = 0; i < m; i++){
//                for(int j = 0; j < n; j++){
//                    //写到这里发现数组这种数据结构效率非常低，保存中间结果的tmp数组很大程度上是稀疏的，大部分元素是无效的。
//                }
//            }
//        }
//    }
}
