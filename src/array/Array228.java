package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array228 {
    public static void main(String[] args) {
        int[] nums1 = {0,1,2,4,6,7,8,10};
        List<String> strings1 = summaryRanges(nums1);
        for(String string : strings1)
            System.out.print(string + " ");
        System.out.println();

        int[] nums2 = {0,1,2,4,5,7};
        List<String> strings2 = summaryRanges(nums2);
        for(String string : strings2)
            System.out.print(string + " ");
        System.out.println();

        int[] nums3 = {0,2,3,4,6,8,9,10};
        List<String> strings3 = summaryRanges(nums3);
        for(String string : strings3)
            System.out.print(string + " ");
        System.out.println();

        int[] nums4 = {};
        List<String> strings4 = summaryRanges(nums4);
        for(String string : strings4)
            System.out.print(string + " ");
        System.out.println();

        int[] nums5 = {-1};
        List<String> strings5 = summaryRanges(nums5);
        for(String string : strings5)
            System.out.print(string + " ");
        System.out.println();

        int[] nums6 = {0};
        List<String> strings6 = summaryRanges(nums6);
        for(String string : strings6)
            System.out.print(string + " ");
        System.out.println();
    }
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        int tmp1 = 0;
        int count = 0;
        String str;
        if(nums.length == 0)
            return list;
        if(nums.length == 1){
            list.add(String.valueOf(nums[0]));
            return list;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[tmp1] + count || i == nums.length - 1){//两种情况有可能同时满足，再继续分三种情况讨论
                if(i == nums.length - 1 && nums[i] == nums[tmp1] + count){//【1】只满足到最后
                    str = String.valueOf(nums[tmp1]) + "->" + String.valueOf(nums[i]);//
                    list.add(str);
                }
                else if(i != nums.length - 1 && nums[i] != nums[tmp1] + count){//【2】只是不满足元素间的条件
                    if(count == 1){
                        str = String.valueOf(nums[tmp1]);
                        list.add(str);
                    }else{
                        str = String.valueOf(nums[tmp1]) + "->" + String.valueOf(nums[i - 1]);
                        list.add(str);
                    }
                }
                else if(nums[i] != nums[tmp1] + count || i == nums.length - 1){//【3】同时满足两个条件
                    if(count == 1){
                        str = String.valueOf(nums[tmp1]);
                        list.add(str);
                        str = String.valueOf(nums[i]);
                        list.add(str);
                    }else{
                        str = String.valueOf(nums[tmp1]) + "->" + String.valueOf(nums[i - 1]);
                        list.add(str);
                        str = String.valueOf(nums[i]);
                        list.add(str);
                    }
                }
                tmp1 = i;
//                System.out.println("nums[tmp1]---" + nums[tmp1]);
                count = 1;
            }else{
                count++;
            }
        }
        return list;
    }
}
//0,1,2,4,6,7,8,10
//0,1,2,4,6,7,8,10,11

//System.out.println("test1---" + nums[tmp1] + "---" + nums[i] + "---" + count);