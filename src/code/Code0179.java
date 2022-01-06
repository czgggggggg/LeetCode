package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/1/6
 * @Description
 */
public class Code0179 {
    public static void main(String[] args) {
        int[] nums1 = {10,2};
        System.out.println(largestNumber(nums1));//210
        int[] nums2 = {3,30,34,5,9};
        System.out.println(largestNumber(nums2));//9534330
        int[] nums3 = {1};
        System.out.println(largestNumber(nums3));//1
        int[] nums4 = {10};
        System.out.println(largestNumber(nums4));//10
        int[] nums5 = {0,0,0,0};
        System.out.println(largestNumber(nums5));//0
    }

    public static String largestNumber(int[] nums) {
//        Arrays.sort(nums);
        //按照字典顺序比较字符串的每个字符
        List<String> list = new ArrayList<>();
        for(int num : nums){
            list.add(String.valueOf(num));
        }
        Collections.sort(list, (a, b) -> aSmallthenB(a,b));
        //接着倒转所有元素的次序

        StringBuilder sb = new StringBuilder();

//        for(int i = nums.length - 1; i >= 0; i--){
//            sb.append(String.valueOf(nums[i] + " "));
//        }
        for(String str : list)
            sb.append(str);

        String res = sb.toString();

        //第一次提交错误的解决方法
        if(res.startsWith("00"))
            res = "0";

        return res;
    }

    public static int aSmallthenB(String a, String b){
        if((a + b).compareTo((b + a)) < 0)//!!!
            return 1;
        return -1;
    }

//4 > 1234
//----------
//3 > 30
//123 > 12   123 12 > 12 123
//12  > 121  12 121 > 121 12

    //v0.1       //3,30,34,5,9 -> 9 5 34 30 3 应该是：9 5 34 3 30     //3应该大于30
    //仅仅按照单纯的字典排序是不够的
//    public static String largestNumber(int[] nums) {
////        Arrays.sort(nums);
//        //按照字典顺序比较字符串的每个字符
//        List<String> list = new ArrayList<>();
//        for(int num : nums){
//            list.add(String.valueOf(num));
//        }
//        Collections.sort(list, String::compareTo);
//        //接着倒转所有元素的次序
//        Object[] objects = list.toArray();
//
//        StringBuilder sb = new StringBuilder();
//
////        for(int i = nums.length - 1; i >= 0; i--){
////            sb.append(String.valueOf(nums[i] + " "));
////        }
//        for(int i = objects.length - 1; i >= 0; i--)
//            sb.append(objects[i]);
//
//        return sb.toString();
//    }
//    //210
//    //9534303
//    //1
//    //10

}

//执行结果：解答错误
//通过测试用例：226 / 230
//输入：
//[0,0]
//输出：
//"00"
//预期结果：
//"0"

