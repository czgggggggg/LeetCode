package math;

/**
 * @Author czgggggggg
 * @Date 2021/9/18
 * @Description
 */
public class Math0492 {
    public static void main(String[] args) {
        int[] result1 = constructRectangle(4);
        System.out.println("L:" + result1[0] + ",W:" + result1[1]);//L:2,W:2
        int[] result2 = constructRectangle(6);
        System.out.println("L:" + result2[0] + ",W:" + result2[1]);//L:3,W:2
        int[] result3 = constructRectangle(16);
        System.out.println("L:" + result3[0] + ",W:" + result3[1]);//L:4,W:4
        int[] result4 = constructRectangle(98);
        System.out.println("L:" + result4[0] + ",W:" + result4[1]);//L:14,W:7
    }
    public static int[] constructRectangle(int area) {
        int[] result = new int[2];
        for(int i = (int)Math.sqrt(area); i >= 1; i--){
//            System.out.println("test---i---" + i);
            if(area % i == 0){
                result[0] = area / i;
                result[1] = i;//因为i<=(int)Math.sqrt(area)，而且在减小，所以i一定小于area / i，可以直接作为矩形的宽度。
                break;//重要
            }
        }
        return result;
    }
}
