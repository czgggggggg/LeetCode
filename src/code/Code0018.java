package code;

import java.util.*;

/**
 * @Author czgggggggg
 * @Date 2022/2/27
 * @Description
 */
public class Code0018 {
    public static void main(String[] args) {
//        int[] nums = {1,0,-1,0,-2,2};
//        int target = 0;
        //-2 -1 1 2
        //-2 0 0 2
        //-1 0 0 1

        int[] nums = {2,2,2,2,2};
        int target = 8;
        //2 2 2 2

        List<List<Integer>> res = fourSum(nums, target);
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
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();//用来去重

        for(int i = 0; i < n - 3; i++){
            for(int j = i + 1; j < n - 2; j++){
                list.clear();
                list.add(nums[i]);
                list.add(nums[j]);
                int l = j + 1;
                int r = n - 1;
                while(l < r){
                    if(nums[i] + nums[j] + nums[l] + nums[r] == target){
                        list.add(nums[l]);
                        list.add(nums[r]);
                        if(!set.contains(list.toString())){
                            res.add(new ArrayList<>(list));
                            set.add(list.toString());
                        }
                        list.remove(list.size() - 1);
                        list.remove(list.size() - 1);
                        l++;
                        r--;
                    }else if(nums[i] + nums[j] + nums[l] + nums[r] < target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }

        return res;
    }
}
