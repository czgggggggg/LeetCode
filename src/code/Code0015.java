package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/1/4
 * @Description
 */
public class Code0015 {
    public static void main(String[] args) {
//        int[] nums = {-1,0,1,2,-1,-4};
//        List<List<Integer>> lists = threeSum(nums);//-1 -1 2   -1 0 1
//        int[] nums = {};
//        List<List<Integer>> lists = threeSum(nums);
//        int[] nums = {0};
//        List<List<Integer>> lists = threeSum(nums);
        int[] nums = {-4,-3,-2,-1,0,1,2,3,4,5,10,14};
        List<List<Integer>> lists = threeSum(nums);

        Iterator<List<Integer>> iterator = lists.iterator();
        while(iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while (iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();

        if(nums.length < 3)
            return lists;

        Arrays.sort(nums);
        int len = nums.length;
        int a, b, c;
        int found;

//        for(int i = 0; i < len; i++)
//            System.out.print(nums[i] + " ");
//        System.out.println();

        for(int i = 0; i < len - 2; i++){
            a = nums[i];
            for(int j = i + 1; j < len - 1; j++){
                b = nums[j];
                found = isFound(-a - b, nums, j + 1, len - 1);
                if(found != -1){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[found]);
                    if(!lists.contains(list))
                        lists.add(list);
                }
            }
        }
        return lists;
    }

    /**
     * 折半查找
     */
    public static int isFound(int num, int[] nums, int low, int high){
        int mid = (low + high) / 2;

        if(low > high)
            return -1;//没有找到

        if(num == nums[mid])
            return mid;
        if(num < nums[mid])
            return isFound(num,nums,low,mid - 1);
        else
            return isFound(num,nums,mid + 1,high);
    }

}
