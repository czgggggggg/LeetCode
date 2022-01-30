package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/30
 * @Description
 */
public class Code0048 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        //7 4 1
        //8 5 2
        //9 6 3

//        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
//        rotate(matrix);
        //15 13 2 5
        //14 3 4 1
        //12 6 8 9
        //16 7 10 11

//        int[][] matrix = {{-1000}};
//        rotate(matrix);
        //-1000
    }
    public static void rotate(int[][] matrix) {
        int tmp;
        int n = matrix.length;

        int k = n / 2;//有几个圈需要旋转

        for(int i = 0; i < k; i++){//旋转每个圈
            //最外圈有 n - 1 个元素需要旋转一趟   n - 1 = n - 1 - 2 * i//i=0
            //次外圈有 n - 3 个元素需要旋转一趟   n - 3 = n - 1 - 2 * i//i=1
            //...
            //最外圈的第一趟的起始元素是[0,0]、第二趟的起始元素是[0,1]   [k,0]、[k,1]、[k,2]...
            //次外圈的第一趟的起始元素是[1,1]、第二趟的起始元素是[1,2]   [k,0]、[k,1]、[k,2]...
            //...
            //(i,i) -> (i,n-i-1) -> (n-i-1,n-i-1) -> (n-i-1,i) -> (i,i)
            //(i,i+t) -> (i+t,n-i-1) -> (n-i-1,n-i-1-t) -> (n-i-1-t,i) -> (i,i+t)
            for(int t = 0; t < n - 1 - 2 * i; t++){
                tmp = matrix[i][i + t];
                matrix[i][i + t] = matrix[n - i - 1 - t][i];
                matrix[n - i - 1 - t][i] = matrix[n - i - 1][n - i - 1 - t];
                matrix[n - i - 1][n - i - 1 - t] = matrix[i + t][n - i - 1];
                matrix[i + t][n - i - 1] = tmp;
            }
        }

        //测试
//        for(int i = 0 ; i < n; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
