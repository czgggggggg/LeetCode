package code;

/**
 * @Author czgggggggg
 * @Date 2022/2/1
 * @Description
 */
public class Code0498 {
    public static void main(String[] args) {
//        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
//        int[] res = findDiagonalOrder(mat);
//        for(int num : res)
//            System.out.print(num + " ");
        //1 2 4 7 5 3 6 8 9

//        int[][] mat = {{1,2},{3,4}};
//        int[] res = findDiagonalOrder(mat);
//        for(int num : res)
//            System.out.print(num + " ");
        //1 2 3 4

//        int[][] mat = {{1}};
//        int[] res = findDiagonalOrder(mat);
//        for(int num : res)
//            System.out.print(num + " ");
        //1

//        int[][] mat = {{1,2,3,4},{5,6,7,8}};
//        int[] res = findDiagonalOrder(mat);
//        for(int num : res)
//            System.out.print(num + " ");
        //1 2 5 6 3 4 7 8

        int[][] mat = {{1,2},{3,4},{5,6},{7,8}};
        int[] res = findDiagonalOrder(mat);
        for(int num : res)
            System.out.print(num + " ");
        //1 2 3 5 4 6 7 8
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i = 0, j = 0;
        boolean isUp = true;//方向标志（true：斜向上，false：斜向下）
        int[] res = new int[m * n];
        int count = 0;

        while(count != m * n){//count == m * n 意味着遍历结束
            if(i >= 0 && i <= m - 1 && j >= 0 && j <= n - 1){//未越界
                res[count++] = mat[i][j];
                if(isUp){
                    i--;
                    j++;
                }else{
                    i++;
                    j--;
                }
            }else{//已越界
                if(isUp){//斜向上
                    if(j <= n - 1){
                        i++;
                    }else{
                        i += 2;
                        j--;
                    }
                }else{//斜向下
                    if(i <= m - 1){
                        j++;
                    }else{
                        j += 2;
                        i--;
                    }
                }
                isUp = !isUp;
            }
        }

        return res;
    }
}
