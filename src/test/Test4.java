package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2022/4/12
 * @Description
 */
public class Test4 {
    static int res;
    static int n;
    static int sum;
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int k1 = 2;
        System.out.println(func(nums1,k1));//4
        int[] nums2 = {1,2,3};
        int k2 = 1;
        System.out.println(func(nums2,k2));//1
        int[] nums3 = {1,4,2,2};
        int k3 = 3;
        System.out.println(func(nums3,k3));//1
    }
    public static int func(int[] nums, int k){
        res = 0;
        n = nums.length;
        sum = 0;
        List<Integer> list = new ArrayList<>();
        dfs(nums, k, list, -1);

        return res;
    }
    public static void dfs(int[] nums, int k, List<Integer> list, int preIndex){
        if(list.size() == k){
            if(sum % 2 == 0)
                res++;
            return;
        }

        if(preIndex == n - 1)
            return;

        for(int i = preIndex + 1; i < n; i++){
            list.add(nums[i]);
            sum += nums[i];
            dfs(nums, k, list, i);
            list.remove(list.size() - 1);
            sum -= nums[i];
        }
    }
}
