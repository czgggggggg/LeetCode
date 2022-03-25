package code;

/**
 * @Author czgggggggg
 * @Date 2022/3/25
 * @Description
 */
public class Code0084 {
    public static void main(String[] args) {
        int[] height1 = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea (height1));//10
        int[] height2 = {3,2,6,5,1,2};
        System.out.println(largestRectangleArea(height2));//10
        int[] height3 = {2,4};
        System.out.println(largestRectangleArea(height3));//4
        int[] height4 = {2,4,6,8};
        System.out.println(largestRectangleArea(height4));//12
        int[] height5 = {2,8,6,4};
        System.out.println(largestRectangleArea(height5));//12
        int[] height6 = {4,8,6,4};
        System.out.println(largestRectangleArea(height6));//16
        int[] height7 = {1};
        System.out.println(largestRectangleArea(height7));//1
        int[] height8 = {2,1,2};
        System.out.println(largestRectangleArea(height8));//3
    }

//    public static int largestRectangleArea(int[] heights) {
//        //正向
//        int res1 = largestRectangleArea2(heights);
//
//        //反向
//        int tmp;
//        int n = heights.length;
//        for(int i = 0; i < n / 2; i++){
//            tmp = heights[i];
//            heights[i] = heights[n - i - 1];
//            heights[n - i - 1] = tmp;
//        }
//        int res2 = largestRectangleArea2(heights);
//
//        return Math.max(res1,res2);
//    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = Integer.MIN_VALUE;

        int left, right;
        for(int i = 0; i < n; i++){
            max = Math.max(max, heights[i]);
            left = 0;
            right = n - 1;

            for(int j = i + 1; j < n; j++){
                if(heights[i] > heights[j]){//i, i+1, ..., j-1
                    right = j - 1;
                    break;
                }
            }
            for(int j = i - 1; j >= 0; j--){
                if(heights[i] > heights[j]){
                    left = j + 1;
                    break;
                }
            }
            max = Math.max(max, heights[i] * (right - left + 1));
        }

        return max;
    }
}
//v0.1
//通过测试用例：62 / 98
//输入：[2,1,2]
//输出：2
//预期结果：3

//v0.2
//超时