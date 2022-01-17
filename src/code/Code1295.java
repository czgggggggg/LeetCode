package code;

/**
 * @Author czgggggggg
 * @Date 2022/1/16
 * @Description
 */
public class Code1295 {
    public static void main(String[] args) {
        int[] nums1 = {12,345,2,6,7896};
        System.out.println(findNumbers(nums1));
        int[] nums2 = {555,901,482,1771};
        System.out.println(findNumbers(nums2));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000)
                count++;
        }
        return count;
    }
}
