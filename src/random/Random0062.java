package random;

/**
 * @Author czgggggggg
 * @Date 2021/11/10
 * @Description
 */
public class Random0062 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
        System.out.println(uniquePaths(3,2));
        System.out.println(uniquePaths(7,3));
        System.out.println(uniquePaths(3,3));

        System.out.println(uniquePaths(1,1));
//        System.out.println(uniquePaths(10,40));
        System.out.println(uniquePaths(51,9));
    }
//    public static int uniquePaths(int m, int n) {
//        if(m == 1 || n == 1)
//            return 1;
//        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
//    }
    public static int uniquePaths(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        int[][] paths = new int[m][n];
        for(int i = 0; i < m; i++)
            paths[i][0] = 1;
        for(int j = 0; j < n; j++)
            paths[0][j] = 1;
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++)
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
        }
        return paths[m - 1][n - 1];
    }
}
//3 x 2    [0,0] -> [2,1]
//递推公式：paths(i,j) = paths(i - 1,j) + path(i, j - 1)   i>0&&j>0
//边界条件：paths(i,j) = 0   i==0||j==0
