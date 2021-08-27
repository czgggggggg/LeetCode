package array;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2021/8/27
 * @Description
 */
public class Array1051 {
    public static void main(String[] args) {
        int[] heights1 = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights1));
        int[] heights2 = {5,1,2,3,4};
        System.out.println(heightChecker(heights2));
        int[] heights3 = {1,2,3,4,5};
        System.out.println(heightChecker(heights3));
        int[] heights4 = {1};
        System.out.println(heightChecker(heights4));

    }
    public static int heightChecker(int[] heights) {
        int[] sorted_heights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted_heights);
        int sum = 0;
        for(int i = 0; i < heights.length; i++){
            if(sorted_heights[i] != heights[i])
                sum++;
        }
        return sum;
    }
}
