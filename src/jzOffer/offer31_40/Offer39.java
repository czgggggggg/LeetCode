package jzOffer.offer31_40;

import java.util.HashMap;

/**
* @Author czgggggggg
* @Date 2021/2/20
* @Description 数组中出现次数超过一半的数字
* @Since version-1.0
*/
public class Offer39 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int[] nums2 = {1};
        int[] nums3 = {1, 2, 2};
        int[] nums4 = {2, 2, 1};
        System.out.println(majorityElement(nums));
        System.out.println(majorityElement(nums2));
        System.out.println(majorityElement(nums3));
        System.out.println(majorityElement(nums4));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int count = hashMap.getOrDefault(nums[i], 0);
            hashMap.put(nums[i], ++count);
            if(count > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    }
}
