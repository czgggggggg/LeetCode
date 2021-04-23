package jzOffer.offer21_30;
/**
* @Author czgggggggg
* @Date 2021/2/19
* @Description 顺时针打印矩阵
* @Since version-1.0
*/
public class Offer29 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12}};
        int[][] matrix3 = {};

        int[] result1 = spiralOrder(matrix1);
        for(int i = 0; i < result1.length; i++){
            System.out.print(result1[i] + " ");
        }
        System.out.println();

        int[] result2 = spiralOrder(matrix2);
        for(int i = 0; i < result2.length; i++){
            System.out.print(result2[i] + " ");
        }
        System.out.println();

        //没看限制条件，导致了Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        //0 <= matrix.length <= 100
        //0 <= matrix[i].length <= 100
        int[] result3 = spiralOrder(matrix3);
        for(int i = 0; i < result3.length; i++){
            System.out.print(result3[i] + " ");
        }
        System.out.println();
    }

    public static int[] spiralOrder(int[][] matrix) {

        //注意：要判读m、n是否为0！
        int m = matrix.length;
        if(m == 0)
            return new int[0];
        int n = matrix[0].length;
        if(n == 0)
            return new int[0];

        int[] result = new int[m * n];
        int count = 0;//result数组当前下标，也可以理解为计数器
        boolean[][] tag = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                tag[i][j] = false;//二维数组元素的tag值初始化为false（未遍历）
            }
        }
        int i = 0;
        int j = 0;
        while(count < m * n){//按照右 -> 下 -> 左 -> 上的顺时针次序遍历
            while(j + 1 < n && tag[i][j + 1] == false){//右
                tag[i][j] = true;//标记为已遍历
                result[count++] = matrix[i][j];//将当前遍历的元素保存到result数组中
                j++;
            }
            while(i + 1 < m && tag[i + 1][j] == false){//下
                tag[i][j] = true;//标记为已遍历
                result[count++] = matrix[i][j];//将当前遍历的元素保存到result数组中
                i++;
            }
            while(j - 1 >= 0 && tag[i][j - 1] == false){//左
                tag[i][j] = true;//标记为已遍历
                result[count++] = matrix[i][j];//将当前遍历的元素保存到result数组中
                j--;
            }
            while(i - 1 >= 0 && tag[i - 1][j] == false){//上
                tag[i][j] = true;//标记为已遍历
                result[count++] = matrix[i][j];//将当前遍历的元素保存到result数组中
                i--;
            }
            //最后一个遍历的元素要单独处理
            if(count == m * n - 1){
                result[count++] = matrix[i][j];
            }
        }
        return result;
    }
}
