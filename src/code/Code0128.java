package code;

import java.util.HashSet;

/**
 * @Author chaizhigang
 * @Date 2022/8/21
 */
public class Code0128 {
    public static void main(String[] args) {
        int[] nums1 = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums1));//4
        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums2));//9
        int[] nums3 = {0};
        System.out.println(longestConsecutive(nums3));//1
        int[] nums4 = {0,0};
        System.out.println(longestConsecutive(nums4));//1
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int curLen = 0, longestLen = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                curLen = 1;
                while (set.contains(++num)){
                    curLen++;
                }
                longestLen = Math.max(longestLen, curLen);
            }else{
                continue;
            }
        }
        return longestLen;
    }
}
