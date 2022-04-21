package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Code0015_2 {
    public static void main(String[] args) {
//        int[] nums = {-1,0,1,2,-1,-4};
//        int[] nums = {};
        int[] nums = {0};
        List<List<Integer>> res = threeSum(nums);
        Iterator<List<Integer>> iterator = res.iterator();
        while(iterator.hasNext()){
            List<Integer> next = iterator.next();
            Iterator<Integer> iterator1 = next.iterator();
            while(iterator1.hasNext()){
                System.out.print(iterator1.next() + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        int n = nums.length;
        if(n < 3)
            return res;

        Arrays.sort(nums);
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                boolean b = find(nums, 0 - nums[i] - nums[j], j + 1, n - 1);
                if(b){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(0 - nums[i] - nums[j]);
                    String str = list.toString();
                    if(!set.contains(str)){
                        set.add(str);
                        res.add(list);
                    }
                }
            }
        }

        return res;
    }
    public static boolean find(int[] nums, int target, int left, int right){
        if(left > right)
            return false;

        int mid = (left + right) / 2;
        if(nums[mid] == target)
            return true;
        if(nums[mid] > target)
            return find(nums, target, left, mid - 1);
        if(nums[mid] < target)
            return find(nums, target, mid + 1, right);

        return true;//
    }
}
