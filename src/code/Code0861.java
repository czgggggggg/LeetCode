package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/2
 * @Description
 */
public class Code0861 {
    public static void main(String[] args) {
        int[][] grid1 = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        System.out.println(matrixScore(grid1));
        //39

        int[][] grid2 = {{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        System.out.println(matrixScore(grid2));
        //45

        int[][] grid3 = {{0},{1},{0}};
        System.out.println(matrixScore(grid3));
        //3

        int[][] grid4 = {{1,0},{1,1},{1,0}};
        System.out.println(matrixScore(grid4));
        //8

        int[][] grid5 = {{0}};
        System.out.println(matrixScore(grid5));
        //1
    }
    public static int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++){
            //每一行开头为0的，则进行一次行翻转
            if(grid[i][0] == 0){
                for(int j = 0; j < n; j++){
                    grid[i][j] = grid[i][j] ^ 1;
                }
            }
        }

        //每一列1的个数少于列中元素个数的一半，则进行一次列翻转
        int count;
        for(int j = 0; j < n; j++){
            count = 0;
            for(int i = 0; i < m; i++){
                if(grid[i][j] == 1)
                    count++;
            }
            if(count < (double)(m)/2){
                for(int i = 0; i < m; i++){
                    grid[i][j] = grid[i][j] ^ 1;
                }
            }
        }

        //测试
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(grid[i][j] + " ");
//            }
//            System.out.println();
//        }

        //求二进制数之和
        int res = 0;
        int num;
        int k;
        for(int i = 0; i < m; i++){
            num = 0;
            k = 1;
            for(int j = n - 1; j >= 0; j--){
                num += (grid[i][j] * k);
                k *= 2;
            }
            res += num;
        }

        return res;
    }
}
