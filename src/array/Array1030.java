package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/27
 * @Description
 */
public class Array1030 {
    public static void main(String[] args) {
        int[][] result1 = allCellsDistOrder(1,2,0,0);
        for(int i = 0; i < result1.length; i++){
            System.out.print("[" + result1[i][0] + "," + result1[i][1] +"] ");
        }
        System.out.println();
        int[][] result2 = allCellsDistOrder(2,2,0,1);
        for(int i = 0; i < result2.length; i++){
            System.out.print("[" + result2[i][0] + "," + result2[i][1] +"] ");
        }
        System.out.println();
        int[][] result3 = allCellsDistOrder(2,3,1,2);
        for(int i = 0; i < result3.length; i++){
            System.out.print("[" + result3[i][0] + "," + result3[i][1] +"] ");
        }
        System.out.println();
        int[][] result4 = allCellsDistOrder(1,1,1,1);
        for(int i = 0; i < result4.length; i++){
            System.out.print("[" + result4[i][0] + "," + result4[i][1] +"] ");
        }
    }
    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][2];
        DisObject[] disObjects = new DisObject[rows * cols];
        int count = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                disObjects[count] = new DisObject(Math.abs(i - rCenter) + Math.abs(j - cCenter),i,j);
                count++;
            }
        }

        DisObject tmp;
        //冒泡排序
        for(int i = 0; i < count - 1; i++){
            for(int j = 0; j < count - 1 - i; j++){
                if(disObjects[j].distance > disObjects[j + 1].distance){
                    tmp = disObjects[j];
                    disObjects[j] = disObjects[j + 1];
                    disObjects[j + 1] = tmp;
                }
            }
        }

        count = 0;
        for(int i = 0; i < rows * cols; i++){
            result[count][0] = disObjects[i].row;
            result[count][1] = disObjects[i].col;
            count++;
        }
        return result;
    }
    static class DisObject{
        int distance;
        int row;
        int col;

        public DisObject() {
        }

        public DisObject(int distance, int row, int col) {
            this.distance = distance;
            this.row = row;
            this.col = col;
        }
    }
}
