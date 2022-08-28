package meituan;

import java.util.Arrays;

/**
 * @Author chaizhigang
 * @Date 2022/8/13
 */
public class Code0007 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = func(nums);
        System.out.println(Arrays.toString(result));//4,2,1,3

        int[] nums2 = {5,4,3,1,2};
        int[] result2 = func(nums2);
        System.out.println(Arrays.toString(result2));//4,1,5,2,3

        int[] nums3 = new int[100000];
        for (int i = 0; i < 100000; i++){
            nums3[i] = i + 1;
        }
        long start = System.currentTimeMillis();
        int[] result3 = func(nums3);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(Arrays.toString(result3));
    }
    public static int[] func(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 0);
        int i = 0;
        int cur = -1;
        int count = 0;
        while (i < n){
            cur++;
            cur %= n;
            if(result[cur] == 0){
                count++;
                if(count == 3){
                    result[cur] = nums[i];
                    i++;
                    count = 0;
                }
            }
        }
        return result;
    }
}
//0 1 2 3
//
