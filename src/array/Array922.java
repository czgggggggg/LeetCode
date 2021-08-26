package array;

/**
 * @Author czgggggggg
 * @Date 2021/8/26
 * @Description
 */
public class Array922 {
    public static void main(String[] args) {
        int[] nums1 = {4,2,5,7};
        nums1 = sortArrayByParityII(nums1);
        for(int i = 0; i < nums1.length; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
        int[] nums2 = {1,0,3,2,5,4};
        nums2 = sortArrayByParityII(nums2);
        for(int i = 0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();
        int[] nums3 = {0,1,0,1,0,0,1,1,1,0,1,1,0,0};
        nums3 = sortArrayByParityII(nums3);
        for(int i = 0; i < nums3.length; i++)
            System.out.print(nums3[i] + " ");
        System.out.println();
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int i = 0;//偶数下标指针
        int j = 1;//奇数下标指针
        int tmp;
        for(int k = 0; k < nums.length; k++){
            if(k % 2 == 0){
                if(nums[k] % 2 == 1){//偶数位却放着一个奇数
                    //应该把当前的奇数放到奇数位去
                    while (nums[j] % 2 == 1){//当前奇数位存放的是奇数，则把奇数放到下一个奇数位
                        j += 2;
                        if(j >= nums.length)
                            break;
                    }
                    if(i < nums.length){
                        //此时奇数位存放的是一个偶数
                        tmp = nums[j];
                        nums[j] = nums[k];
                        nums[k] = tmp;
                    }
                }
            }
            if(k % 2 == 1){
                if(nums[k] % 2 == 0){//奇数位却放着一个偶数
                    //应该把当前的偶数放到偶数位去
                    while(nums[i] % 2 == 0){//当前偶数位存放的是偶数，则把偶数放到下一个偶数位
                        i += 2;
                        if(i >= nums.length)
                            break;
                    }
                    if(i < nums.length){
                        //此时偶数位存放的是一个奇数
                        tmp = nums[i];
                        nums[i] = nums[k];
                        nums[k] = tmp;
                    }
                }
            }
        }
        return nums;
    }
}
//输入：[4,2,5,7]
//输出：[4,5,2,7]

//[1,0,3,2,5,4]
//