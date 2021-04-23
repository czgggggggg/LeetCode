package jzOffer.offer21_30;
/**
* @Author czgggggggg
* @Date 2021/2/15
* @Description 调整数组顺序使奇数位于偶数前面
* @Since version-1.0
*/
public class Offer21 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums_tmp = exchange(nums);
        for(int i = 0; i < nums_tmp.length; i++)
            System.out.print(nums_tmp[i] + " ");
        System.out.println();
    }
    //分析：思路（记录数组nums中的奇数个数。
    //            用一个新的数组nums_tmp来作为调整后的数组。
    //            0为奇数在nums_tmp中的起始下标，
    //            odd_count为偶数在nums_tmp中的起始下标，
    //            遍历nums中的元素，根据元素是奇数还是偶数，放入nums_tmp中。）
    //关键是新数组中设置两个变量。
    public static int[] exchange(int[] nums) {
        int odd_count = 0;//奇数的个数
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 1)
                odd_count++;
        }

        int[] nums_tmp = new int[nums.length];//调整后的数组（奇数在前，偶数在后）
        int p1 = 0;//奇数在nums_tmp中的起始下标
        int p2 = odd_count;//偶数在nums_tmp中的起始下标
        for(int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 1)
                nums_tmp[p1++] = nums[i];
            else
                nums_tmp[p2++] = nums[i];
        }
        return nums_tmp;
    }
}