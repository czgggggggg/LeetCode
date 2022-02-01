package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/1
 * @Description
 */
public class Code0059 {
    public static void main(String[] args) {
        int n1 = 3;
        int[][] matrix1 = generateMatrix(n1);
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n1; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //1 2 3
        //8 9 4
        //7 6 5

        int n2 = 1;
        int[][] matrix2 = generateMatrix(n2);
        for(int i = 0; i < n2; i++){
            for(int j = 0; j < n2; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //1

        int n3 = 4;
        int[][] matrix3 = generateMatrix(n3);
        for(int i = 0; i < n3; i++){
            for(int j = 0; j < n3; j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //1 2 3 4
        //12 13 14 5
        //11 16 15 6
        //10 9 8 7

    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int k = 0;
        int count = 0;//轮次
        int num = 1;

        int i = 0, j = 0;

        while(true){
            if(k % 4 == 0){//右
                if(j < n - count){
                    matrix[i][j] = num++;
                    j++;
                }else{
                    i++;
                    j--;
                    k++;
                }
            }else if(k % 4 == 1){//下
                if(i < n - count){
                    matrix[i][j] = num++;
                    i++;
                }else{
                    i--;
                    j--;
                    k++;
                }
            }else if(k % 4 == 2){//左
                if(j >= count){
                    matrix[i][j] = num++;
                    j--;
                }else{
                    i--;
                    j++;
                    k++;
                    //轮次加一
                    count++;
                }
            }else if(k % 4 == 3){//上
                if(i >= count){
                    matrix[i][j] = num++;
                    i--;
                }else{
                    i++;
                    j++;
                    k++;
                }
            }

            if(count == n * n)
                break;
        }

        return matrix;
    }
}
//0 1 2 3
//右 下 左 上
//0 1 2
//3 0 1 2
//3 0 1 2
//...
