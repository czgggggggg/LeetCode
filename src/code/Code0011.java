package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/14
 * @Description
 */
public class Code0011 {
    public static void main(String[] args) {
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height1));//49
        int[] height2 = {1,1};
        System.out.println(maxArea(height2));//1
        int[] height3 = {4,3,2,1,4};
        System.out.println(maxArea(height3));//16
        int[] height4 = {1,2,1};
        System.out.println(maxArea(height4));//2

        int[] height5 = {5,6,7,4,3,2,1};
        System.out.println(maxArea(height5));//12
        int[] height6 = {4,3,1,5,2,4};
        System.out.println(maxArea(height6));//20

        int[] height7 = {1,3,2,5,25,24,5};
        System.out.println(maxArea(height7));//12 -> 24

    }
    //v0.4 v0.2的修复版本  //无需比较面积、比较高度即可
    public static int maxArea(int[] height) {
        int len = height.length;
        int i = 0;//左指针
        int j = len - 1;//右指针
        int res = (j - i) * Math.min(height[i], height[j]);//最大面积&初始化
        while(i != j){
//            if(Math.min(height[i + 1], height[j]) >= Math.min(height[i], height[j - 1])){
//                i++;
//            }else{
//                j--;
//            }

//            if(height[i + 1] >= height[j - 1]){
//                i++;
//            }else{
//                j--;
//            }

            if(height[i] >= height[j]){
                j--;
            }else{
                i++;
            }
            res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
        }
        return res;
    }

    //v0.3 官方代码
//    public static int maxArea(int[] height) {
//        int l = 0, r = height.length - 1;
//        int ans = 0;
//        while (l < r) {
//            int area = Math.min(height[l], height[r]) * (r - l);
//            ans = Math.max(ans, area);
//            if (height[l] <= height[r]) {
//                ++l;
//            }
//            else {
//                --r;
//            }
//        }
//        return ans;
//    }

    //v0.2 通过30/60个测试样例、测试样例[1,3,2,5,25,24,5]出现错误。
//    public static int maxArea(int[] height) {
//        int len = height.length;
//        int i = 0;//左指针
//        int j = len - 1;//右指针
//        int res = (j - i) * Math.min(height[i], height[j]);//最大面积&初始化
//        while(i != j){
//            if(Math.min(height[i + 1], height[j]) >= Math.min(height[i], height[j - 1])){
//                i++;
//            }else{
//                j--;
//            }
//            res = Math.max(res, (j - i) * Math.min(height[i], height[j]));
//        }
//        return res;
//    }

    //v0.1 思路错误、废弃
//    public static int maxArea(int[] height) {
//        int len = height.length;
//        int[] maxHeight = new int[len];
//        int max = Integer.MIN_VALUE;
//        for(int i = len - 1; i >= 0; i++){
//            max = Math.max(max, height[i]);
//            maxHeight[i] = max;
//        }
//
//        int res = Integer.MIN_VALUE;
//        int area;
//        for(int i = 1; i < len; i++){
//            if(height[i - 1] <= maxHeight[i]){
//                area =
//            }
//        }
//    }
}

//执行结果：
//解答错误
//显示详情
//添加备注
//
//通过测试用例：
//30 / 60
//输入：
//[1,3,2,5,25,24,5]
//输出：
//15
//预期结果：
//24