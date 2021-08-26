package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/26
 * @Description
 */
public class Array905 {
    public static void main(String[] args) {
        int[] nums1 = {3,1,2,4};
        nums1 = sortArrayByParity(nums1);
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        int[] nums2 = {1,3};//{9,8,7,6,5,4,3,2}    {1,3}第一次提交没有AC的样例。
        nums2 = sortArrayByParity(nums2);
        for(int i = 0; i < nums2.length; i++){
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int tmp;
        while(i < j){
            if(nums[i] % 2 == 1){//nums[i]是奇数，应该移到数组后面
                while(nums[j] % 2 == 1){//越过后面是奇数的数字（不用交换）
                    j--;
                    if(j < 0)//第一次提交错误的地方：没有考虑j--会导致j越界
                        break;
                }
                if(i < j){//如果此时i仍然小于j，因为nums[i]是奇数，nums[j]是偶数，则直接交换两个数字
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    i++;
                    j--;
                }
            }else{//nums[i]是偶数，越过不做处理
                i++;
            }
        }
        return nums;
    }
}
