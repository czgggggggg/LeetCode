package code;

import java.util.Arrays;

/**
 * @Author czgggggggg
 * @Date 2022/3/24
 * @Description
 */
public class Code0042 {
    public static void main(String[] args) {
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height1));//6

        int[] height2 = {4,2,0,3,2,5};
        System.out.println(trap(height2));//9

        //特例
        int[] height3 = {1};
        System.out.println(trap(height3));//0
        int[] height4 = {1,1,1,1,1};
        System.out.println(trap(height4));//0
        int[] height5 = {1,1,5,1,1};
        System.out.println(trap(height5));//0

        int[] height6 = {0,0,3,1,4,2,1,4,1,2,6,0,6,0,6,2,1,4,1,2,4,1,3,0,0};
        System.out.println(trap(height6));//36
    }
    public static int trap(int[] height) {
        int n = height.length;
        if(n <= 2)
            return 0;

        //找到下一个更高点（包括相等）
        int[] nextHighOrLow = new int[n];
        Arrays.fill(nextHighOrLow,-1);
        int i = 0, j = 1;
        int curHeight = height[i];
        while(j < n){
            if(curHeight <= height[j]){
                for(int t = i; t < j; t++){
                    nextHighOrLow[t] = j;
                }
                i = j;
                curHeight = height[i];
            }
            j++;
        }
        if(i < n - 1){//说明下标i及之后的点的右边没有更高点（包括相等），那么就从n-1的位置向左边反向找更高点（不包括相等）
            int tmp = i;
//            System.out.println("tmp: " + tmp);
            i = n - 1;
            j = n - 2;
            curHeight = height[i];
            while(j >= tmp){
                if(curHeight <= height[j]){
                    for(int t = i; t > j; t--){
                        nextHighOrLow[t] = j;
                    }
                    i = j;
                    curHeight = height[i];
                }
                j--;
            }
        }
//        for(int k = 0; k < n; k++){
//            System.out.print(nextHighOrLow[k] + " ");
//        }
//        System.out.println();

        int res = 0;
        //正向
        for(int k = 0; k < n; k++){
            if(nextHighOrLow[k] > k){
                //洼地必须是介于下标k和nextHighOrLow[k]之间的才算
                for(int t = k + 1; t < nextHighOrLow[k]; t++){
                    res += (height[k] - height[t]);
//                    System.out.println("test1: " + (height[k] - height[t]));
                }
                k = nextHighOrLow[k] - 1;
                //下一次循环k++后 k = nextHighOrLow[k]。
            }
        }
        //反向
        for(int k = n - 1; k >= 0; k--){
            if(nextHighOrLow[k] < k && nextHighOrLow[k] != -1){//注意第二个条件k && nextHighOrLow[k] != -1
                //洼地必须是介于下标nextHighOrLow[k]和k之间的才算
                for(int t = k - 1; t > nextHighOrLow[k]; t--){
                    res += (height[k] - height[t]);
//                    System.out.println("test2: " + (height[k] - height[t]));
                }
                k = nextHighOrLow[k] + 1;
                //下一次循环k--后 k = nextHighOrLow[k]。
            }
        }

        return res;
    }
}
// 0  1  2  3  4  5  6  7  8  9  10 11
// 0  1  0  2  1  0  1  3  2  1  2  1
// 1  3  3  7  7  7  7  -1 7  8  8  10
