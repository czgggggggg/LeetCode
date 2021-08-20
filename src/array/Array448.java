package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author czgggggggg
 * @Date 2021/8/20
 * @Description
 */
public class Array448 {
    public static void main(String[] args) {
//        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums = {1,1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        for(Integer integer : disappearedNumbers){
            System.out.print(integer + " ");
        }
        System.out.println();
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] countArr = new int[nums.length];
        Arrays.fill(countArr,0);
        for(int i = 0; i < nums.length; i++){
            countArr[nums[i] - 1]++;
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < countArr.length; i++){
            if(countArr[i] == 0)
                list.add(i + 1);
        }

        return list;
    }
}
