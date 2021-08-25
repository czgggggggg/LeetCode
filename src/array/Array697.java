package array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/**
 * @Author czgggggggg
 * @Date 2021/8/25
 * @Description
 */
public class Array697 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3,1};//2
        System.out.println(findShortestSubArray(nums1));
        int[] nums2 = {1,2,2,3,1,4,2};//6
        System.out.println(findShortestSubArray(nums2));
        int[] nums3 = {1};//1
        System.out.println(findShortestSubArray(nums3));
        int[] nums4 = {2,1};//1
        System.out.println(findShortestSubArray(nums4));
        int[] nums5 = {1,1};//2
        System.out.println(findShortestSubArray(nums5));
        int[] nums6 = {1,2,3};//1
        System.out.println(findShortestSubArray(nums6));
    }
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.keySet().contains(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        int num;
        for(Integer integer: map.keySet()){
            num = map.get(integer);
            if(num == max){
                stack.push(integer);
            }
            else if(num > max){
                max = num;
                stack.clear();
                stack.push(integer);
            }
        }
        Iterator<Integer> iterator = stack.iterator();
        int minLength = Integer.MAX_VALUE;
        while(iterator.hasNext()){
//            System.out.println("test---iterator---" + iterator.next());
            Integer currentNumber = iterator.next();
//            System.out.println("test---currentNumber---" + currentNumber);

            if(map.get(currentNumber) == 1)//第一次提交错误，原因是少了这个判断处理。用例：nums = [2,1] [1,2,3] [1,2,3,4,5]
                return 1;

            boolean isFisrt = true;
            int firstIndex = 0;
            int lastIndex = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == currentNumber){
                    if(isFisrt){
                        firstIndex = i;
                        isFisrt = false;
                    }else{
                        lastIndex = i;
                    }
                }
            }

            if(minLength > (lastIndex - firstIndex)){
                minLength = lastIndex - firstIndex;
//                System.out.println("test---lastIndex---" + lastIndex);
//                System.out.println("test---firstIndex---" + firstIndex);
            }
        }
//        System.out.println("test---minLength---" + minLength);
        return minLength + 1;
    }
}
