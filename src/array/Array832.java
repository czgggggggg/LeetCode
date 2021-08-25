package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array832 {
    public static void main(String[] args) {
        int[][] image1 = {{1,1,0},{1,0,1},{0,0,0}};
        image1 = flipAndInvertImage(image1);
        for(int i = 0; i < image1.length; i++){
            for(int j = 0; j < image1[0].length; j++){
                System.out.print(image1[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        int tmp;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n / 2; j++) {
                tmp = image[i][j];
                image[i][j] = image[i][n - j - 1];
                image[i][n - j - 1] = tmp;
            }
            for(int j = 0; j < n; j++){
                image[i][j] ^= 1;
            }
        }
        return image;
    }
}
