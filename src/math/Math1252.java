package math;

/**
 * @Author czgggggggg
 * @Date 2021/9/22
 * @Description
 */
public class Math1252 {
    public static void main(String[] args) {
        int[][] indices1 = {{0,1},{1,1}};
        System.out.println(oddCells(2,3,indices1));
        int[][] indices2 = {{1,1},{0,0}};
        System.out.println(oddCells(2,2,indices2));
        int[][] indices3 = {{0,0}};
        System.out.println(oddCells(1,1,indices3));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = 0;
            }
        }

        for(int k = 0; k < indices.length; k++){
            for(int j = 0; j < n; j++)
                arr[indices[k][0]][j]++;
            for(int i = 0; i < m; i++)
                arr[i][indices[k][1]]++;
        }

        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
//                System.out.println(arr[i][j]);
                if(arr[i][j] % 2 == 1)
                    count++;
            }
        }

        return count;
    }
}
